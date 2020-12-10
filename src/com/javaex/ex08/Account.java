package com.javaex.ex08;

public class Account {

    private static int deposit;
	private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account(String accountNo) {
		this.accountNo=accountNo;
		//메뉴에 나오는 숫자를 입력을 받는다.
	}
    public void deposit(int balance) {
    	this.balance+=balance;
    	//예금이 되는 금액을 입력을 받고 저장을 한다.
    }
    public void withdraw(int balance) {
		this.balance-=balance;
		//출금이 되는 액수를 저장이 된액수에서 뺀다.
	}
    //필요한 메소드 작성
    public void showBalance()
    {
    	System.out.println(balance);
    	//돈을 출력한다.
    }

}
