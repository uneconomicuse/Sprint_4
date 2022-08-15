package ru.praktikumServices.Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScooterOrderObject {
    WebDriver driver;

    public ScooterOrderObject(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    // Страница "Для кого самокат"
    // Кнопка "Заказать"
    @FindBy(className = "Button_Button__ra12g")
    private WebElement orderButton;

    // Поле "Имя"
    @FindBy(xpath = ".//input[@placeholder='* Имя']")
    private WebElement nameInput;

    // Поле "Фамилия"
    @FindBy(xpath = ".//input[@placeholder='* Фамилия']")
    private WebElement surnameInput;

    // Поле "Адрес"
    @FindBy(xpath = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private WebElement addressInput;

    // Список станций метро
    @FindBy(className = "select-search__input")
    private WebElement selectMetro;

    // Выбор станции - для двух тестов
    @FindBy(xpath = ".//div[@class='select-search__select']//li[@data-value='1']")
    private WebElement firstStationValue;
    @FindBy(xpath = ".//div[@class='select-search__select']//li[@data-value='2']")
    private WebElement secondStationValue;

    // Поле "Телефон"
    @FindBy(xpath = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    private WebElement telephoneInput;

    // Кнопка "Далее"
    @FindBy(xpath = ".//div[@class='Order_NextButton__1_rCA']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Далее')]")
    private WebElement nextButton;

    // -- Страница "Про аренду" --
    // Поле "Дата"
    @FindBy(xpath = ".//input[@placeholder='* Когда привезти самокат']")
    private WebElement dateInput;

    // Кнопки даты для двух тестов
    @FindBy(className = "react-datepicker__day--today")
    private WebElement dayOne;
    @FindBy(className = "react-datepicker__day--weekend")
    private WebElement dayTwo;

    // Список "Срок аренды"
    @FindBy(className = "Dropdown-control")
    private WebElement rentalPeriod;

    // Выбор длительности аренды для двух тестов
    @FindBy(xpath = ".//div[contains(@class, 'Dropdown-option') and contains(text() ,'сутки')]")
    private WebElement rentalTimeOne;
    @FindBy(xpath = ".//div[contains(@class, 'Dropdown-option') and contains(text() ,'сутки')]")
    private WebElement rentalTimeTwo;

    // Кнопки выбора цвета
    @FindBy(id = "black")
    private WebElement firstColor;
    @FindBy(id = "gray")
    private WebElement secondColor;

    // Поле "Комментарий для курьера"
    @FindBy(xpath = ".//input[@placeholder='Комментарий для курьера']")
    private WebElement comment;

    // Кнопка "Заказать"
    @FindBy(xpath = ".//div[@class='Order_Buttons__1xGrp']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Заказать')]")
    private WebElement successOrderButton;

    // Кнопка "Да" в блоке подтверждения заказа
    @FindBy(xpath = ".//div[@class='Order_Modal__YZ-d3']//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM') and contains(text() ,'Да')]")
    private WebElement yesButton;

    // Окно с сообщением об успешном создании заказа
    @FindBy(className = "Order_Modal__YZ-d3")
    private WebElement successPopup;

    // Геттеры для элементов со страницы "Для кого самокат"
    public WebElement getOrderButton() {
        return orderButton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getSurnameInput() {
        return surnameInput;
    }

    public WebElement getAddressInput() {
        return addressInput;
    }

    public WebElement getSelectMetro() {
        return selectMetro;
    }

    public WebElement getFirstStationValue() {
        return firstStationValue;
    }

    public WebElement getSecondStationValue() {
        return secondStationValue;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    // Геттеры для элементов со страницы "Для кого самокат"
    public WebElement getDateInput() {
        return dateInput;
    }

    public WebElement getDayOne() {
        return dayOne;
    }

    public WebElement getDayTwo() {
        return dayTwo;
    }

    public WebElement getRentalPeriod() {
        return rentalPeriod;
    }

    public WebElement getRentalTimeOne() {
        return rentalTimeOne;
    }

    public WebElement getRentalTimeTwo() {
        return rentalTimeTwo;
    }

    public WebElement getFirstColor() {
        return firstColor;
    }

    public WebElement getSecondColor() {
        return secondColor;
    }

    public WebElement getComment() {
        return comment;
    }

    public WebElement getSuccessOrderButton() {
        return successOrderButton;
    }

    public WebElement getYesButton() {
        return yesButton;
    }

    // Метод для клика по кнопке
    public ScooterOrderObject clickButton(WebElement button) {
        button.click();
        return this;
    }

    // Метод для заполнения одиночного поля
    public ScooterOrderObject fillInput(WebElement inputName, String text) {
        inputName.sendKeys(text);
        return this;
    }

    // Метод для заполнения полей имени, фамилии и адреса
    public ScooterOrderObject fillInputs(String name, String surname, String address) {
        nameInput.sendKeys(name);
        surnameInput.sendKeys(surname);
        addressInput.sendKeys(address);
        return this;
    }

    // Метод для выбора элемента из выпадающего списка
    public ScooterOrderObject selectValue(WebElement clickButton, WebElement value) {
        clickButton.click();
        value.click();
        return this;
    }

    public boolean popup() {
        boolean window = successPopup.isDisplayed();
        return window;
    }
}
