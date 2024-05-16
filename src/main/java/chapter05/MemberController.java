package chapter05;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member") // 모든 메서드의 URL앞에 포함
public class MemberController {
	@RequestMapping({"/member/index.do", "/member/index2.do", "/member.do"} )
	public String index() {
		System.out.println("index");
		return "/member/index";
	}
	
	@RequestMapping(value="/index.do", method = RequestMethod.GET)
	public String index2() {
		System.out.println("index");
		return "home";
	}
	
	@GetMapping("/index2.do")
	public String index22() {
		return "member/index"; // /WEB-INF/views/[ ].jsp
	}
	
	@GetMapping("/test/index.do")
	public void test() {
		// void인 경우 URL과 동일한 경로로 **포워딩**
		
	}
	
	// 리다이렉트
	// member/test.do -> member/test/index.do
	@GetMapping("/test.do")
	public String test2() {
//		return "redirect: /test/member/test/index.do";
		return "redirect:/member/test/index.do";
	}
	
	// 파라미터 받는 방법 5가지
	// 1. HttpServletRequest
	@GetMapping("/param1.do")
	public String param1(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		System.out.println("id: " + id);
		return "member/param1";
	}
	
	// 2. RequestRaram
	@GetMapping("/param2.do")
	public String param2(
				@RequestParam(
				name = "id",
				required = false,
				defaultValue = "hong"
			) String ids,									
			int age) {	
		String id = "";
		System.out.println("id: " + ids);
		System.out.println("age: " + age);
		return "member/param1";
	}
	
	// 3. 커맨드 객체 (ModelAttribute)
	// 파라미터이름과 setter (id -> setId()) -> lombok을 써서 자동으로 해주기 때문에 몰랐던것...
	// 모든 파라미터 중 해당하는 값을 vo에 저장
	// request에도 저장
	@GetMapping("/param3.do")
	public String param3(MemberVO vo) {
		System.out.println(vo);
		return "member/param1";
	}
	
	// 4. @PathVariable  경로 변수?
	@GetMapping("/view/{id}/{age}")
	public String param4(
			@PathVariable String id,
			@PathVariable int age,
			HttpServletRequest req,
			HttpSession sess
			) {
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		return "member/param1";
	}
	
	
	@GetMapping("/save.do")
	public String save(
			HttpServletRequest req,
			Model model) {
		
		// request 저장
		// 1. request저장
		req.setAttribute("name", "홍길동");
		// 2. model에 저장
		model.addAttribute("email", "hong@gmail.com");
		// 3. ModelAndView
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/save");
		mav.addObject("id", "hong");
		
		// session 저장
		HttpSession sess = req.getSession();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "이순신");
		map.put("age", 40);
		map.put("id", "lee");
		sess.setAttribute("login", map);
		
		
		return "/member/save";
	}
}
