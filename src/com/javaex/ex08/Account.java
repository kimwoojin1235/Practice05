package com.javaex.ex08;

public class Account {

    private static int deposit;
	private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
		this.accountNo=accountNo;
	}
    public void deposit(int balance) {
    	this.balance+=balance;
    }
    public void withdraw(int balance) {
		this.balance-=balance;
	}
    //필요한 메소드 작성
    public void showBalance()
    {
    	System.out.println(balance);
    }

}
