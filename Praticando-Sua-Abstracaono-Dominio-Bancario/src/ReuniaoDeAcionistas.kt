/*
Descrição
Durante uma reunião de acionistas, alguns pontos importantes são discutidos e com isso surge a
necessidade do envolvimento da equipe de desenvolvedores. Com isso, você foi designado para criar
uma interface que permitirá aos acionistas de uma empresa acessarem informações relevantes sobre as
análises da organização bancária. Sua tarefa é implementar uma classe que representa essa interface
e que fornece um método para consultar as análises de desempenho e outros tipos dentro de um determinado período.

Requisitos:

A classe deve ter um método chamado obterAnalisesDesempenho que recebe como parâmetros uma data inicial e uma data final.

Entrada
As datas inicial e final, no formato "dd/mm/aaaa", representando o intervalo de tempo desejado para consulta.

Saída
Uma lista contendo as análises de desempenho financeiro realizadas dentro do período especificado.


 */

import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val dataInicial = scanner.nextLine()
    val dataFinal = scanner.nextLine()

    val sistemaAcionistas = SistemaAcionistas()
    val analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal)

    for (analise in analises) {
        println(analise)
    }
}

class SistemaAcionistas {
    fun obterAnalisesDesempenho(dataInicialStr: String, dataFinalStr: String): List<String> {
        val df = SimpleDateFormat("dd/MM/yyyy")
        val dataInicial = df.parse(dataInicialStr)
        val dataFinal = df.parse(dataFinalStr)

        val analises = mutableListOf<Analise>()
        analises.add(Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"))
        analises.add(Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"))
        analises.add(Analise(df.parse("31/03/2023"), "Analises Corporativas"))
        analises.add(Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"))
        analises.add(Analise(df.parse("15/05/2023"), "Analise de Ativos"))
        analises.add(Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"))

        //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar as análises filtradas e use um loop for para filtrar as análises.
        val analisesFiltradas = mutableListOf<String>()
        for (analise in analises) {
            if (analise.data in dataInicial..dataFinal) {
                analisesFiltradas.add(analise.descricao)
            }
        }

        // Retornar a lista de análises filtradas
        return analisesFiltradas
    }
    // TODO: Retorne a lista de análises filtradas.
}

data class Analise(val data: Date, val descricao: String)
