package kr.or.ddit.user.login.service;

import kr.or.ddit.user.login.vo.LoginVO;

public interface ILoginService {
	
	// 로그인
	public LoginVO loginCheck(LoginVO vo);
	
	// 아이디찾기
	public String findId(LoginVO vo);
		
	// 비밀번호찾기
	public String findPw(LoginVO vo);

}
