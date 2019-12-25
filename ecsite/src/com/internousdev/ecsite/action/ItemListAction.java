package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport {

	private ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {

		if(deleteFlg == null){
//
			itemList = itemListDAO.getItemPageAdminInfo();
		}
		String result = SUCCESS;

		return result;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public ArrayList<ItemInfoDTO> getItemList(){
		return this.itemList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}










}
