package ru.praktikumServices.scooterQa;

import org.junit.Test;
import ru.praktikumServices.Object.ImportantQuestionsObject;


import static org.junit.Assert.assertEquals;

public class ImportantQuestions extends BaseTest {

    @Test
    public void firstQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickFirstQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.firstAnswerText);
        String expected = AssertData.answerOne;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void secondQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickSecondQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.secondAnswerText);
        String expected = AssertData.answerTwo;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void thirdQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickThirdQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.thirdAnswerText);
        String expected = AssertData.answerThree;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void fourthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickFourthQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.fourthAnswerText);
        String expected = AssertData.answerFour;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void fifthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickFifthQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.fifthAnswerText);
        String expected = AssertData.answerFive;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void sixthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickSixthQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.sixthAnswerText);
        String expected = AssertData.answerSix;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void seventhQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickSeventhQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.seventhAnswerText);
        String expected = AssertData.answerSeven;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

    @Test
    public void eighthQuestionTest() {
        ImportantQuestionsObject importantQuestionsObject = new ImportantQuestionsObject(driver);

        importantQuestionsObject
                .acceptCookie()
                .searchQuestionBlock()
                .clickQuestionBlock(importantQuestionsObject.clickEighthQuestion);

        String actual = importantQuestionsObject.answerText(importantQuestionsObject.eighthAnswerText);
        String expected = AssertData.answerEight;

        assertEquals("Фактический результат не совпадает с ожидаемым результатом!", expected, actual);
    }

}
