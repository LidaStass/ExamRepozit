package com.duck.proj;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Admin on 14.06.2017.
 */
public class DuckBase {
    public void Logout() {
        $(By.cssSelector("a[href*='logout']")).click();// Logout
    }

    public void HomeButton() {
        $(By.cssSelector("[title*='Home']")).click();// кнопка "Home"
    }

    public void ShoppingCartConfirmOrder() {
        $(By.cssSelector("#box-checkout-cart > div > table > tbody > tr:nth-child(2) > td:nth-child(6) > button")).click();
        //удалить уточку
        $(By.cssSelector("[name*='confirm_order']")).click();//кнопка confirm order
    }

    public void PurpleDuck() {
        $(By.cssSelector("a[href*='#latest-products']")).click();// выбираю категорию Latest Products
        $(By.cssSelector("#box-latest-products [href*='purple-duck-p-5']")).click();// нажать на товар Purple Duck
        $(By.cssSelector("[name*='add_cart_product']")).click();// добавить утку в корзину
        $(By.cssSelector("[aria-label*='Close']")).click();// закрыть окно с уточкой
        $(By.cssSelector("#cart")).click();// перейти в корзину
    }

    public void GreenDuck() {
        $(By.cssSelector("a[href*='#popular-products']")).click();// выбираю категорию Popular Products
        $(By.cssSelector("#box-popular-products [href*='green-duck-p-2']")).click();// нажать на товар Green Duck
        $(By.cssSelector("[step*='1']")).setValue("2");// колличество уток
        $(By.cssSelector("[name*='add_cart_product']")).click();// довить уток в корзину
        $(By.cssSelector("[aria-label*='Close']")).click();// закрыть окно с уточкой
    }

    public void CurrencyChange() {
        $(By.cssSelector("#region > div.change > a")).click();// кнопка "Change"
        $(By.cssSelector("[name*=currency_code]")).click();// строка с выпадающим списком Currency
        $(By.cssSelector("[value*=EUR]")).click();// поменяли валюту на евро
        $(By.cssSelector("#box-regional-settings [value='0']")).click();// выбрать Exclude tax
        $(By.cssSelector("[value='Save']")).click();// нажать на кнопку Save
    }

    public void CreateNewAccount() {
        //создаем новый аккаунт в магазине
        $(By.cssSelector("#box-account-login a")).pressEnter(); //нажать на "New customers click here"
        // Сщздаю нового пользователя
        $(By.cssSelector("[name*='tax_id']")).setValue("12345");// Tax ID
        $(By.cssSelector("[name*=company]")).setValue("QA");// Company
        $(By.cssSelector("[name*=firstname]")).setValue("Lida");// Firstname
        $(By.cssSelector("[name*=lastname]")).setValue("Stass");// Lastname
        $(By.cssSelector("[name*=address1]")).setValue("Frunze street");// Address 1
        $(By.cssSelector("[name*=address2]")).setValue("Kirilovskaya street");// Address 2
        $(By.cssSelector("[name*=postcode]")).setValue("04080");// Postcode
        $(By.cssSelector("[name*=city]")).setValue("Kiev");// City
        $(By.cssSelector("[name*=country_code]")).click();// строка с выпадающим списком
        $(By.cssSelector("[value*=UA]")).click();// выбор страны, в данном случае Украина
        $(By.cssSelector("#box-create-account > form > div:nth-child(7) input")).setValue("x@gmail.com");// Email
        $(By.cssSelector("[name*=phone]")).setValue("+380633599934");// Phone
        $(By.cssSelector("#box-create-account > form > div:nth-child(8) input")).setValue("lida123");// Desired Password
        $(By.cssSelector("[name*=confirmed_password]")).setValue("lida123");// Confirm Password
        $(By.cssSelector("[value*='Create Account']")).click();// Create Account
    }
}
