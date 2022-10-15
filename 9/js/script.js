let x = parseInt(prompt("Digite um numero:"));
let primo = true;
let i;

for (i = 2; i < x; i++){
    if((x%i) == 0){

        primo = false;
    
    }
}

document.write("Primo:" + primo);
