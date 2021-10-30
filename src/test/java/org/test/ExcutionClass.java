package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ExcutionClass extends BaseClassMain {
	public static void main(String[] args) throws IOException  {
		getDriver("https://adactinhotelapp.com/");
		
		AdatinPageLogin a=new AdatinPageLogin();
		WebElement username = a.getUsername();
		String user = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 0);
		sendKeys(username, user);
		WebElement password = a.getPassword();
		String pass = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 1);
		sendKeys(password, pass);
		WebElement login = a.getLogin();
		click(login);
		
		
		Location b=new Location();
		WebElement location = b.getLocation();
		String excelRead = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 2);
		sendKeys(location, excelRead);
		WebElement hotels = b.getHotels();
		String excelRead2 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 3);
		sendKeys(hotels, excelRead2);
		WebElement roomType = b.getRoomType();
		String excelRead3 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 4);
		sendKeys(roomType, excelRead3);
		WebElement noRoom = b.getNoRoom();
		String excelRead4 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 5);
		int parseInt = Integer.parseInt(excelRead4);
		selectByIndex(noRoom, parseInt);
		WebElement dateCheckin = b.getDateCheckin();
		b.clear(dateCheckin);
		String excelRead5 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 6);
		sendKeys(dateCheckin, excelRead5);
		WebElement dateCheckout = b.getDateCheckout();
		b.clear(dateCheckout);
		String excelRead6 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 7);
		sendKeys(dateCheckout, excelRead6);
		WebElement adult = b.getAdult();
		String excelRead7 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 8);
		sendKeys(adult, excelRead7);
		WebElement child = b.getChild();
		String excelRead8 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 9);
		sendKeys(child, excelRead8);
		WebElement search = b.getSearch();
		click(search);
		
		
		Conform c=new Conform();
		WebElement radioButton = c.getRadioButton();
		click(radioButton);
		WebElement conform = c.getConform();
		click(conform);
		
		BookClass d=new BookClass();
		WebElement firstname = d.getFirstname();
		String excelRead9 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 10);
		sendKeys(firstname, excelRead9);
		WebElement lastname = d.getLastname();
		String excelRead10 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 11);
		sendKeys(lastname, excelRead10);
		WebElement address = d.getAddress();
		String excelRead11 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 12);
		sendKeys(address, excelRead11);
		WebElement creditcardno = d.getCreditcardno();
		String excelRead12 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 13);
		sendKeys(creditcardno, excelRead12);
		WebElement creditcardtype = d.getCreditcardtype();
		String excelRead13 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 14);
		sendKeys(creditcardtype, excelRead13);
		WebElement month = d.getMonth();
		String excelRead14 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 15);
		int parseInt2 = Integer.parseInt(excelRead14);
		selectByIndex(month, parseInt2);
		WebElement year = d.getYear();
		String excelRead15 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 16);
		sendKeys(year, excelRead15);
		WebElement ccv = d.getCcv();
		String excelRead16 = excelRead("C:\\Users\\GOWTHAM\\eclipse-workspace\\MavenMainBaseClass\\testdata\\Book2.xlsx", "sheet1", 0, 17);
		sendKeys(ccv, excelRead16);
		WebElement booknow = d.getBooknow();
		click(booknow);
	
	}}
