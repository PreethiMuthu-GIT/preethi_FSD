const cartIcon = document.querySelector("#cart-icon")
const cart = document.querySelector(".cart")
const cartClose = document.querySelector("#cart-close")
cartIcon.addEventListener("click", () => cart.classList.add("active"));
cartClose.addEventListener("click", () => cart.classList.remove("active"));
let menudata = [];

function fetchData() {
    fetch("https://www.myjsons.com/v/itemsmenu")
        .then(response => response.json())
        .then(data => {
            menudata = data;
            console.log(data)
            displayItemCards();
        })
}

function displayItemCards() {
    const itemCards = document.getElementById("product-content");
    let cardHTML = "";
    menudata.forEach(item => {
        cardHTML += `
               <div class="product-box">
                <div class="img-box">
                    <img src=${item.image} alt=${item.name}>
                </div>
                <h2 class="product-title">${item.name}</h2>
                <div class="price-and-cart">
                    <span class="price">$${item.price}</span>
                    <button onclick="addToOrder(${item.id})"><i class="ri-shopping-bag-line add-cart" ></i></button>
                </div>
            </div>`;
    });
    itemCards.innerHTML = cardHTML;
}
function addToOrder(item_id) {
    //console.log(item_id)
    //console.log("inside card")
    const item = menudata.find(item => item.id === item_id);
    if (item) {
        //console.log("inside if")
        Order.addItem(item);
    }
}

const Order = {
    items: [],
    // Load cart from localStorage
    loadCart: function () {
        const storedCart = localStorage.getItem("cartItems");
        if (storedCart) {
            this.items = JSON.parse(storedCart).filter(item => item.quantity > 0);
            
            // Calculate total item count from stored cart
            let totalQuantity = this.items.reduce((sum, item) => sum + item.quantity, 0);
            
            // Update cart badge with correct count
            updateCartCount(totalQuantity - cartItemCount);  
    
            updateOrderDisplay();
        }
    },
    
    

    // Save cart to localStorage
    saveCart: function () {
        localStorage.setItem("cartItems", JSON.stringify(this.items));
    },
    
    addItem: function (item) {
        const Exisiting = this.items.find(i => i.id === item.id);
        if (Exisiting) {
            Exisiting.quantity++;
        }
        else {
            const newItem = { ...item, quantity: 1 };
            //console.log("insode")
            this.items.push(newItem);
        }
        this.saveCart();
        updateOrderDisplay();
        updateCartCount(1);
    },
    incItem: function (item_id) {
        const item = this.items.find(i => i.id === item_id)
        if (item) {
            item.quantity++;
            this.saveCart();
            updateOrderDisplay();
        }
    },
    decItem: function (item_id) {
        const item = this.items.find(i => i.id === item_id)
        if (item) {
            item.quantity--;
            this.saveCart();
            updateOrderDisplay();
        }
    },
    calculateTotal: function () {
        let total = 0;
        //console.log(total)
        this.items.forEach(item => {
            //console.log(item.quantity)
            total += (item.price) * (item.quantity)
            //console.log(total)
        })
        return "$" + total.toFixed(2);
    },
    removeCart: function (item_id) {
        const itemIndex = this.items.findIndex(item => item.id === item_id);
        if (itemIndex !== -1) {
            const item = this.items[itemIndex];
            // Decrease the cart count by the number of items removed
            updateCartCount(-item.quantity);
            // Remove the item from the array
            this.items.splice(itemIndex, 1);
            // Save updated cart to localStorage
        this.saveCart();
        }
        // Update the cart display
        updateOrderDisplay();
        // Check if the cart is empty and display a message
        const orderDisplay = document.getElementById("cart-content");
        if (this.items.length === 0) {
            orderDisplay.innerHTML = "<h3>Your Cart is Empty</h3>";
            document.getElementById("total-price").textContent = "$0";
        }
    }


}

function updateOrderDisplay() {
    //console.log("inside update")
    const orderDisplay = document.getElementById("cart-content")
    if (Order.items.length === 0) {
        orderDisplay.innerHTML = "<h3>Your Cart is Empty</h3>"
    }
    else {
        let orderHTML = "";
        Order.items.forEach(item => {
            orderHTML += `<div class="cart-box">    
                <img src=${item.image}  class="cart-img">
                <div class="cart-detail">
                    <h2 class="cart-product-title">${item.name}</h2>
                    <span class="cart-price">$${item.price}</span>
                    <div class="cart-quantity">
                        <button id="decrement" onclick="Order.decItem(${item.id})">-</button>
                        <span class="number">${item.quantity}</span>
                        <button id="increment" onclick="Order.incItem(${item.id})">+</button>
                    </div>
                </div>
                <button onclick="Order.removeCart(${item.id})"><i class="ri-delete-bin-line cart-remove"></i></button>
            </div>`;
        });
        orderDisplay.innerHTML = orderHTML;
    }
    document.getElementById("total-price").textContent = Order.calculateTotal();


}

// adding count on cart icon

let cartItemCount = 0
const updateCartCount = change => {
    const cartItemCountBadge = document.querySelector(".cart-item-count")
    cartItemCount += change
    if (cartItemCount > 0) {
        cartItemCountBadge.style.visibility = "visible"
        cartItemCountBadge.textContent = cartItemCount
    }
    else {
        cartItemCountBadge.style.visibility = "hidden"
        cartItemCountBadge.textContent = ""
    }
}







// Load cart from localStorage when page loads
document.addEventListener('DOMContentLoaded', () => {
    Order.loadCart();
    fetchData();
});

