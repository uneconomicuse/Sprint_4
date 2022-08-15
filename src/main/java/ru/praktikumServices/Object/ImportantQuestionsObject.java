package ru.praktikumServices.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ImportantQuestionsObject {

    WebDriver driver;

    public ImportantQuestionsObject(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    // Переменная, в которой хранится адрес главной страницы
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    // Переменная, в которой хранится id блока кнопки для принятия куки
    @FindBy(id = "rcc-confirm-button")
    private WebElement cookieButton;

    // Переменная, в которой хранится класс блока с вопросами
    @FindBy(className = "accordion")
    private WebElement scrollToBlock;

    // Переменные, в которых хранится id блока вопроса
    @FindBy(id = "accordion__heading-0")
    private WebElement clickFirstQuestion;
    @FindBy(id = "accordion__heading-1")
    private WebElement clickSecondQuestion;
    @FindBy(id = "accordion__heading-2")
    private WebElement clickThirdQuestion;
    @FindBy(id = "accordion__heading-3")
    private WebElement clickFourthQuestion;
    @FindBy(id = "accordion__heading-4")
    private WebElement clickFifthQuestion;
    @FindBy(id = "accordion__heading-5")
    private WebElement clickSixthQuestion;
    @FindBy(id = "accordion__heading-6")
    private WebElement clickSeventhQuestion;
    @FindBy(id = "accordion__heading-7")
    private WebElement clickEighthQuestion;

    // Переменные, в которых хранится id блока ответа
    @FindBy(id = "accordion__panel-0")
    private WebElement firstAnswerText;
    @FindBy(id = "accordion__panel-1")
    private WebElement secondAnswerText;
    @FindBy(id = "accordion__panel-2")
    private WebElement thirdAnswerText;
    @FindBy(id = "accordion__panel-3")
    private WebElement fourthAnswerText;
    @FindBy(id = "accordion__panel-4")
    private WebElement fifthAnswerText;
    @FindBy(id = "accordion__panel-5")
    private WebElement sixthAnswerText;
    @FindBy(id = "accordion__panel-6")
    private WebElement seventhAnswerText;
    @FindBy(id = "accordion__panel-7")
    private WebElement eighthAnswerText;

    // Геттеры для получения id блоков вопросов
    public WebElement getClickFirstQuestion() {
        return clickFirstQuestion;
    }

    public WebElement getClickSecondQuestion() {
        return clickSecondQuestion;
    }

    public WebElement getClickThirdQuestion() {
        return clickThirdQuestion;
    }

    public WebElement getClickFourthQuestion() {
        return clickFourthQuestion;
    }

    public WebElement getClickFifthQuestion() {
        return clickFifthQuestion;
    }

    public WebElement getClickSixthQuestion() {
        return clickSixthQuestion;
    }

    public WebElement getClickSeventhQuestion() {
        return clickSeventhQuestion;
    }

    public WebElement getClickEighthQuestion() {
        return clickEighthQuestion;
    }

    // Геттеры для получения id блоков ответов
    public WebElement getFirstAnswerText() {
        return firstAnswerText;
    }

    public WebElement getSecondAnswerText() {
        return secondAnswerText;
    }

    public WebElement getThirdAnswerText() {
        return thirdAnswerText;
    }

    public WebElement getFourthAnswerText() {
        return fourthAnswerText;
    }

    public WebElement getFifthAnswerText() {
        return fifthAnswerText;
    }

    public WebElement getSixthAnswerText() {
        return sixthAnswerText;
    }

    public WebElement getSeventhAnswerText() {
        return seventhAnswerText;
    }

    public WebElement getEighthAnswerText() {
        return eighthAnswerText;
    }

    // Нажать на кнопку принятия куки
    public ImportantQuestionsObject acceptCookie() {
        cookieButton.click();
        return this;
    }

    // Найти блок с вопросом
    public ImportantQuestionsObject searchQuestionBlock() {
        WebElement element = scrollToBlock;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    // Нажать на заголовок вопроса
    public ImportantQuestionsObject clickQuestionBlock(WebElement questionHeader) {
        questionHeader.click();
        return this;
    }

    // Получить текст ответа на вопрос
    public String answerText(WebElement answerBlock) {
        String text = answerBlock.getText();
        return text;
    }
}
