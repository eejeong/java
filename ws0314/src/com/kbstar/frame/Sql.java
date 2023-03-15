package com.kbstar.frame;

public class Sql {
	// Cust DML
	public static String deleteSq1 = "DELETE FROM cust WHERE id = ?";
	public static String insertSq1 = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSq1 = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String selectSq1 = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSq1 = "SELECT * FROM cust ";

	// Item DML
	public static String itemDeleteSq1 = "DELETE FROM item WHERE id = ?";
	public static String itemInsertSq1 = "INSERT INTO item VALUES(?,?,?,?,SYSDATE)";
	public static String itemUpdateSq1 = "UPDATE item SET name=?, price=?, rate=? WHERE id=?";
	public static String itemSelectSq1 = "SELECT * FROM item WHERE id=?";
	public static String itemSelectAllSq1 = "SELECT * FROM item";

	// Cart DML
	public static String cartDeleteSql = "DELETE FROM cart WHERE id=?";
	public static String cartInsertSql = "INSERT INTO cart VALUES(?, ?, ?, ?, SYSDATE)";
	public static String cartUpdateSql = "UPDATE cart SET user_Id=?, item_Id=?, cnt=? WHERE id=?";
	public static String cartSelectSql = "SELECT *  FROM cart WHERE id=?";
	public static String cartSelectAllSql = "SELECT *  FROM cart";
	public static String mycartSelectAllSql = "SELECT *  FROM cart WHERE user_id = ?";
}
