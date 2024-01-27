package javaCode.javadsl;

import java.util.function.Consumer;

public class LoginPage {
    protected LoginPage clickBtn() {
        System.out.println("click btn");
        return this;
    }

    protected LoginPage sortItems() {
        System.out.println("sort items");
        return this;
    }

    protected LoginPage getText() {
        System.out.println("getText");
        return this;
    }

    protected LoginPage isLogoVisible() {
        System.out.println("isVisible");
        return this;
    }

    protected static LoginPage doActions(Consumer<LoginPage> init) {
        LoginPage actions = new LoginPage();
        init.accept(actions);
        return actions;
    }
}
