package com.lyl.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lyl.entity.studentinfo;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudengInfoDaoImpl {

	private Connection conn;
	private PreparedStatement pstmt;

	public StudengInfoDaoImpl() {
		conn = (Connection) new conn.conn().getCon();
	}

	public boolean save(studentinfo student) {

		try {
			pstmt = (PreparedStatement) conn.prepareStatement(
					"insert into studentinfo" + "(nicheng,truename,xb,csrq,zy,kc,xq,bz) " + "values(?,?,?,?,?,?,?,?)");
			pstmt.setString(1, student.getNicheng());
			pstmt.setString(2, student.getTruename());
			pstmt.setByte(3, student.getXb());
			pstmt.setString(4, student.getCsrq());
			pstmt.setString(5, student.getZy());
			pstmt.setString(6, student.getKcs());
			pstmt.setString(7, student.getXqs());
			pstmt.setString(8, student.getBz());

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("rawtypes")
	public List queryAllStu() {
		List stus = new ArrayList();
		try {
			pstmt = (PreparedStatement) conn.prepareStatement("select * from studentinfo");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				studentinfo stu = new studentinfo();
				stu.setId(rs.getInt(1));
				stu.setNicheng(rs.getString(2));
				stu.setTruename(rs.getString(3));
				stu.setXb(rs.getByte(4));
				if (rs.getDate(5) != null)
					stu.setCsrq(rs.getDate(5).toString());
				stu.setZy(rs.getString(6));
				if (rs.getString(7) != null)
					stu.setKc(rs.getString(7).split("&"));
				if (rs.getString(8) != null)
					stu.setXq(rs.getString(8).split("&"));
				stu.setBz(rs.getString(9));
				stus.add(stu);

			}
			return stus;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
