package com.te.program8;

public class WithDraw extends BankAcc {

		static void withDraw() {

			if (accBal > amt) {
				System.out.println("Withdraw Success...");
			} else {
				System.out.println("Insufficient Balance...");
			}
		}
}
