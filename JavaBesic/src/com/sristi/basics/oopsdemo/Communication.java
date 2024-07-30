package com.sristi.basics.oopsdemo;

public class Communication {
	 void sendMessage() {
	    }
}
class MailCommunication extends Communication {
    @Override
    void sendMessage() {
        System.out.println("Sending an Email...");
    }
}

class SMSCommunication extends Communication {
    @Override
    void sendMessage() {
        System.out.println("Sending an SMS...");
    }
}

class PhoneCommunication extends Communication {
    @Override
    void sendMessage() {
        System.out.println("Making a Phone Call...");
    }
}

class WhatsappCommunication extends Communication {
    @Override
    void sendMessage() {
        System.out.println("Sending a WhatsApp message...");
    }
}
