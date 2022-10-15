let x = parseInt(prompt("Digite um número:"));

let f1 = 0;
let f2 = 1;
let fb = f1 + f2;

document.write(f1 + "<br>" + f2 + "<br>" + fb + "<br>");

for(let  i = 2; i < x; i++){

    f1 = f2;
    f2 = fb;
    fb = f1 + f2;

    document.write(fb + "<br>")

};