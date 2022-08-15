package ru.praktikumServices.scooterQa;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ru.praktikumServices.Object.ScooterOrderObject;

import static org.junit.Assert.*;

public class ScooterOrder extends BaseTest {

    @Test
    public void firstOrderScooter() {
        ScooterOrderObject scooterOrderObject = new ScooterOrderObject(driver);
        PageFactory.initElements(driver, scooterOrderObject);

        scooterOrderObject
                .clickButton(scooterOrderObject.getOrderButton())
                .fillInputs("Иван", "Иванов", "г. Москва")
                .selectValue(scooterOrderObject.getSelectMetro(), scooterOrderObject.getFirstStationValue())
                .fillInput(scooterOrderObject.getTelephoneInput(), "79899899999")
                .clickButton(scooterOrderObject.getNextButton());

        scooterOrderObject
                .selectValue(scooterOrderObject.getDateInput(), scooterOrderObject.getDayOne())
                .selectValue(scooterOrderObject.getRentalPeriod(), scooterOrderObject.getRentalTimeOne())
                .clickButton(scooterOrderObject.getFirstColor())
                .fillInput(scooterOrderObject.getComment(), "Привет, хочу этот самокат побыстрее!")
                .clickButton(scooterOrderObject.getSuccessOrderButton())
                .clickButton(scooterOrderObject.getYesButton());

        boolean result = scooterOrderObject.popup();
        assertTrue(result);
    }

    @Test
    public void secondOrderScooter() {
        ScooterOrderObject scooterOrderObject = new ScooterOrderObject(driver);
        PageFactory.initElements(driver, scooterOrderObject);

        scooterOrderObject
                .clickButton(scooterOrderObject.getOrderButton())
                .fillInputs("Петр", "Петров", "г. Архангельск")
                .selectValue(scooterOrderObject.getSelectMetro(), scooterOrderObject.getSecondStationValue())
                .fillInput(scooterOrderObject.getTelephoneInput(), "79695554477")
                .clickButton(scooterOrderObject.getNextButton());

        scooterOrderObject
                .selectValue(scooterOrderObject.getDateInput(), scooterOrderObject.getDayTwo())
                .selectValue(scooterOrderObject.getRentalPeriod(), scooterOrderObject.getRentalTimeTwo())
                .clickButton(scooterOrderObject.getFirstColor())
                .fillInput(scooterOrderObject.getComment(), "Здравствуйте! Лифт не работает, поэтому тащить самокат придется до 9 этажа:(")
                .clickButton(scooterOrderObject.getSuccessOrderButton())
                .clickButton(scooterOrderObject.getYesButton());

        boolean result = scooterOrderObject.popup();
        assertTrue(result);
    }
}
