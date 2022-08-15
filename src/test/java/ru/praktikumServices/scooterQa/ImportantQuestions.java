package ru.praktikumServices.scooterQa;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ru.praktikumServices.Object.ImportantQuestionsObject;

import static org.junit.Assert.assertEquals;

public class ImportantQuestions extends BaseTest {

    @Test
    public void firstQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickFirstQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getFirstAnswerText());
        String expected = AssertData.answerOne;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void secondQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickSecondQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getSecondAnswerText());
        String expected = AssertData.answerTwo;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void thirdQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickThirdQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getThirdAnswerText());
        String expected = AssertData.answerThree;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void fourthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickFourthQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getFourthAnswerText());
        String expected = AssertData.answerFour;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void fifthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickFifthQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getFifthAnswerText());
        String expected = AssertData.answerFive;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void sixthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickSixthQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getSixthAnswerText());
        String expected = AssertData.answerSix;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void seventhQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickSeventhQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getSeventhAnswerText());
        String expected = AssertData.answerSeven;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void eighthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);
        PageFactory.initElements(driver, importantQuestionsObject);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.getClickEighthQuestion());

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.getEighthAnswerText());
        String expected = AssertData.answerEight;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }
}
