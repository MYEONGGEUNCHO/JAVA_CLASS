package chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberServiceImpl implements MemberService {
	@Autowired // 자동주입, 전제조건(반드시 빈에 등록된 객체만 가능) -> 객체 타입으로 조회
	@Qualifier("memberDAO2") // 빈이름 지정 -> 같은 타입의 메서드를 여러개 쓰는 경우 지정해서 써줘야한다.
	private MemberDAO dao;
//	public void setDao(MemberDAO dao) {
//		this.dao = dao;
//	}

	@Override
	public void regist() {
//		MemberDAO dao = new MemberDAOImpl();
		dao.regist();
	}

}
