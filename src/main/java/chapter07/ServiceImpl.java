package chapter07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;
	
	@Override
	public List<StudentVO> all(StudentVO vo) {
		return dao.all(vo);
	}
	
	public StudentVO view(int studno) {
		return dao.view(studno);
	}
}
