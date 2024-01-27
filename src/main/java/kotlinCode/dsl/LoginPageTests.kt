package kotlinCode.dsl

import org.jetbrains.annotations.TestOnly

class LoginPageTests : LoginPage() {

    val loginPage = doActions {
        clickBtn()
        sortItems()
        getText()
    }
}

fun main() {
    LoginPageTests().loginPage
}