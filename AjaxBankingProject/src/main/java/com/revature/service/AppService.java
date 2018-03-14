package com.revature.service;

import com.revature.dao.BankUserDao;
import com.revature.dao.BankUserDaoImpl;
import com.revature.dto.BankUserDTO;
import com.revature.model.BankAccount;
import com.revature.model.BankUser;

public class AppService {
	
	public BankUser validateUser(BankUser user){
		
		BankUserDao dao = new BankUserDaoImpl();
		
		
			if(user.getUsername().equals("admin" )  
					&& user.getPassword().equals("admin")){
				return dbUser;
			}
		}
		return null;
		
	}

	
	public BankUserDTO convertToBankUserDTO(BankUser user, BankAccount bankAccount){
		
		return new BankUserDTO(user.getId(),user.getUsername(),user.getFirstName(),user.getLastName(), bankAccount.getBaId(), bankAccount.getBaBalance());
		
	} 
	
	public BankAccount getBankAccountByUsername(BankUser user){
		return new BankUserDaoImpl().getBankAccountByUserId(user);	}
}






























