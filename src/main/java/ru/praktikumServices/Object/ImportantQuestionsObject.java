package ru.praktikumServices.Object;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ImportantQuestionsObject {

    WebDriver driver;

    public ImportantQuestionsObject(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    // Переменная, в которой хранится адрес главной страницы
    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    // Переменная, в которой хранится id блока кнопки для принятия куки
    private By cookieButton = By.id("rcc-confirm-button");

    // Переменная, в которой хранится класс блока с вопросами
    private By scrollToBlock = By.className("accordion");

    // Переменные, в которых хранится id блока вопроса
    public final String clickFirstQuestion = "accordion__heading-0";
    public final String clickSecondQuestion = "accordion__heading-1";
    public final String clickThirdQuestion = "accordion__heading-2";
    public final String clickFourthQuestion = "accordion__heading-3";
    public final String clickFifthQuestion = "accordion__heading-4";
    public final String clickSixthQuestion = "accordion__heading-5";
    public final String clickSeventhQuestion = "accordion__heading-6";
    public final String clickEighthQuestion = "accordion__heading-7";

    // Переменные, в которых хранится id блока ответа
    public final String firstAnswerText = "accordion__panel-0";
    public final String secondAnswerText = "accordion__panel-1";
    public final String thirdAnswerText = "accordion__panel-2";
    public final String fourthAnswerText = "accordion__panel-3";
    public final String fifthAnswerText = "accordion__panel-4";
    public final String sixthAnswerText = "accordion__panel-5";
    public final String seventhAnswerText = "accordion__panel-6";
    public final String eighthAnswerText = "accordion__panel-7";



    // Нажать на кнопку принятия куки
    public ImportantQuestionsObject acceptCookie() {
        driver.findElement(cookieButton).click();
        return this;
    }

    // Найти блок с вопросом
    public ImportantQuestionsObject searchQuestionBlock() {

        WebElement element = driver.findElement(scrollToBlock);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        return this;
    }
    // Нажать на заголовок вопроса
    public ImportantQuestionsObject clickQuestionBlock(String questionHeader) {
        driver.findElement(By.id(questionHeader)).click();
        return this;
    }
    // Получить текст ответа на вопрос
    public String answerText(String answerBlock) {
        String text = driver.findElement(By.id(answerBlock)).getText();
        return text;
    }
}