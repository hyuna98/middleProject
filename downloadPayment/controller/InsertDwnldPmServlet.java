package kr.or.ddit.user.downloadPayment.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

@WebServlet("/user/cart/insertDwnldPm.do")
public class InsertDwnldPmServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//세션에 저장된 카트 리스트를 불러온다.
		HttpSession session = req.getSession();
		List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) session.getAttribute("cartList");
		
		String selectedCardNo = req.getParameter("selectedCardNo") == null? "" : req.getParameter("selectedCardNo");
		
		int result = 2;
		
		//카트 리스트 초기화
		session.setAttribute("cartList", new ArrayList<UserDownloadPaymentVO>());
		resp.getWriter().print(result);
	}
	
}
