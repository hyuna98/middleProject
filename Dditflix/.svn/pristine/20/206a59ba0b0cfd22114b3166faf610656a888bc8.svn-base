package kr.or.ddit.user.home.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;


@WebServlet("/user/home/sub.do")
public class UserSubServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) req.getAttribute("cartList");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/home/sub.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
