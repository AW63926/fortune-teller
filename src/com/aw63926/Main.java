package com.aw63926;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println("Welcome to Fortune Teller!");
		System.out.println("Enter \"Quit\" to exit.");
		

		System.out.println("What is your first name?");
		String firstName = input.next();
		if(firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
			
		System.out.println("What is your last name?");
		String lastName = input.next();
		if(lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("How old are you?");
		String userAge = input.next();
		if(userAge.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("What month were you born in? Enter month numerically." + "Example: for June, enter 6");
		String userBirthMonth = input.next();
		if(userBirthMonth.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("How many siblings do you have?");
		String siblingCount = input.next();
		if(siblingCount.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		boolean helpLoop = true;
		String userTransportation = null;
		while (helpLoop) {
			System.out.println("What is your favorite ROYGBIV color?");
			System.out.println("Enter \"Help\" for a list of ROYGBIV colors.");
			String userColor = input.next();
			switch (userColor.toLowerCase()) {
			case "red":
				userTransportation = "boat";
				helpLoop = false;
				break;
			case "orange":
				userTransportation = "car";
				helpLoop = false;
				break;
			case "yellow":
				userTransportation = "bike";
				helpLoop = false;
				break;
			case "green":
				userTransportation = "VW bus";
				helpLoop = false;
				break;
			case "blue":
				userTransportation = "skates";
				helpLoop = false;
				break;
			case "indigo":
				userTransportation = "foot";
				helpLoop = false;
				break;
			case "violet":
				userTransportation = "blimp";
				helpLoop = false;
				break;
			case "help":
				System.out.println("The ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet.");
				break;
			case "quit":
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}
		}
		int retirementYears = 0;
		if (Integer.parseInt(userAge) % 2 == 0) {
			retirementYears = 25;
		} else {
			retirementYears = 12;
		}
		String vacationHome;

		switch (Integer.parseInt(siblingCount)) {
		case -1:
			vacationHome = "Oymyakon";
			break;
		case 0:
			vacationHome = "Gary, Indiana";
			break;
		case 1:
			vacationHome = "Cancun";
			break;
		case 2:
			vacationHome = "Hawaii";
			break;
		case 3:
			vacationHome = "Wrightsville beach";
			break;
		case 4:
			vacationHome = "Lisbon";
			break;
		default:
			vacationHome = "Islamorada";
			break;
		}

		double bankBalance;
		if (Integer.parseInt(userBirthMonth) <= 4) {
			bankBalance = 224000;
		} else if (Integer.parseInt(userBirthMonth) > 4 && Integer.parseInt(userBirthMonth) <= 8) {
			bankBalance = 3600000;
		} else if (Integer.parseInt(userBirthMonth) > 8 && Integer.parseInt(userBirthMonth) <= 12) {
			bankBalance = 45;
		} else {
			bankBalance = 0;
		}
		input.close();

		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with "
				+ nf.format(bankBalance) + " in the bank, a vacation home in " + vacationHome + ", and travel by " + 
				userTransportation + ".");

	}

}
