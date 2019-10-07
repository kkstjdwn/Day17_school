package com.sungju.point;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sungju.util.DBconnectorForuser01;

public class PointDAO {
	
	//	id/pw 로 점수조회
	
	Connection con;
	PreparedStatement st;
	ResultSet rs;
	String sql;
	
	public PointDAO() {
		con = null;
		st = null;
		rs = null;
		sql = null;
	}
	
	public PointDTO search(String id, String pw) {
		PointDTO dto = null;
		try {
			con = DBconnectorForuser01.getConnect();
			sql = "select p.num,p.name,kor,eng,math,total,avr from point p inner join MEMBER m "
					+ "on(p.num = m.num) where m.id = ? and m.pw = ? ";
			
			st = con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pw);
			
			rs = st.executeQuery();
			
			if (rs.next()) {
				dto = new PointDTO();
				dto.setNum(rs.getInt(1));;
				dto.setName(rs.getString(2));
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt(4));
				dto.setMath(rs.getInt(5));
				dto.setTotal(rs.getInt(6));
				dto.setAvr(rs.getDouble(7));
				
			} else {
				System.out.println("id나 pw가 일치하지 않습니다");
			}
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return dto;
	}

}
