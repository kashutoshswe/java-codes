package com.cdac;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ExampleAnnotation {

	public static void main(String[] args) {
	
		String s= new String();
		Class s_class=s.getClass();
		
		int m=s_class.getModifiers();
		String md=Modifier.toString(m);


		System.out.println(s_class.getName()+" "+md);
		System.out.println(s_class.getSuperclass().getName());


		Method mtds[]=s_class.getMethods();
		for(Method m1:mtds){
			System.out.println(m1.getModifiers()+" "+m1.getName());
		}
		
	        Annotation ans[]=s_class.getAnnotations();		
		for(Annotation A:ans){
		System.out.println(A.getClass().getName());
		}
		}
	

}
