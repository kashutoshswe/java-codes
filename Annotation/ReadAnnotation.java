package com.cdac;

import java.lang.annotation.Annotation;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;


import java.lang.reflect.Field;
public class ReadAnnotation {
	
	
	
	public static String getEntityName(Class class1){
	   Annotation annotation = class1.getAnnotation(MyEntity.class);
    
	   MyEntity mEntity=(MyEntity)annotation;

	   String tablename=mEntity.tableName();
	   
	   return tablename;
   }
	
	
	
	
   public static String  getFildName(Class class1){
	  String name=null;
	  String datatype1=null;
	  String datatype2=null;
	  String cntrName=null;
	  Field fields[]=class1.getDeclaredFields();
	   for(Field field : fields){
	         Class dtype = field.getType();
	         name = field.getName();
	         datatype1=dtype.getTypeName();
	         System.out.println(datatype1);
	         if(datatype1.equals("java.lang.String")){
	        	 datatype2="varchar(10)";
	         }else{
	        	 datatype2=datatype1;
	         }
	      //  System.out.println("Clo name "+name+" "+dtype.getTypeName());
	        Annotation aArr[]= field.getDeclaredAnnotations(); //do something to these
	        for(Annotation m_annotation :aArr)
	        {
	        	if(m_annotation instanceof MyColumn){
	        		MyColumn mCol=(MyColumn)m_annotation;
	    	        	name=mCol.columnName();
	        	}
	        	if(m_annotation instanceof MyId ){
	        		MyId mId=(MyId)m_annotation;;
	    	        cntrName="Primary Key";
	        		
	        	}
	        }
	        //MyColumn mCol=(MyColumn)aArr[0];
	        //name=mCol.columnName();
	        
	   }
	   return name+" "+datatype2+" "+cntrName;
   }
   public static void createTable(Class class1)
    {
	   String tableName=getEntityName(class1);
	   String colName=getFildName(class1);
	   System.out.println(colName);
	   Connection con=JdbcConnection.getConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "root");
           String query="CREATE TABLE IF NOT EXISTS "+tableName+"("+colName+")";
            try {
		Statement st= con.createStatement();
		st.executeUpdate(query);

	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	   }finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
	   }
}
