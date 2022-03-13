package Client;

import com.akshay.application.MMBankFactory;
import com.akshay.application.MMCurrentAcc;
import com.akshay.application.MMSavingAcc;
import com.akshay.framework.BankFactory;
import com.akshay.framework.CurrentAcc;
import com.akshay.framework.SavingAcc;

public class Client {
	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(1,"Akshay",5000,true,1000);
		sa.withdraw(sa.getAccBal(), sa.getWithdrawAmt());
		sa.toString();
		CurrentAcc ca =new MMCurrentAcc(2,"Sanket",4000,5000,300);
		ca.withdraw(ca.getCreditLimit(),ca.getWithdrawAmt());
		ca.toString();
	}
}