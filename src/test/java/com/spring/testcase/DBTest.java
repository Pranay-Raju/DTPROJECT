package com.spring.testcase;


/*ResultSet MetaData
======================
->ResultSet: Returning data from database
->ResultSetMetaData:object contain the information about the resultset that is

1.ColumnNames 
2.NoOfColumns
3.DataTypeOfColumns

Syntax for Creating ResultSetMetaData object

ResultSetMetaData rsmd=rs.getMetaData();

*/
import java.sql.*;
import java.util.Scanner;
public class DBTest {
	public static void main(String[] args) {

	

			
			try {

				Class.forName("org.h2.Driver");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/piyush","sa","");
		
	String qry="select email,password from users where email=? and password=?";

		PreparedStatement stmt=con.prepareStatement(qry);
		
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
		System.out.println("Enter email");
		stmt.setString(1, s.next());
		System.out.println("Enter Password");
		stmt.setString(2, s.next());
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("EMAIL"));
			System.out.println(rs.getString("PASSWORD"));
			
		}
		
		
		
		
		} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}

	}
