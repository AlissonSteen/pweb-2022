let anos = parseInt(prompt("Anos fumando:"));
let cig_Dia = parseInt(prompt("Cigarros por dia:"));
let ca20 = parseFloat(prompt("Valor da carteira de cigarro:"))


document.write("Dinheiro gasto: R$" + ((ca20 /20) * (cig_Dia * (anos * 365))));
