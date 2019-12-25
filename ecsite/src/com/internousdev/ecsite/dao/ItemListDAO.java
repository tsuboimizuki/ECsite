package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {

	public ArrayList<ItemInfoDTO> getItemPageAdminInfo() throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();

		String sql="SELECT * FROM item_info_transaction";
		try{
			PreparedStatement ps= con.prepareStatement(sql);


			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto = new ItemInfoDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_price"));
				dto.setItemStock(rs.getString("item_stock"));
				itemInfoDTO.add(dto);
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			con.close();
		}
		return itemInfoDTO;
	}

	public int entryItemHistoryDelete() throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql="DELETE FROM item_info_transaction";
		PreparedStatement ps;
		int result = 0;
		try{
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			con.close();
		}
		return result;
	}


}
