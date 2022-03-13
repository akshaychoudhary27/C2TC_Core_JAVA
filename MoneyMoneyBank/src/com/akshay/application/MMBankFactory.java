package com.akshay.application;

import com.akshay.framework.BankFactory;
import com.akshay.framework.CurrentAcc;
import com.akshay.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

@Override
public SavingAcc getNewSAvingAccount(int AccNo, String accNm, float accBal, boolean isSalaried, float withdrawAmt) {
	MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal,isSalaried,withdrawAmt);
	return mmsaving;
}

@Override
public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit, float withdrawAmt) {
	MMCurrentAcc mmcurrent=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit, withdrawAmt);
	return mmcurrent;
}





}
