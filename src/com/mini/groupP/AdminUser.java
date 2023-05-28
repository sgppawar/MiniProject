package com.mini.groupP;

import java.util.Scanner;

public class AdminUser {

	public static void adminLogin() {
		
		LogIn.LogInUser();
		// LogIn.UserNameValidation();
		LogIn.Password();
		// LogIn.PasswordValidation();
		
	}
   public static  void adminFunctions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sub Menu for admin Panel");
		System.out.println("7.Add product item");
		System.out.println("8.Calculate Bill");
		System.out.println("9.Display amount to End User");
		System.out.println("10.Check Quantity");
		System.out.println("11.Check registered user");
		System.out.println("12. Check the particular user history");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {

		case 7:
			ProductDetails.ShowProduct();
			System.out.println("Enter product id which you want to add");
			int ip = sc.nextInt();
			ProductDetails.productdetails(ip);
			break;

		case 8:
			ProductBill.Bill();
			break;
		case 9:
			System.out.println("slect product to show amount");
			ProductDetails.SelectProduct();
			break;
		case 10:
			System.out.println("slect product to show Available Quantity");
			ProductDetails.SelectProduct();
			break;
		case 11:
			AddUser.addUser();
			break;
		case 12:
			AddUser.showUser();
			break;

		default:
			System.out.println("Wrong input, Please select from (7,8,9,10,11,12 only");
			adminLogin();

		}

		
		

	}
	
}
