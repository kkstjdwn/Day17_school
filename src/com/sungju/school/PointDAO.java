package com.sungju.school;

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
	int result;
	
	public PointDAO() {
		con = null;
		st = null;
		rs = null;
		sql = null;
		result = 0;
	}
	
	

}
