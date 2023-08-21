/*
Descrição
Neste desafio, você criará uma solução para um sistema bancário utilizando conceitos de orientação a objetos.
 A implementação solicitada pela equipe de desenvolvimento da empresa bancária, gostaria de fosse realizado
  uma melhoria no sistema de registros, onde é recebido os dados brutos dos registros bancários. O objetivo é
   obter as informações de uma forma mais amigavel para o cliente e não oferecer informações brutas.

Considere que cada transação é representada por apenas uma string contendo as seguintes informações:

data,hora,descricao,valor
Dessa forma, crie uma classe representando as Transacoes e nela será recebido os atributos necessários para
 guardar as informações, ao fim, retorne o registro contendo a data, hora e valor da transação.

Entrada
A entrada será a representação de um registro (string) no formato e sequencia: "data,hora,descricao,valor".

Saída
A saída deve ser o valor do registro (string) recebido na entrada informando a transação efetuada, contendo,
 descrição, data, hora e valor da transação, como no exemplo da tabela a baixo.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se
 de testar seu programa com esses exemplos e com outros casos possíveis.
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val entrada = scanner.nextLine()
    val partes = entrada.split(",".toRegex()).toTypedArray()

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
    val transacao = Transacao(partes[0],
        partes[1],
        partes[2],
        partes[3].toDouble()
    )

    transacao.imprimir()
}

class Transacao(
    private val data: String,
    private val hora: String,
    private val descricao: String,
    private val valor: Double
) {

    fun imprimir() {
        println(descricao)
        println(data)
        println(hora)
        System.out.printf("%.2f", valor)
    }
}
