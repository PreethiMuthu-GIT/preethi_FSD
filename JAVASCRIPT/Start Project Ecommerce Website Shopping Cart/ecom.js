// get cart-icon cart cart-close 

const cartIcon =document.querySelector("#cart-icon")
const cart = document.querySelector(".cart")
const cartClose = document.querySelector("#cart-close")
//console.log(cartIcon)
//console.log(cart)
//console.log(cartClose)

//cartIcon and cartclose functions

cartIcon.addEventListener("click", () => cart.classList.add("active"));
cartClose.addEventListener("click", ()  =>cart.classList.remove("active"));

//get add cart element

const addCartButtons = document.querySelectorAll(".add-cart");
//console.log(addCartButtons)
addCartButtons.forEach(button =>{
    button.addEventListener("click", event =>{
        const productBox = event.target.closest(".product-box")
            //event.target===Refers to the specific element (button) that was clicked.
        //console.log(productBox)
        addToCart(productBox)
    })
})

//addToCart(productBox) function

const cartContent = document.querySelector(".cart-content")

const addToCart = productBox =>{
    const productImgSrc = productBox.querySelector("img").src
    const productTitle = productBox.querySelector(".product-title").textContent
    const productPrice = productBox.querySelector(".price").textContent

    // prevents duplication of products while adding to cart

    const cartItems = cartContent.querySelectorAll(".cart-product-title")
    //console.log(cartItems)
    for(let item of cartItems){
        if (item.textContent === productTitle){
            alert("this Item is already in the cart...");
            return;
        }
    }

    const cartBox = document.createElement("div")
    cartBox.classList.add("cart-box")
    cartBox.innerHTML = `
                <img src="${productImgSrc}"  class="cart-img">
                <div class="cart-detail">
                    <h2 class="cart-product-title">${productTitle}</h2>
                    <span class="cart-price">${productPrice}</span>
                    <div class="cart-quantity">
                        <button id="decrement">-</button>
                        <span class="number">1</span>
                        <button id="increment">+</button>
                    </div>
                </div>
                <i class="ri-delete-bin-line cart-remove"></i>`;
    cartContent.appendChild(cartBox)

    //removing products from cart
    cartBox.querySelector(".cart-remove").addEventListener("click", () =>{
        cartBox.remove()

        updateCartCount(-1)
        
        updateTotalPrice()
    })

    //increasing or decreasing quantity

    cartBox.querySelector(".cart-quantity").addEventListener("click", event =>{
        const numberElement = cartBox.querySelector(".number")
        const decrementButton = cartBox.querySelector("#decrement")
        let quantity = numberElement.textContent

        if(event.target.id ==="decrement" && quantity > 1){
            quantity--;
            if (quantity === 1){
                decrementButton.style.color = "#999"
            }
        }
        else if(event.target.id === "increment"){
            quantity++;
            decrementButton.style.color ="#333"
        }
        numberElement.textContent =quantity;
        updateTotalPrice()
    })

    updateCartCount(1)

    updateTotalPrice()
}

//update total price

const updateTotalPrice = ()=>{
    const totalPriceElement = document.querySelector(".total-price")
    //console.log(totalPriceElement)
    const cartBoxes = cartContent.querySelectorAll(".cart-box")
    //console.log(cartBoxes)
    let total = 0;
    cartBoxes.forEach(cartBox =>{
        const priceElement = cartBox.querySelector(".cart-price")
        const quantityElement = cartBox.querySelector(".number")
        const price = priceElement.textContent.replace("$","")
        const quantity = quantityElement.textContent
        total = total + (price * quantity)
    })
    totalPriceElement.textContent = `$${total}`
}

// adding count on cart icon

let cartItemCount = 0
const updateCartCount = change =>{
    const cartItemCountBadge = document.querySelector(".cart-item-count")
    cartItemCount += change
    if(cartItemCount > 0){
        cartItemCountBadge.style.visibility = "visible"
        cartItemCountBadge.textContent = cartItemCount
    }
    else{
        cartItemCountBadge.style.visibility = "hidden"
        cartItemCountBadge.textContent = ""
    }
}

// BUY NOW 

const buyNowButtton = document.querySelector(".btn-buy")
buyNowButtton.addEventListener("click", ()=>{
    const cartBoxes = cartContent.querySelectorAll(".cart-box")
    console.log(cartBoxes)
    if (cartBoxes.length === 0){
        alert("Your cart is empty..please add items to your cart before buying.")
        return;
    }

    cartBoxes.forEach(cartBox => cartBox.remove())

    cartItemCount = 0
    updateCartCount(0)
    
    updateTotalPrice()

    alert("Thank you for your purchase!")
})

















/* Checkout
const modal = document.getElementById("receipt-modal");
const receiptDetails = document.getElementById("receipt-details");

document.getElementById("checkout-btn").addEventListener("click", () => {
  receiptDetails.innerHTML = cart.map(
    (item) => `${item.name} - $${item.price.toFixed(2)} x ${item.quantity}`
  ).join("<br>");
  modal.classList.remove("hidden");
});

document.getElementById("confirm-btn").addEventListener("click", () => {
  alert("Purchase confirmed!");
  cart = [];
  displayCart();
  modal.classList.add("hidden");
});

document.getElementById("close-modal-btn").addEventListener("click", () => {
  modal.classList.add("hidden");
});
*/
