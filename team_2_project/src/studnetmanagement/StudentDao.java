package studnetmanagement;

import java.util.*;

public interface StudentDao {

	// 학번으로 검색
	public StudentVO selectByNumber(int studentid) throws Exception;
	
	// 학생정보 입력
	public void insertStudent(StudentVO vo) throws Exception;
	
	// 학생정보 검색
	public ArrayList selectstudent(int com, String sl) throws Exception;
	
	// 학생정보 수정
	public int modifystudent(StudentVO vo) throws Exception;
	
	// 학생정보 삭제
	public void delete(int studentid) throws Exception;
}
