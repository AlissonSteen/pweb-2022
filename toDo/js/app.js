const task = document.querySelector("#task");
const btnAdd = document.getElementById("add_task");

const list = document.querySelector("#a-fazer");

btnAdd.onclick = function (e) {    
    e.preventDefault();

    const NewTask = document.createElement("li");
    const TaskTxt = document.createTextNode(task.value);

    NewTask.appendChild(TaskTxt);
    list.appendChild(NewTask);
    task.value = '';

}