package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps extends BaseSteps {


    @Step("закрыто сообщение от файлов cookie")
    public void waitSendAppClickable(){
        new MainPage(driver).waitSendAppClickable();
    }

    @Step("выбран пункт меню {0}")
    public void selectMainMenu(String itemName){
        new MainPage(driver).selectMainMenu(itemName);
    }

    @Step("выбран пункт меню {0}")
    public void selectSubMenu(String itemName){
        new MainPage(driver).selectSubMenu(itemName);
    }

}
