let overlay=document.querySelector(".overlay")
let popupbox=document.querySelector(".popupbox")
let addbtn=document.querySelector(".addbtn")


addbtn.addEventListener("click",function(){
    overlay.style.display="block"
    popupbox.style.display="block"
})

let addButton=document.getElementById("addButton")
let cancelButton=document.getElementById("cancelButton")
let booktitle=document.getElementById("booktitle")
let bookauthor=document.getElementById("bookauthor")
let shortdes=document.getElementById("shortdes")
let container=document.querySelector(".container")

addButton.addEventListener("click",function(event){
    event.preventDefault()
    let div=document.createElement("div")
    div.setAttribute("class","boxContainer")
    div.innerHTML=`<h3>${booktitle.value}</h3>
        <h5>${bookauthor.value}</h5>
        <p>${shortdes.value}</p>
        <button onclick="deleteButton(event)">Delete</button>`
        container.append(div)
        overlay.style.display="none"
        popupbox.style.display="none"
})

cancelButton.addEventListener("click",function(event){
    event.preventDefault()
    overlay.style.display="none"
    popupbox.style.display="none"
})

function deleteButton(event){
    event.target.parentElement.remove()
}