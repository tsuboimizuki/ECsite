package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ItemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;//商品の名前
	private String itemPrice;//商品の値段
	private String itemStock;//商品の在庫数
	private Map<String, Object> session;


	public String execute() {

		String result = SUCCESS;
		if(!(itemName.equals(""))
			&&!(itemPrice.equals(""))
			&&!(itemStock.equals(""))){
				session.put("itemName", itemName);
				session.put("itemPrice", itemPrice);
				session.put("itemStock", itemStock);
		}

		return result;
	}

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public String getItemStock(){
		return itemStock;
	}

	public void setItemStock(String itemStock){
		this.itemStock = itemStock;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}






}
