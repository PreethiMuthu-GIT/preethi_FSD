

    document.addEventListener("DOMContentLoaded",function(){
    const taskInput=document.getElementById("taskInput")
    const addtask=document.getElementById("addtask")
    const tasklist=document.getElementById("tasklist")



    addtask.addEventListener("click",function(){
        const tasktext=taskInput.value.trim()
        if (tasktext !== " "){
            const listitem= document.createElement("li")
            listitem.innerHTML=`${tasktext} <button class="delete-btn">Delete</button> <button class="edit-btn">Edit</button> `
            tasklist.appendChild(listitem)
            taskInput.value=""

            const deleteBtn=listitem.querySelector(".delete-btn");
            deleteBtn.addEventListener("click", function(){
                tasklist.removeChild(listitem);
            })

            const editBtn=listitem.querySelector(".edit-btn");
            editBtn.addEventListener("click",function(){
                const li=editBtn.parentElement
                const currentTask=li.firstChild.textContent.trim()
                const newTask=taskInput.value;

                if (newTask !== null && newTask.trim() !== '') {
                    li.firstChild.textContent = newTask;
                } else if (newTask !== null) {
                    alert('Task cannot be empty.');
                }
               
            })



        }


    })

    });


   /* const editBtn=listitem.querySelector(".edit-btn");
    editBtn.addEventListener("click",function(){
        const li=editBtn.parentElement
        const currentTask=li.firstChild.textContent.trim()
        const newTask= prompt('Edit your task:', currentTask);

        if (newTask !== null && newTask.trim() !== '') {
            li.firstChild.textContent = newTask;
        } else if (newTask !== null) {
            alert('Task cannot be empty.');
        }
            */
    