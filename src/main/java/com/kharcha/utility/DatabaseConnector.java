package com.kharcha.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

	private String dataBaseServer;
	private String portNumber;
	private String userName;
	private String password;
	private String dataBaseName;
	
	
	public DatabaseConnector(String ServerName, String dataBaseName,String portNumber, String userName, String password){
		
		this.dataBaseServer=ServerName;
		this.portNumber=portNumber;
		this.userName=userName;
		this.password=password;
		this.dataBaseName=dataBaseName;

	}
	
	public String getURL(){
		String url="jdbc:mysql://"+getDataBaseServer()+":"+ getPortNumber()+"/"+getDataBaseName();
		return url;
	}
	
	private String getDataBaseName() {
		// TODO Auto-generated method stub
		return dataBaseName;
	}

	public Connection getConnection(){
		
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				con=DriverManager.getConnection(getURL(), getUserName(), getPassword());
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	/**
	 * @return the dataBaseServer
	 */
	public String getDataBaseServer() {
		return dataBaseServer;
	}

	/**
	 * @return the portNumber
	 */
	public String getPortNumber() {
		return portNumber;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
}
