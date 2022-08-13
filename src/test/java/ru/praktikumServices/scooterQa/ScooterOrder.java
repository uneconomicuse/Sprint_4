package ru.praktikumServices.scooterQa;

import org.junit.Test;
import ru.praktikumServices.Object.ScooterOrderObject;

import static org.junit.Assert.*;

public class ScooterOrder extends BaseTest {

    @Test
    public void firsOrderScooter() {
        ScooterOrderObject scooterOrderObject = new ScooterOrderObject(driver);

        scooterOrderObject
                .clickButton()
                .fillName("Иван")
                .fillSurname("Иванов")
                .fillAddress("г. Москва")
                .clickSelect(".//div[@class='select-search__select']//li[@data-value='1']")
                .fillTelephone("+79099099999")
                .clickNextButton();

        scooterOrderObject
                .pickDate("react-datepicker__day--today")
                .rentalData(".//div[contains(@class, 'Dropdown-option') and contains(text() ,'сутки')]")
                .chooseColor("black")
                .commentCourier("Привет, хочу этот самокат побыстрее!")
                .successOrder()
                .clickYesButton();

        boolean result = scooterOrderObject.popup();
        assertTrue(result);
    }

    @Test
    public void secondOrderScooter() {
        ScooterOrderObject scooterOrderObject = new ScooterOrderObject(driver);

        scooterOrderObject
                .clickButton()
                .fillName("Петр")
                .fillSurname("Петров")
                .fillAddress("г. Архангельск")
                .clickSelect(".//div[@class='select-search__select']//li[@data-value='2']")
                .fillTelephone("+79895554422")
                .clickNextButton();

        scooterOrderObject
                .pickDate("react-datepicker__day--weekend")
                .rentalData(".//div[contains(@class, 'Dropdown-option') and contains(text() ,'трое суток')]")
                .chooseColor("grey")
                .commentCourier("Здравствуйте, желательно доставить самокат на 9 этаж! Лифт не работает:(")
                .successOrder()
                .clickYesButton();

        boolean result = scooterOrderObject.popup();
        assertTrue(result);
    }

}
