package com.mini.groupP;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("--------Welcome to Shoping Mart----------");
		System.out.println();
		System.out.println("Please select menu from below to proceed:");
		System.out.println("1.User");
		System.out.println("2.Admin");
		System.out.println("3.Guest");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: System.out.println("Welcome user, Please select sub menu from below to proceed.");
		
		
		        break;
		        
		case 2: System.out.println("Welcome Admin");
		
		
		        break;
		        
		        
		case 3:  System.out.println("Hello Guest user, Please select available option from below to proceed");   
				// System.out.println("Please select available option from below to proceed");
				 System.out.println("13. View available stock");
				 System.out.println("14.Not purchased item");
				 System.out.println("Enter your option:");
				 int option=sc.nextInt();
				// public  usrChoice() 
				 if(option==13) {
					 System.out.println("Please visit below available product");
					 ItemShowOnly.showProduct();
				 } else if(option==14) {
					 ViewProduct.product();
				 }
				 else {
					 System.out.println("Wrong choice");
					 System.out.println("Please choose from available (13,14)menu only");
			 		 
				 
				 }
				 
				 break;
				 
		 default: System.out.println("Wrong choice entered");	
		 		  System.out.println("Please choose from available (1,2,3)menu only");
		 		  main(null);
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	}

}
