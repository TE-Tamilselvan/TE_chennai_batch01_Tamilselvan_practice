package com.te.localrepository;

import java.util.Scanner;

public class Assign5a {
		
		public void simple() {
			
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the Principal Amount :");
			int principal = scn.nextInt();
			System.out.println("Enter the Rate Per Annum :");
			int rate = scn.nextInt();
			System.out.println("Enter the time :");
			int time = scn.nextInt();
			
			int sI = (principal * rate * time) / 100;
			System.out.println("The Simple Interest : " + sI);
			scn.close();
		}
	}

	
	


