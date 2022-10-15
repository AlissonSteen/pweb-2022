let n = parseInt(prompt("Digite um numero:"));


for( let i =0; i < n; i ++){

    if(((n%i) == 0)){

        document.write("Divisor:" + i + "<br>");

    }

};