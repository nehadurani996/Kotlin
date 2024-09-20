fun main() {
    fun main() {
        val htmlContent = html {
            body("Hello, World!")
        }
        println(htmlContent)
    }
}

class Html {
    private val children = mutableListOf<String>()

    fun body(content: String) {
        children.add("<body>$content</body>")
    }

    override fun toString(): String {
        return "<html>${children.joinToString("")}</html>"
    }
}

fun html(block: Html.() -> Unit): Html {
    val html = Html()
    html.block()
    return html
}
