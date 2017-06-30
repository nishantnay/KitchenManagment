package com.kharcha.itemDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.kharcha.itemsBean.MasterItems;
import com.kharcha.utility.DatabaseConnector;

public class ItemAddDao {
	
	ResourceBundle bundle= ResourceBundle.getBundle("DataBase");
	
	DatabaseConnector connector= new DatabaseConnector(bundle.getString("ServerName"), bundle.getString("dataBaseName"),bundle.getString("portNumber"),bundle.getString("userName"),
			bundle.getString("password"));
	
	public String addMasterItem(MasterItems item){
		
		String query= "insert into masteritem (itemname) values ("+item.getItemName()+")";
		
		Connection con=connector.getConnection();
		try {
			Statement st = con.createStatement();
			
			int rs= st.executeUpdate(query);
			
			System.out.println(rs);
			st.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Upadted";
	}

}
