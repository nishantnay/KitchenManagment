package com.kharcha.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kharcha.itemDao.ItemAddDao;
import com.kharcha.itemsBean.MasterItems;

/**
 * Servlet implementation class AddMasterItem
 */
public class AddMasterItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddMasterItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String itemName= request.getParameter("itemname");

		if (!itemName.equals("")){
			MasterItems item= new MasterItems();

			item.setItemName(itemName);
			
			ItemAddDao itd= new ItemAddDao();
			String message=itd.addMasterItem(item);
			request.setAttribute("msg", message);
		}else{
			request.getRequestDispatcher("AddItem.jsp").forward(request, response);
		}

	}

}
