const form = document.getElementById("form")
const uname = document.getElementById("uname")
const email = document.getElementById("email")
const password = document.getElementById("password")
const cpassword = document.getElementById("cpassword")
const tandc = document.getElementById("tc")

form.addEventListener("submit", e=>{
    e.preventDefault()
    if(Validite()){
        window.location.href="login.html"
    }
})

function validate(){
    let isvalid = true
    let nameValue = uname.value.trim();
    let emailvalue = email.value.trim();
    let passwordValue = password.value.trim();
    let cpasswordValue = cpassword.value.trim();

    //uname check validation

if (nameValue === ""){
    setError(uname,"username cannot be empty")
    isvalid = false
}
else if (nameValue.length<3){
    setError(uname,"Username should be minimum value is 3")
    isvalid = true
}
else{
    setSuccess(uname)
}
}


function setError(input,message){
    let parent = input.parentElement;
    let small = parent.querySelector("small")
    small.innerText = message
    parent.classlist.add("error")
    parent.classlist.add("success")
}
function setSuccess(input){
    let parent = input.parentElement
    parent.classlist.add("success")
    parent.classlist.add("errror")
}

54.44 time
