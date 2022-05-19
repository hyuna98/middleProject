package kr.or.ddit.user.myPage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.myPage.service.IUserWishListService;
import kr.or.ddit.user.myPage.service.UserWishListServiceImpl;
import kr.or.ddit.user.myPage.vo.wishListVO;


@WebServlet("/user/myPage/addWishList.do")
public class UserAddWishListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserAddWishListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String title = request.getParameter("title");
		String msg = "";
		
		wishListVO vo = new wishListVO();
		vo.setUsers_id(userId);
		vo.setCont_title(title);
		
		IUserWishListService service = UserWishListServiceImpl.getInstance();
		int result = service.insertWishList(vo);
		
		if(result > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/WEB-INF/views/user/myPage/addWishList.jsp").forward(request, response);
	}

}
