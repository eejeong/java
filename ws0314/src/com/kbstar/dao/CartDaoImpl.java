package com.kbstar.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart>{
	
	public CartDaoImpl() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		//System.out.println("Driver Loading 성공.");
	}

	@Override
	public void insert(Cart v) throws Exception {
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUserId());
			pstmt.setString(3, v.getItemId());
			pstmt.setInt(4, v.getCnt());
			pstmt.executeUpdate();			
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("존재하지 않는 아이디입니다.");
			}
		} catch(Exception e1) {
			throw e1;
		}
		
	}

	@Override
	public void update(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartUpdateSql);) {
			pstmt.setString(1, v.getUserId());
			pstmt.setString(2, v.getItemId());
			pstmt.setDouble(3, v.getCnt());
			pstmt.setString(4, v.getId());

			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("없음");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql);) {
			pstmt.setString(1, k);
			try(ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String id = rset.getString("id");
			    String user_Id = rset.getString("user_id");
			    String item_Id = rset.getString("item_id");
			    int cnt = rset.getInt("cnt");
			    Date regdate = rset.getDate("regdate");
			    cart = new Cart(id, user_Id, item_Id, cnt, regdate);
			} catch(Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return cart;
	}

	@Override
	public List<Cart> selectListAll() throws Exception {
		List<Cart> cartList = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectAllSql)) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					String id = rset.getString("id");
				    String user_Id = rset.getString("user_id");
				    String item_Id = rset.getString("item_id");
				    int cnt = rset.getInt("cnt");
				    Date regdate = rset.getDate("regdate");
					cartList.add(new Cart(id, user_Id, item_Id, cnt, regdate));
				}
				if (cartList.size() == 0) {
					throw new Exception("DB 에러 : 리스트 미존재");
				}
			}
		} catch (Exception e) {
			throw new Exception("DB 에러 : 시스템 에러");
		}
		return cartList;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		List<Cart> cartList = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.mycartSelectAllSql)) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					String id = rset.getString("id");
				    String user_Id = rset.getString("user_id");
				    String item_Id = rset.getString("item_id");
				    int cnt = rset.getInt("cnt");
				    Date regdate = rset.getDate("regdate");
					cartList.add(new Cart(id, user_Id, item_Id, cnt, regdate));
				}
				if (cartList.size() == 0) {
					throw new Exception("DB 에러 : 리스트 미존재");
				}
			}
		} catch (Exception e) {
			throw new Exception("DB 에러 : 시스템 에러");
		}
		return cartList;
	}

}
