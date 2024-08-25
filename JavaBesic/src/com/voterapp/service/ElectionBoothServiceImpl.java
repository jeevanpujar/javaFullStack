package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
		try {
			checkAge(age);	
			checkLocality(locality);
			checkVoterId(vid);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		} catch (LocalityNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidVoterIDException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean checkAge(int age)throws UnderAgeException{
		 if(age <  18)
			 throw new UnderAgeException("Ag should be greater than 18");
		 else 
			 return true;
		}
		public boolean checkLocality(String locality )throws LocalityNotFoundException{
		 String[] localities = {"JP Naga","ABC Nagar","whitefield"};
		 for (String loc : localities) {
	            if (loc.equalsIgnoreCase(locality)) {
	                return true;
	            }
	        }

	        throw new LocalityNotFoundException("Locality not found: " + locality);
	    }
		
		public boolean checkVoterId(int voterId) throws InvalidVoterIDException {
			if (voterId < 1000 || voterId > 9999) {
	            throw new InvalidVoterIDException("Invalid Voter ID: " + voterId);
	        }
	        return true;
	    }

}
