let x = parseInt(prompt("Digite um número inteiro positivo:"));
let y;
let i;

if (x == 0) {

	y = 1;

} else {
	y = x;
	i = x - 1;

	while (i > 0) {

		y = y * i
		i -= 1;

	};

}

document.write(y);