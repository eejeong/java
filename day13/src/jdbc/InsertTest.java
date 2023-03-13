package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공.");
		
		// Connect
		String id = "bank"; // workspace
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.21.69:1521:XE";
		Connection con= null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("접속 실패!");
			e.printStackTrace();
			return;
		}
		System.out.println("접속 성공!");
		
		// Statement 생성 - SQL
		// SQL 전송
		String insertSq1 = "INSERT INTO cust VALUES(?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertSq1);
			pstmt.setString(1, "id20");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "6조");
			pstmt.setInt(4,50);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			pstmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		// 결과 받기
		
		// Close
		try {
			if(con != null) {
			con.close();
			}
		} catch (SQLException e) {
			System.out.println("close 실패!");
			e.printStackTrace();
		}
		System.out.println("close 성공!");
	}

}
