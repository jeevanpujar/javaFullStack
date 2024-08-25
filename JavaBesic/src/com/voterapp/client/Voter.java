package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;

public class Voter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElectionBoothServiceImpl electionBoothServiceImpl = new ElectionBoothServiceImpl();

            try {
				System.out.print("Enter your age: ");
				int age = scanner.nextInt();
				electionBoothServiceImpl.checkAge(age);

				System.out.print("Enter your locality: ");
				String locality = scanner.next();
				electionBoothServiceImpl.checkLocality(locality);

				System.out.print("Enter your Voter ID: ");
				int voterId = scanner.nextInt();
				electionBoothServiceImpl.checkVoterId(voterId);

				System.out.println("You are eligible to vote");
			} catch (UnderAgeException e) {
				e.printStackTrace();
			} catch (LocalityNotFoundException e) {
				e.printStackTrace();
			} catch (InvalidVoterIDException e) {
				e.printStackTrace();
			}

	}
}
