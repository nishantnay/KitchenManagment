package com.kharcha.itemDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.kharcha.itemsBean.MasterItems;
import com.kharcha.utility.DatabaseConnector;


public class ShowItemDao {
	ResourceBundle bundle= ResourceBundle.getBundle("DataBase");

	DatabaseConnector connector= new DatabaseConnector(bundle.getString("ServerName"), bundle.getString("dataBaseName"),bundle.getString("portNumber"),bundle.getString("userName"),
			bundle.getString("password"));

	public List<MasterItems> getItems(){
		List<MasterItems> itemList= new ArrayList<MasterItems>();
		
		String sql="select name from masteritem";
		Connection con=connector.getConnection();
		try {
			Statement st = con.createStatement();
			
			ResultSet rs=st.executeQuery(sql);
			
			rs.next();
			while(rs.next()){
				MasterItems item= new MasterItems();
				item.setItemName(rs.getNString("name"));
				itemList.add(item);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemList;
	}
}
