let selectedCard = null;

function selectedCustomerType(type){
    console.log(type)
    const divCards = document.querySelectorAll(".card");
    divCards.forEach(card=> card.classList.remove('selected-card'))
    console.log(divCards)
    selectedCard = document.getElementById(type+'Card')
    selectedCard.classList.add('selected-card')
    console.log(selectedCard);
    document.body.dataset.customerType=type;
}

function calculateTotal(){
    const coffeeType = document.getElementById('coffeeType').value;
    const coffeeSize = document.getElementById('coffeeSize').value;
    const quantity = parseInt(document.getElementById('quantity').value);
    const whippedcream = document.getElementById('whippedcream').checked?0.5:0;
    const extrashot = document.getElementById('extrashot').checked?1:0;
    const syrup = document.getElementById('syrup').checked?0.75:0;
    const promocode = document.getElementById('promocode').value;
    
    const prices={
        latte:{small:3,medium:4,large:5},
        espresso:{small:3.5,medium:4,large:5.5},
        mocha:{small:3.5,medium:4,large:5},
    };

    const discounts = {
        gold:0.2,
        silver:0.1,
        regular:0
    }
    const taxRate=0.07;
    const promoDiscounts = promocode==='COFFEE10'?0.1:0;

    const basePrice=prices[coffeeType][coffeeSize]*quantity;
    const addons = (whippedcream+extrashot+syrup)*quantity;
    const subTotal = basePrice+addons;
    const discountCalculation = discounts[document.body.dataset.customerType];
    const discount = subTotal*discounts[document.body.dataset.customerType]
    const tax = (subTotal-discount)*taxRate;
    const total=(subTotal-discount+tax)*(1-promoDiscounts);


    document.getElementById("summaryCoffee").textContent=`Coffe: ${coffeeType} (${coffeeSize})`;
    document.getElementById("summaryQuantity").textContent=`Quantity: ${quantity}`
    document.getElementById("summaryAddons").textContent=`Add-Ons: ${addons}`
    document.getElementById("subtotal").textContent=`${subTotal.toFixed(2)}`
    document.getElementById("discount").textContent=` ${discount.toFixed(2)}`
    document.getElementById("tax").textContent=`${tax.toFixed(2)}`
    document.getElementById("total").textContent=`${total.toFixed(2)}`

    document.getElementById('result').style.display='block';
}

function printInvoice(){
    
    window.print();
}

{/* <body>
  <h1>Click the Button to Open a New Page and Print</h1>
  <button onclick="openAndPrintPage()">Open and Print New Page</button>

  <script>
    function openAndPrintPage() {
      // Open a new window or page
      const newWindow = window.open('https://example.com', '_blank');
      
      // Wait for the page to load, then print
      newWindow.onload = function() {
        newWindow.print();
      };
    }
  </script>
</body>
</html> */}
