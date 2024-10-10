package studnetmanagement;

import java.sql.*;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{

	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL	 = "jdbc:oracle:thin:@192.168.0.14:1521:xe";
	private static final String DBUSER	 = "jinsang";
	private static final String DBPASS	 = "hwang";

	public StudentDaoImpl() throws Exception{
		// 드라이버 로딩
		Class.forName(DBDRIVER);
	}
		// 학생정보 입력
		public void insertStudent(StudentVO vo) throws Exception{
			
			Connection con 		 = null;
			PreparedStatement ps = null;
			
			// sql 문장 입력
			String sql = "INSERT INTO K_STUDENT(studentid, classname, sname, gender, age, tel, addr)"
					+ 	 "VALUES(?, ?, ?, ?, ?, ?, ?)";
			
			try {
				// 연결객체 얻어오기
				con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
				
				// 전송객체 얻어오기
				ps = con.prepareStatement(sql);
				
				ps.setInt(1, vo.getStudentid());
				ps.setString(2, vo.getClassname());
				ps.setString(3, vo.getSname());
				ps.setString(4, vo.getGender());
				ps.setInt(5, vo.getAge());
				ps.setString(6, vo.getTel());
				ps.setString(7, vo.getAddr());
				
			}finally {
				con.close();
				ps.close();
		}
	}
		// 학번으로 검색
		@Override
		public StudentVO selectByNumber(int studentid) throws Exception {
			
			StudentVO stv = new StudentVO();
			
			Connection con 		 = null;
			PreparedStatement ps = null;

			String sql = "SELECT 	*			"
					+ 	 "FROM		k_student	"
					+ 	 "WHERE		studentid = ?";
			
			try {
				// 연결 객체 얻어오기
				con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
				
				// 전송객체 얻어오기
				ps = con.prepareStatement(sql);
				
				// 전송
				ps.setInt(1, studentid);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					stv.setStudentid(rs.getInt("STUDENTID"));
					stv.setClassname(rs.getString("CLASSNAME"));
					stv.setSname(rs.getString("SNAME"));
					stv.setTel(rs.getString("TEL"));
					stv.setGender(rs.getString("GENDER"));
					stv.setAge(rs.getInt("AGE"));
					stv.setAddr(rs.getString("ADDR"));
					
				}
			}finally {
				ps.close();
				con.close();
			}
			return stv;
		}
		@Override
		public ArrayList selectstudent(int studentid, String sname) throws Exception {
			
			
			return null;
		}
		@Override
		public int modifystudent(StudentVO vo) throws Exception {
			int mody = 0;
			
			Connection con 		 = null;
			PreparedStatement ps = null;
			String sql = "UPDATE k_student "
					+ 	 "SET	 SNAME = ?, TEL = ?, GENDER = ?, AGE = ?, ADDR = ? "
					+ 	 "WHERE	 STUDENTID = ?";
			
			try {
				//연결객체 얻어오기
				con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

				//전송객체 얻어오기 및 입력값 전달
				ps = con.prepareStatement(sql);
				ps.setString(1, vo.getSname());
				ps.setString(2, vo.getTel());
				ps.setString(3, vo.getGender());
				ps.setInt(4, vo.getAge());
				ps.setString(5, vo.getAddr());
				ps.setInt(6, vo.getStudentid());
			
			ps.executeUpdate();
				
			}finally {
				//  닫기
				ps.close();
				con.close();
			}
			return mody;
			
		}
		@Override
		public void delete(int studentid) throws Exception {
			
			
		}
}