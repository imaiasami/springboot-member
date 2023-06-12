package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
	@GetMapping(value = "/join")
	public String main() {
		return "memberJoin";
	}
	
	@PostMapping("/join")
	public String join() {
		// 아이디
		// 패스워드
		// 이름
		// 이메일
		// 주소
		// 휴대폰 번호
		// 위 정보들이 로그에 출력될 수 있도록 해보라
		return "joinSuccess";
	}

}
