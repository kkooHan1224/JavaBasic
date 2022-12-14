package ch11;

import java.util.*;
import java.sql.*;

public class RegisterMgr {
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String JDBC_URL = "jdbc:mysql://127.0.0.1:3307/mydb";
	private final String USER = "dev01";
	private final String PASS = "1234";

	public RegisterMgr() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch(Exception e) {
			System.out.println("Error : JDBC 드라이버 로딩 실패");
		}
	}
	
	public Vector<RegisterBean> getRegisterList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Vector<RegisterBean> vlist = new Vector<RegisterBean>();
		
			try {
				conn = DriverManager.getConnection(JDBC_URL, USER, PASS);
				String strQuery = "select * from tblRegister";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(strQuery);
				while (rs.next()) {
					RegisterBean regBean = new RegisterBean();
						regBean.setId (rs.getString("id"));
						regBean.setPwd (rs.getString("pwd"));
						regBean.setName (rs.getString("name"));
						regBean.setNum1 (rs.getString("num1"));
						regBean.setNum2 (rs.getString("num2"));
						regBean.setEmail (rs.getString("email"));
						regBean.setPhone (rs.getString("phone"));
						regBean.setZipcode (rs.getString("zipcode"));
						regBean.setAddress (rs.getString("address"));
						regBean.setJob (rs.getString("job"));
						regBean.setNation (rs.getString("nation"));
						vlist.add(regBean);
				}
			} catch (Exception ex) {
				System.out.println("Exception" + ex);
			} finally {
				if (rs!=null) try {rs.close();} catch(SQLException e){}
				if (stmt!=null) try {stmt.close();} catch(SQLException e){}
				if (conn!=null) try {conn.close();} catch(SQLException e){}
				}
				return vlist;
			}
		}
