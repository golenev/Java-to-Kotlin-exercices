package kotlinCode.dsl

open class LoginPage {
    fun clickBtn() {
        println("click btn")
    }

    protected fun sortItems() {
        println("sort items")
    }

    protected fun getText() {
        println("getText")
    }

    protected fun isLogoVisible() {
        println("isVisible")
    }

    fun doActions(init: LoginPage.() -> Unit): LoginPage {
        val actions = LoginPage()
        actions.init()
        return actions
    }

}