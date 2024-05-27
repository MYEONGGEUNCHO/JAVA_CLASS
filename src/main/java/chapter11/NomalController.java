package chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NomalController {
	
	@ResponseBody
	@GetMapping("/member/index.do")
	public Map<String, Object> index() {
		MemberVO vo = new MemberVO();
		
		vo.setNo(1);
		vo.setId("홍길동");
		vo.setName("hong");
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		list.add(vo);
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("items", list);
		map.put("display", 5);
		map.put("total", 5);
		return map;
	}
}
