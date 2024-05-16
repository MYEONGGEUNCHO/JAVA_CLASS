package chapter07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
	@Autowired
	private SqlSessionTemplate sst;
	
	// 전체학생목록 조회 리턴
	public List<StudentVO> all(StudentVO vo) {
		return sst.selectList("student.all", vo);
	}
	
	public StudentVO view(int studno) {
		
		return sst.selectOne("student.view", studno);
	}
}
