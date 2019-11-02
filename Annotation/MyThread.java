package com.cdac;

import java.util.ArrayList;
import java.util.Date;

public class MyThread extends Thread{
    @Override
	public void run(){
		System.out.println("Hello");
	}
		public static void main(String arg[]){
	       new MyThread().start();	
	      
	       Date d= new Date(2019, 2, 23);
	            System.out.println(d);
		  MyClass mClass= new MyClass();
		  mClass.m1();
		  mClass.m2();
		  @SuppressWarnings(value = { "raw" })
		  ArrayList  a= new ArrayList<>();
		  
		} 
}
