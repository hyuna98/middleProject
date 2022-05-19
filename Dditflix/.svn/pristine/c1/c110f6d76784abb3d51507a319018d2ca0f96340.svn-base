package kr.or.ddit.admin.membership.controller;

import java.io.IOException;
import java.net.URLEncoder;

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

@WebServlet("/admin/membership/insert.do")
public class AdminMembershipInsertServlet extends HttpServlet {
	private IAdminMembershipService membershipService;
	
	
	
	public AdminMembershipInsertServlet() {
		if(membershipService==null) {
			membershipService = AdminMembershipServiceImpl.getInstance();
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/admin/membership/insert.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mmbrsId = request.getParameter("mmbrsId")==null? "" : request.getParameter("mmbrsId");
		String mmbrsRating = request.getParameter("mmbrsRating")==null? "" : request.getParameter("mmbrsRating");
		String mmbrsPrice = request.getParameter("mmbrsPrice")==null? "" : request.getParameter("mmbrsPrice");
		String mmbrsQualityGrade = request.getParameter("mmbrsQualityGrade")==null? "" : request.getParameter("mmbrsQualityGrade");
		
		
		String mmbrsLogoUrl = "";
		
		
		AdminMembershipVO vo = new AdminMembershipVO();
		vo.setMmbrsId(mmbrsId);
		vo.setMmbrsRating(mmbrsRating);
		vo.setMmbrsPrice(mmbrsPrice);
		vo.setMmbrsQualityGrade(mmbrsQualityGrade);
		vo.setMmbrsLogo(mmbrsLogoUrl);
		
		int cnt = membershipService.insertMembership(vo);
		
		if(cnt > 0) {
			response.getWriter().print("성공");
		} else {
			response.getWriter().print("실패");
		}
	}

}
