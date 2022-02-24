fun main(args: Array<String>) {

//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre:

- A soma dos números digitados.
- A média deles
- O menor número digitado
- O maior número digitado

var num = 0
var soma = 0
var cont = 0
var media = 0.0
var menor = 0
var maior = 0

do{

    print("Digite um número diferente de 0: ")
    num = readLine()!!.toInt()

    if(cont == 0)

        if(num != 0){

            soma += num

            if(cont == 0){
                maior = num
                menor = num
            }else{
                if(num > maior){
                    maior = num
                }

                if(num < menor){
                    menor = num
                }
            }

            cont++
        }

    while(num != 0)

        media = soma/cont.toDouble()

    println("A soma de todos os números é $soma")
    println("A média dos números é $media")
    println("O menor número é $menor")
    println("O maior número é $maior")
}