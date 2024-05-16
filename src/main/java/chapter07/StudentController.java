package chapter07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/student/index.do")
	public String index(Model model, StudentVO vo) {
		List<StudentVO> list = service.all(vo);
		model.addAttribute("list", list);
		return "student/index";
	}
	
	@GetMapping("/student/view.do")
	public String view(Model model, int studno) {
		StudentVO vo = service.view(studno);
		model.addAttribute("vo", vo);
		return "student/view";
	}
}
