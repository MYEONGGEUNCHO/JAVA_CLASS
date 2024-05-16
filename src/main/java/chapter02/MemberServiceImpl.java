package chapter02;

public class MemberServiceImpl implements MemberService {
	// 선언
	MemberDAO dao;
	
	// 메서드에서 주입
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}
	
	// 
	@Override
	public void regist() {
		// TODO Auto-generated method stub
		dao.regist();
	}
	
}
