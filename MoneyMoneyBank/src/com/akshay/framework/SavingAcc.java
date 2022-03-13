package com.akshay.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float MINBAL=500;
	
	public static float getMIBAL() {
		return MINBAL;
	}
	
	public float getAccBal() {
		return accBal;
	}
	public SavingAcc(int accNo, String accNm, float accBal, float withdrawAmt) {
		super(accNo, accNm, accBal,withdrawAmt);
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract void withdraw(float accBal, float withdrawAmt);



	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accBal=" + accBal + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	
}
