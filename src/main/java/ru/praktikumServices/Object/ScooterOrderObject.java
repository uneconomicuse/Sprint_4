package ru.praktikumServices.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScooterOrderObject {
    WebDriver driver;

    public ScooterOrderObject(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    // Страница "Для кого самокат"
    // Кнопка "Заказать"
    private By orderButton = By.className("Button_Button__ra12g");

    // Поле "Имя"
    private By nameInput = By.xpath(".//input[@placeholder='* Имя']");

    // Поле "Фамилия"
    private By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");

    // Поле "Адрес"
    private By addressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // Список станций метро
    private By selectMetro = By.className("select-search__input");

    // Поле "Телефон"
    private By telephoneInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Кнопка "Далее"
    private By nextButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Далее')]");

    // -- Страница "Про аренду" --
    // Поле "Дата"
    private By dataInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // Список "Срок аренды"
    private By rentalPeriod = By.className("Dropdown-control");

    // Поле "Комментарий для курьера"
    private By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");

    // Кнопка "Заказать"
    private By successOrderButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Заказать')]");

    // Кнопка "Да" в блоке подтверждения заказа
    private By yesButton = By.xpath(".//div[@class='Order_Modal__YZ-d3']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Да')]");

    // Окно с сообщением об успешном создании заказа
    private By successPopup = By.className("Order_Modal__YZ-d3");

    // -- Страница "Для кого самокат" --
    public ScooterOrderObject clickButton() {
        driver.findElement(orderButton).click();
        return this;
    }

    public ScooterOrderObject fillName(String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public ScooterOrderObject fillSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);
        return this;
    }

    public ScooterOrderObject fillAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
        return this;
    }

    public ScooterOrderObject clickSelect(String value) {
        driver.findElement(selectMetro).click();
        driver.findElement(By.xpath(value)).click();
        return this;
    }

    public ScooterOrderObject fillTelephone(String telephone) {
        driver.findElement(telephoneInput).sendKeys(telephone);
        return this;
    }

    public ScooterOrderObject clickNextButton() {
        driver.findElement(nextButton).click();
        return this;
    }

    // -- Страница "Про аренду" --
    public ScooterOrderObject pickDate(String dayPicker) {
        driver.findElement(dataInput).click();
        driver.findElement(By.className(dayPicker)).click();
        return this;
    }

    public ScooterOrderObject rentalData(String value) {
        driver.findElement(rentalPeriod).click();
        driver.findElement(By.xpath(value)).click();
        return this;
    }

    public ScooterOrderObject chooseColor(String color) {
        driver.findElement(By.id(color)).click();
        return this;
    }

    public ScooterOrderObject commentCourier(String text) {
        driver.findElement(comment).sendKeys(text);
        return this;
    }

    public ScooterOrderObject successOrder() {
        driver.findElement(successOrderButton).click();
        return this;
    }

    public ScooterOrderObject clickYesButton() {
        driver.findElement(yesButton).click();
        return this;
    }

    public boolean popup() {
        boolean window = driver.findElement(successPopup).isDisplayed();
        return window;
    }
}
