let x = parseInt(prompt("Número inteiro:"));
let y = parseInt(prompt("Número para elevar a potencia:"));

let elev = x;

if((y != 0) & (y > 0)){
	for(let i = 1; i < y; i++){
		
		elev = elev * x;
		
	}
}else if(y == 0){

	elev = 1;

}


document.write(elev);