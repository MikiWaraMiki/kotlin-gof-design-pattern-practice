package absfactory.news

enum class GeneratorCommandEnum(val className: String) {
    LIST_LINK("absfactory.listfactory.ListFactory"),
    TABLE("absfactory.tablefactory.TableFactory")
}