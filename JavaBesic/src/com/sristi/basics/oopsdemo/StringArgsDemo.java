package com.sristi.basics.oopsdemo;

class StringArgsDemo{ 
	 String name; 
	 
	 public StringArgsDemo(String name) {
		super();
		this.name = name;
	}
	public StringArgsDemo() {
		this.name=name;
	}
	void greetUser(String... messages){ 
		for (String message : messages) {
			System.out.println(message +" "+ name);
		} 
		System.out.println();
	 } 
	void sayHello(String... names){ 
		for (String name : names) {
			System.out.println("Hello "+name );
		}
		System.out.println();
	} 
	public static void main(String[] args) {
	StringArgsDemo demo =new StringArgsDemo("Ram"); 
	 demo.greetUser("welcome","Great day"); 
	 demo.greetUser("Good Day","Have Tea"); 
	 
	StringArgsDemo demo1 =new StringArgsDemo();
	demo1.sayHello("Sri"); 
	demo1.sayHello("Sri","Priya","Reena","Rohan"); 
	demo1.sayHello("Jo","Roni"); 
	} 
	 
	} 