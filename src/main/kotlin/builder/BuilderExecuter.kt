package builder

class BuilderExecuter() {

    companion object {
        fun execute(command: String): String {
            when(command) {
                "text" -> {
                    val textBuilder = TextBuilder()
                    val director = Director(textBuilder)
                    director.construct()
                    return textBuilder.getResult()
                }
                "html" -> {
                    val htmlBuilder = HTMLBuilder()
                    val director = Director(htmlBuilder)
                    director.construct()
                    return htmlBuilder.getResult()
                }
                else -> {
                    throw IllegalArgumentException("対応していないフォーマットです")
                }
            }
        }
    }

}