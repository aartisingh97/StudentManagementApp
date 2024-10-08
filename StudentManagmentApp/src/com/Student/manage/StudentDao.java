package com.Student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		// jdbc code
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			// Prepared statement to fire the query
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			// execute
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
