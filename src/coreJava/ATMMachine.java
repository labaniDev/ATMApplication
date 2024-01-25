package coreJava;

import java.util.Scanner;

class ATM{
	double Balance=100000.78;
	int pin=2000;
	Scanner sc=new Scanner(System.in);
	public void checkPin() {
		System.out.println("Enter Your Pin:");
		Scanner sc=new Scanner(System.in);
		int enteredPin=sc.nextInt();
		if(enteredPin==pin) {
			menu();
		}else {
			System.out.println("Please Enter a Valid Pin");
		}
	}
	public void menu() {
		System.out.println("Enter Your choice:");
		System.out.println("1.Check A/c Balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");
		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1) {
			checkBalance();
		}else if(option==2){
			withdrawMoney();
		}else if(option==3){
			depositMoney();
		}else if(option==4){
			return;
		}else {
			System.out.println("Please Enter a valid choice");
		}
	}
	public void checkBalance() {
		System.out.println("Balance:"+Balance);
	}
	public void withdrawMoney() {
		System.out.println("Enter ammount to Withdraw:");
		Double amount=sc.nextDouble();
		if(amount>Balance) {
			System.out.println("Insufficient Money");
		}else {
			Balance =Balance-amount;
			System.out.println("Money Withdrawl Successfull");
		}
		menu();
	}
	public void depositMoney() {
		System.out.println("Enter the Amount:");
			double amount=sc.nextDouble();
			Balance=Balance+amount;
			System.out.println("Money Deposited Successfully");
		
	}
}

public class ATMMachine {
	public static void main(String[] args) {
		ATM obj=new ATM();
		obj.checkPin();
	}

}
