package javaCode.javadsl;

public class TestActions extends LoginPage {

  final static LoginPage loginPageActions = doActions(act -> act
            .clickBtn()
            .getText()
            .isLogoVisible()
            .sortItems());

    public static void main(String[] args) {
        System.out.println(loginPageActions.getClass());
    }

}
