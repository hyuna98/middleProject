package kr.or.ddit.user.login.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class LoginDaoImpl implements ILoginDao{

	private SqlMapClient smc;
	private static ILoginDao dao;
	
	private LoginDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ILoginDao getInstance() {
		if(dao == null) {
			dao = new LoginDaoImpl();
		}
		return dao;
	}
	
	@Override
	public LoginVO loginCheck(LoginVO vo) throws Exception {
		
		return (LoginVO) smc.queryForObject("user.loginChk", vo);
	}

	@Override
	public String findId(LoginVO vo) throws Exception {
		
		return (String) smc.queryForObject("user.findID", vo);
	}

	@Override
	public String findPw(LoginVO vo) throws Exception {
	
		return (String) smc.queryForObject("user.findPw", vo);
	}

}
