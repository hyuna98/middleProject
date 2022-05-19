package kr.or.ddit.user.downloadPayment.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.downloadPayment.service.IUserDownloadPaymentService;
import kr.or.ddit.user.downloadPayment.service.UserDownloadPaymentServiceImpl;
import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

@WebServlet("/user/cart/paymentCart.do")
public class PaymentCartServlet extends HttpServlet {
	
	private IUserDownloadPaymentService service;
	
	public PaymentCartServlet() {
		if(service==null) {
			service = UserDownloadPaymentServiceImpl.getInstance();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		//세션에 저장된 카트 리스트를 불러온다.
		List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) session.getAttribute("cartList");
		
		//-1:결제오류
		//1:결제완료
		int result = service.insertPaymentCart(cartList, "A001");
		resp.getWriter().print(result);
		
	}
}
