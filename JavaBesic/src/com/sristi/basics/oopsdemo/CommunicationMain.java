package com.sristi.basics.oopsdemo;

public class CommunicationMain {
	public class Main {
	    public static void main(String[] args) {
	        Communication communication;
	        communication = new MailCommunication();
	        communication.sendMessage();

	        communication = new SMSCommunication();
	        communication.sendMessage();

	        communication = new PhoneCommunication();
	        communication.sendMessage();

	        communication = new WhatsappCommunication();
	        communication.sendMessage();
	    }
	}
}
