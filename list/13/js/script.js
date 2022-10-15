let n = parseInt(prompt("Digite um valor:"));

let t = false;
let i = 1;
let soma = 0;


while((i < (n/2) + 1) && (t != true) && soma <= n){

    soma = i * (i+1) * (i+2) ;

    if((soma == n)){
        t = true;
    };

    document.write(soma + "<br>")
    i+= 1;

};

document.write(n + " é um número triângulo? ->" + t);
