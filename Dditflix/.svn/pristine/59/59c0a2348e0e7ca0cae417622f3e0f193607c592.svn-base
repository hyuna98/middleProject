package kr.or.ddit.admin.membership.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.admin.membership.service.AdminMembershipServiceImpl;
import kr.or.ddit.admin.membership.service.IAdminMembershipService;
import kr.or.ddit.admin.membership.vo.AdminMembershipVO;
import kr.or.ddit.user.board.service.BoardServiceImpl;
import kr.or.ddit.user.board.service.IBoardService;
import kr.or.ddit.user.board.vo.BoardVO;

@WebServlet("/admin/membership/delete.do")
public class AdminMembershipDeleteServlet extends HttpServlet {
	private IAdminMembershipService membershipService;
	
	public AdminMembershipDeleteServlet() {
		if(membershipService==null) {
			membershipService = AdminMembershipServiceImpl.getInstance();
		}
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mmbrsId = request.getParameter("mmbrsId")==null? "" : request.getParameter("mmbrsId");
		int cnt = membershipService.deleteMembership(mmbrsId);
		
		response.getWriter().print(cnt);
	}

}
