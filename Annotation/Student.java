package com.cdac;
@MyEntity(tableName="mcastudent")
public class Student {
    @MyColumn(columnName="prno")
	@MyId
	private String rollno;

	public Student(String rollno) {
		super();
		this.rollno = rollno;
	}

	public Student() {
		super();
	}
    
}
