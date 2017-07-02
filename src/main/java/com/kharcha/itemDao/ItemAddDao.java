package com.kharcha.itemDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

		//String name=item.getItemName();
		String query= "insert into masteritem (name)"+" values (?)";            //("\"Hello\")";

		Connection con=connector.getConnection();
		try {
			PreparedStatement st= con.prepareStatement(query);

			st.setString(1, item.getItemName());

			st.execute();
			st.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Upadted";
	}

}
