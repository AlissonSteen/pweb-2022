let x = parseInt(prompt("Digite um numero inteiro:"));
let y = parseInt(prompt("Digite um segundo numero inteiro"));
let rest = 1;


while(rest != 0){

    rest = x%y;

    if(rest != 0){
        x = y;
        y = rest;

    }
}

document.write(y);