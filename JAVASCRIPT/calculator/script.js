let output=document.getElementById("output")

function display(num){
    output.value=output.value+num
    console.log(output.value)
}
 function Clear(){
    output.value = ""
}
function del(){
    output.value=output.value.slice(0,-1)
}
function calcul(){  
    output.value=eval(output.value)  
}
 
