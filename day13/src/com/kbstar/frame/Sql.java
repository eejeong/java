package com.kbstar.frame;

public class Sql {
	public static String deleteSq1 = "DELETE FROM cust WHERE id = ?";
	public static String insertSq1 = "INSERT INTO cust VALUES(?,?,?,?)";
	public static String updateSq1 = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	public static String selectSq1 = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSq1 = "SELECT * FROM cust ";
}
