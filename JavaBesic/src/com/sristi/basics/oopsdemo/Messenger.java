package com.sristi.basics.oopsdemo;

public class Messenger {
	void sendMail(String message){
		System.out.println("Sending mail: "+message);
	}
	 void sendMail(String tousername, String message){
		 System.out.println("To user name="+tousername);
		 System.out.println("Message : "+message);
	 }
	 void sendMail(String tousername, String message,String subject){
		 System.out.println("To user name="+tousername);
		 System.out.println("Message : "+message);
		 System.out.println("Subject : "+subject);
	 }

}
