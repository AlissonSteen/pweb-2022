let n1 = parseInt(prompt("Digite o primeiro numero:"));
let n2 = parseInt(prompt("Digite o segundo numero:"));
let n3 = parseInt(prompt("Digite o terceiro numero:"));

if((n1 < n2) && (n1 < n3)){

    document.write(n1);
    if(n2 < n3){

        document.write(n2);
        document.write(n3);

    }else{

        document.write(n3);
        document.write(n2);

    }

}else if((n2 < n1) && (n2 < n3)){

    document.write(n2);
    if(n1 < n3){

        document.write(n1);
        document.write(n3);

    }else{

        document.write(n3);
        document.write(n1);

    }

}else{

    document.write(n3);
    if(n1 < n2){

        document.write(n1);
        document.write(n2);

    }else{

        document.write(n2);
        document.write(n1);

    }

}

