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

@WebServlet("/user/cart/userCartDelete.do")
public class UserCartDeleteServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//세션에 저장된 카트 리스트를 불러온다.
		HttpSession session = req.getSession();
//		
//		//세션에 cartList세팅
//		if(session.getAttribute("cartList")==null) {			
//			session.setAttribute("cartList", new ArrayList<UserDownloadPaymentVO>());
//		}
		List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) session.getAttribute("cartList");
		int idx = req.getParameter("idx") == null? -1 : Integer.parseInt(req.getParameter("idx"));
		if(idx!=-1) {			
			cartList.remove(idx);
		}
		
		//새로운 카트 리스트를 세션 업데이트
		session.setAttribute("cartList", cartList);
		resp.getWriter().print(idx);

	}
}
