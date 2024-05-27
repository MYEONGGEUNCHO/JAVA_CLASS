package kr.co.test;

import org.junit.Test;

import chapter12.util.SendMail;

public class MailTest {
	@Test
	public void test() {
		SendMail.sendMail("withsky999@naver.com", "withsky999@gmail.com", "제목", "내용");
	}
}
