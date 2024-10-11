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
	
	// 학생정보 등록
	public void insertStudent(StudentVO vo) throws Exception{

		Connection con 		 = null;
		PreparedStatement ps = null;

		// sql 문장 입력
		String sql = "INSERT INTO K_STUDENT(studentid, classname, sname, gender, age, tel, addr)"
				+ 	 "VALUES(SEQ_STUDENTID.NEXTVAL, ?, ?, ?, ?, ?, ?) ";
		
		//예외처리
		try {
			// 연결객체 얻어오기
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

			// 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 전송객체에 값지정
			ps.setString(1, vo.getClassname());
			ps.setString(2, vo.getSname()	 );
			ps.setString(3, vo.getGender()	 );
			ps.setInt	(4, vo.getAge()		 );
			ps.setString(5, vo.getTel()		 );
			ps.setString(6, vo.getAddr()	 );

			// 전송
			ps.executeUpdate();

		}finally {
			// 닫기
			con.close();
			ps.close ();
		}
	}
	// 학번으로 검색
	@Override
	public StudentVO selectByNumber(int studentid) throws Exception {

		StudentVO stv = new StudentVO();

		Connection con 		 = null;
		PreparedStatement ps = null;
		
		// sql문장
		String sql = "SELECT 	*			 "
				+ 	 "FROM		k_student	 "
				+ 	 "WHERE		studentid = ?";
		// 예외처리
		try {
			// 연결 객체 얻어오기
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

			// 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 전송
			ps.setInt(1, studentid);

			// select문이라 ResultSet 변수에다가 값 지정
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				stv.setStudentid(rs.getInt("STUDENTID")		);
				stv.setClassname(rs.getString("CLASSNAME")	);
				stv.setSname	(rs.getString("SNAME")		);
				stv.setTel		(rs.getString("TEL")		);
				stv.setGender	(rs.getString("GENDER")		);
				stv.setAge		(rs.getInt("AGE")			);
				stv.setAddr		(rs.getString("ADDR")		);

			}
		}finally {
			// 닫기
			ps.close();
			con.close();
		}
		// 값들이 저장된 StudentVO의 변수 stv 리턴
		return stv;
	}
	// 학생정보 전체 검색
	@Override
	public ArrayList selectstudent(int com, String sl) throws Exception {
		ArrayList list = new ArrayList();


		Connection con 		 = null;
		PreparedStatement ps = null;

		// 검색창 콤보박스에서 입력받을값 지정
		String [] total = {"STUDENTID", "TEL","SNAME"};

		// sql문장
		String sql =	" SELECT STUDENTID, CLASSNAME, SNAME, TEL, GENDER, AGE, ADDR "
				+ 		" FROM k_student "
				+ 		" WHERE " + total[com] + " like '%" + sl + "%'";
		// 예외처리
		try {
			// 연결객체 얻어오기
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

			// 전송객체 얻어오기
			ps = con.prepareStatement(sql);

			// 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ArrayList temp = 	  new ArrayList();
				temp.add(rs.getInt	 ("STUDENTID")	);
				temp.add(rs.getString("CLASSNAME")	);
				temp.add(rs.getString("SNAME")		);
				temp.add(rs.getString("TEL")		);
				temp.add(rs.getString("GENDER")		);
				temp.add(rs.getInt	 ("AGE")		);
				temp.add(rs.getString("ADDR")		);

				list.add(temp);
			}	
		}finally {
			// 닫기
			ps.close ();
			con.close();
		}
		// 학생 정보가 담긴 ArrayList의 list 리턴
		return list;
	}
	// 학생정보 수정
	@Override
	public int modifystudent(StudentVO vo) throws Exception {
		
		int mody = 0;

		Connection con 		 = null;
		PreparedStatement ps = null;
		
		// sql문장
		String sql = "UPDATE k_student "
				+ 	 "SET	 CLASSNAME = ?, SNAME = ?, TEL = ?, GENDER = ?, AGE = ?, ADDR = ? "
				+ 	 "WHERE	 STUDENTID = ? ";

		try {
			//연결객체 얻어오기
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);

			//전송객체 얻어오기 및 입력값 전달
			ps = con.prepareStatement(sql);
			
			ps.setString(1, vo.getClassname()	);
			ps.setString(2, vo.getSname()		);
			ps.setString(3, vo.getTel()			);
			ps.setString(4, vo.getGender()		);
			ps.setInt	(5, vo.getAge()			);
			ps.setString(6, vo.getAddr()		);
			ps.setInt	(7, vo.getStudentid()	);

			// 인트변수에 입력값 저장
			mody =	ps.executeUpdate();

		}finally {
			//  닫기
			ps.close ();
			con.close();
		}
		// mody에 입력값넣고 리턴
		return mody;
	}
	@Override
	// 학번으로 검색 후 정보 삭제
	public void delete(int studentid) throws Exception {
		
		StudentVO vo = new StudentVO();

		Connection con 		 = null;
		PreparedStatement ps = null;

		// sql문장
		String sql =	"DELETE "
				+ 		"FROM k_student "
				+ 		"WHERE studentid = ? ";
		// 예외처리
		try {
			// 연결객체 등록
			con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
			
			// 전송객체 등록
			ps = con.prepareStatement(sql);
			ps.setInt(1, studentid);
			
			// 전송
			ps.executeUpdate();
		}finally {
			// 닫기
			con.close();
			ps.close();
		}
	}
}