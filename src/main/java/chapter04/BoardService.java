package chapter04;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface BoardService {
	
	// 추상메서드
	void list();
}
