package com.revature.service;

import com.revature.dao.BankUserDao;
import com.revature.dao.BankUserDaoImpl;
import com.revature.dto.BankUserDTO;
import com.revature.model.BankAccount;
import com.revature.model.BankUser;

public class AppService {
	
	public boolean validateUser(BankUser user){
		
		if(user.getUsername().equals("admin")
			&& user.getPassword().equals("admin"))
			return true;
		return false;
		
	}

	
	public BankUserDTO convertToBankUserDTO(BankUser user, BankAccount bankAccount){
		
		return new BankUserDTO(user.getId(),user.getUsername(),user.getFirstName(),user.getLastName(), bankAccount.getBaId(), bankAccount.getBaBalance());
		
	} 
	
	public BankAccount getBankAccountByUsername(BankUser user){
		return new BankUserDaoImpl().getBankAccountByUserId(user);	}
}






























