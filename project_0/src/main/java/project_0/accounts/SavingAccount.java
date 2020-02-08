package project_0.accounts;

import project_0.abstract_models.Account;
import project_0.abstract_models.User;


public class SavingAccount extends Account{
	accounttype accountype = Account.accounttype.SAVING;
	Double creditlimit = 0.0;
	Double balance = 0.0;
	
	public SavingAccount(accountownershiptype type, String accountid, String loginid, String loginpassword, User ...users) {
		super(type, loginpassword, loginpassword, loginpassword, users);
	}
}