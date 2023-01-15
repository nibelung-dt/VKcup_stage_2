package com.example.vkcup_stage2

interface WorkWithQuestions {
    fun createListOfQuestions(): List<Questions>

    class Questions(val question: String,
                    val numberQuestion: String,
                    val answers: List<String>,
                    val percents: List<String>): WorkWithQuestions {
        val list = mutableListOf<Questions>()

        override fun createListOfQuestions(): List<Questions> {
            for (i in 1..100) {
                val newQuestion = Questions(
                    question = "${i.toString()}-й вопрос",
                    numberQuestion = "Вопрос $i/100",
                    answers = listOf("один", "два", "три", "четыре"),
                    percents = listOf("15%", "20%", "25%", "40%")
                )
                list.add(newQuestion)
            }
            return list
        }
    }

}




/*
    val first = Questions("первый вопрос", "Вопрос 1/5", listOf("один", "два", "три", "четыре"), listOf("10%", "25%", "25%", "40%"))
    val second = Questions("второй вопрос", "Вопрос 2/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val third = Questions("третий вопрос", "Вопрос 3/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val forth = Questions("четвертый вопрос", "Вопрос 4/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    val five = Questions("пятый вопрос", "Вопрос 5/5", listOf("dfdfdfdsf", "aaa", "cccc", "dddd"), listOf("10%", "20%", "30%", "40%"))
    */
//val list = mutableListOf(first, second, third, forth, five)
// val list = mutableListOf<Questions>()

// val list2 = mutableListOf<Questions>()