package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	public static WebDriver driver= RunnerClass.driver;
	@Given("^user Launch The Url In The Adactin Application$")
	public void user_Launch_The_Url_In_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Senthamil273");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Senthamil@1904");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByVisibleText("London");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1= new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2= new Select(room);
		s2.selectByVisibleText("Deluxe");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement numberOfRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3= new Select(numberOfRoom);
		s3.selectByValue("2");
	}
	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		WebElement checkIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkIn.sendKeys("11/10/2023");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		WebElement checkOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkOut.sendKeys("15/10/2023");
	}

	@When("^user Select The Adults per Room$")
	public void user_Select_The_Adults_per_Room() throws Throwable {
		WebElement adultsPerRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adultsPerRoom);
		s4.selectByValue("2");
	}

	@When("^user Select The Children per Room$")
	public void user_Select_The_Children_per_Room() throws Throwable {
		WebElement childperroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(childperroom);
		s5.selectByVisibleText("1 - One");
	}

	@Then("^user Click The Login Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
		search.click();
	}

	@When("^user Select The Hotel Name$")
	public void user_Select_The_Hotel_Name() throws Throwable {
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();
	}

	@Then("^user Click The Continue Button And It Navigates To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_Hotel_Page() throws Throwable {
		WebElement continuee = driver.findElement(By.xpath("//input[@id='continue']"));
		continuee.click();
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("yugen");
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("raj");
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		WebElement addresss = driver.findElement(By.id("address"));
		addresss.sendKeys("parrys, chennai");
	}

	@When("^user Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {
		WebElement ccnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccnum.sendKeys("5765764589674565");

	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select t1 = new Select(cardType);
		t1.selectByVisibleText("Master Card");
	}

	@When("^user Enter The Month In Expiry Date$")
	public void user_Enter_The_Month_In_Expiry_Date() throws Throwable {
		WebElement cardExpDate = driver.findElement(By.id("cc_exp_month"));
		Select t2 = new Select(cardExpDate);
		t2.selectByValue("1");
	}

	@When("^user Enter The Year In Expiry Date$")
	public void user_Enter_The_Year_In_Expiry_Date() throws Throwable {
		WebElement cardExpYear = driver.findElement(By.id("cc_exp_year"));
		Select t3 = new Select(cardExpYear);
		t3.selectByValue("2030");

	}


	@When("^user Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("224");
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
	}
    
	@Then("^user Click The Logout Button And It Navigates To Home Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_Home_Page() throws Throwable {
		WebElement logOut = driver.findElement(By.id("logout"));
		logOut.click();
	}

}
