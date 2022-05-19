package kr.or.ddit.user.downloadPayment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.myCardInfo.service.IUserMyCardInfoService;
import kr.or.ddit.user.myCardInfo.service.UserMyCardInfoServiceImpl;
import kr.or.ddit.user.myCardInfo.vo.UserMyCardInfoVO;

@WebServlet("/user/cart/getDwnldPm.do")
public class getDwnldPmServlet extends HttpServlet {
	
	private IUserMyCardInfoService cardInfoService;
	
	public getDwnldPmServlet() {
		if(cardInfoService==null) {
			cardInfoService = UserMyCardInfoServiceImpl.getInstance();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<UserMyCardInfoVO> cardInfoList = cardInfoService.getMyCardList("A001");
		
		req.setAttribute("cardInfoList", cardInfoList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/cart/getDwnldPm.jsp");
		dispatcher.forward(req, resp);
		
	}
}
