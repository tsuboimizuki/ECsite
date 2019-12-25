package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements  SessionAware{

	private ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoList = new  ArrayList<ItemInfoDTO>();
	private String deleteFlg;
	private String message;


	public String execute() throws SQLException{
		 if(deleteFlg == null){

			 itemInfoList = itemListDAO.getItemPageAdminInfo();

		  } else if(deleteFlg.equals("1")){
			  	delete();
		  }

		 String result = SUCCESS;
		 return result;
	}
	public void delete() throws SQLException {



		int res = itemListDAO.entryItemHistoryDelete();


		if(res > 0){
			itemInfoList = null;
				setMessage("商品情報を正しく削除されました。");
		} else if(res == 0){
				setMessage("商品情報の削除に失敗しました。");
		}
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public ArrayList<ItemInfoDTO> getItemInfoList(){
		return this.itemInfoList;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
