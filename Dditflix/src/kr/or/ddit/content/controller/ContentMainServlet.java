package kr.or.ddit.content.controller;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.or.ddit.content.service.ContentServiceImpl;
import kr.or.ddit.content.service.IContentService;
import kr.or.ddit.content.vo.ContentVO;
import kr.or.ddit.user.login.service.ILoginService;
import kr.or.ddit.user.login.service.LoginServiceImpl;


@WebServlet("/user/home/main.do")
public class ContentMainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IContentService contentService = ContentServiceImpl.getInstance();
		
		List<ContentVO> popularList = contentService.movieList("금주인기영화");
		List<ContentVO> animationList = contentService.movieList("애니메이션");
		List<ContentVO> crimeList = contentService.movieList("범죄");
		List<ContentVO> actionList = contentService.movieList("액션");
		List<ContentVO> comedyList = contentService.movieList("코메디");
		List<ContentVO> horrorList = contentService.movieList("공포");
		List<ContentVO> romanceList = contentService.movieList("로맨스");
		List<ContentVO> sfList = contentService.movieList("SF");
		
		req.setAttribute("actionList", actionList);
		req.setAttribute("popularList", popularList);
		req.setAttribute("animationList", animationList);
		req.setAttribute("crimeList", crimeList);
		req.setAttribute("comedyList", comedyList);
		req.setAttribute("horrorList", horrorList);
		req.setAttribute("romanceList", romanceList);
		req.setAttribute("sfList", sfList);
		
		req.getRequestDispatcher("/WEB-INF/views/user/home/main.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
