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

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

@WebServlet("/user/cart/addToCartList.do")
public class AddToCartListServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usersId = req.getParameter("usersId")==null? "" : req.getParameter("userId");
		String contTitle = req.getParameter("contTitle")==null? "" : req.getParameter("contTitle");
		int videoSerno = req.getParameter("videoSerno")==null? 0 : Integer.parseInt(req.getParameter("videoSerno"));
		int epNum = req.getParameter("epNum")==null? 0 : Integer.parseInt(req.getParameter("epNum"));
		int dwnldPymPrice = req.getParameter("dwnldPymPrice")==null? 0 : Integer.parseInt(req.getParameter("dwnldPymPrice"));
		
		HttpSession session = req.getSession();
		
		//세션에 cartList 세팅
		if(session.getAttribute("cartList") == null) {			
			session.setAttribute("cartList", new ArrayList<UserDownloadPaymentVO>());
		}
		
		//세션에 저장된 카트 리스트를 불러온다.
		List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) session.getAttribute("cartList");
		
		//중복체크 - 중복이 아니면 true
		boolean check = true;
		for(UserDownloadPaymentVO vo : cartList) {
			if(vo.getContTitle().equals(contTitle) 
				&& vo.getVideoSerno()==videoSerno
				&& vo.getEpNum()==epNum) {
				check = false;
				resp.getWriter().print(-1);
				break;
			}
		}
	
//		System.out.println(check);
		
		//중복이 아니면 새로 들어온 값을 리스트에 추가
		if(check) {			
			UserDownloadPaymentVO vo = new UserDownloadPaymentVO();
			vo.setUsersId(usersId);
			vo.setContTitle(contTitle);
			vo.setVideoSerno(videoSerno);
			vo.setEpNum(epNum);
			vo.setDwnldPymPrice(dwnldPymPrice);
			cartList.add(vo);

			//새로운 카트 리스트를 세션 업데이트
			session.setAttribute("cartList", cartList);
			
			//결과값 반환
			String fullTitle = contTitle;
			if(videoSerno!=0) {
				fullTitle += " 시즌" + videoSerno + " ";
			}
			if(epNum!=0) {
				fullTitle += epNum + "화";
			}
			resp.setCharacterEncoding("utf-8");
			resp.getWriter().print(fullTitle);
		}
		
	}
}
