let i = parseInt(prompt("Exame I:"));
let ii = parseInt(prompt("Exame II:"));
let iii = parseInt(prompt("Exame III:"));
let iv = parseInt(prompt("Exame IV:"));
let v = parseInt(prompt("Exame V:"));

if((i >= 70) && (ii >= 70) && (iii >= 70) && (iv >= 70) && (v >= 70)){

    document.write("Situation: A");

}else if((i >= 70) && (ii >= 70) && ~(iii >= 70) && (iv >= 70) && ~(v >= 70)){

    document.write("Situation: B");

}else if(((i >= 70) && (ii >= 70)) && ((iii >= 70) || (iv >= 70)) && ~(v >= 70)){

    document.write("Situation: C");

}else{

    document.write("Situation: Reprovado");

}



