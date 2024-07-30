package com.sristi.basics.oopsdemo;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messengers=new Messenger();
		String message="Java course started from july 29th 2024";
		String toUserName="jeevanpuu@gmail.com";
		String Subject="Java Course Details";
		messengers.sendMail(message);
		messengers.sendMail(toUserName, message);
		messengers.sendMail(toUserName, message, Subject);
	}

}
