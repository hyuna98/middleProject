package kr.or.ddit.admin.member.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.admin.member.service.AdminMemberServiceImpl;
import kr.or.ddit.admin.member.service.IAdminMemberService;
import kr.or.ddit.admin.member.vo.UsersVO;

@WebServlet("/admin/member/AdminMember.do")
public class AdminMemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		IAdminMemberService service = AdminMemberServiceImpl.getInstance();
	      
	      List<UsersVO> list = service.getAllUserList();
	      
	      request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin/member/member.jsp");
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 파라미터정보 가져오기
		String users_id = request.getParameter("users_id");
		
		IAdminMemberService service = AdminMemberServiceImpl.getInstance();
		
		// vo에 값 넣기
		UsersVO uv = new  UsersVO();
		uv.setUsers_id(users_id);
		
		int cnt = service.authorization(uv.getUsers_id());
		
		String msg = "";
		if(cnt >0) {
			msg="성공";
		}else {
			msg="실패";
		}
		
		String redirectUrl = request.getContextPath() + "/admin/member/AdminMember.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
	}

}
