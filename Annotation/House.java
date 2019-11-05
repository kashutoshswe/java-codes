package com.cdac;

@MyEntity(tableName = "myownhouse")

public class House {

@MyColumn(columnName="ourhno")
@MyId
private int hno;

public House(){
	
}
public House(int hno){
	this.hno=hno;
}
public int getHno() {
	return hno;
}

public void setHno(int hno) {
	this.hno = hno;
}
  
}
