package kr.or.ddit.admin.content.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import kr.or.ddit.admin.content.service.AdminContentServiceImpl;
import kr.or.ddit.admin.content.service.IAdminContentService;
import kr.or.ddit.admin.content.vo.AdminContentVO;


@WebServlet("/admin/content/updateContent.do")
@MultipartConfig(fileSizeThreshold = 1024*1024*3, maxFileSize = 1024*1024*40, maxRequestSize = 1024*1024*50)
public class AdminContentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IAdminContentService service;
    
    public AdminContentUpdateServlet() {
        service = AdminContentServiceImpl.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String conTitle = request.getParameter("contitle");
    	AdminContentVO vo = service.getContent(conTitle);
    	
    	request.setAttribute("updateContent", vo);
    	
    	request.getRequestDispatcher("/WEB-INF/views/admin/content/ContentUpdate.jsp").forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String conTitle = request.getParameter("contitle");
		String cast = request.getParameter("cast");
		String director = request.getParameter("director");
		String rating = request.getParameter("rating");
		String plot = request.getParameter("plot");
		String genre = request.getParameter("genre");
		String msg = "";
		String fileName ="";
		
		String uploadPath = getPosterPath(genre);
		String dbPath = insertDbPosterPath(genre);
		
		
		try {		
			for (Part part : request.getParts()) {
				fileName = getFileName(part);
						
				System.out.println("?????? : "+ fileName);
				
				// ????????? ???????????? ?????? ??????
				if(fileName != null && !fileName.equals("")) {
					part.write(uploadPath + "/" + fileName);
					dbPath += "/" + fileName;
					System.out.println("??????" + dbPath);
						
				}
					

			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		AdminContentVO vo = new AdminContentVO();
		vo.setCont_title(conTitle);
		vo.setCont_cast(cast);
		vo.setCont_director(director);
		vo.setPrice_rating_id(rating);
		vo.setEp_plot(plot);
		vo.setCont_poster(dbPath);
		
		
		int contentResult = service.updateContent(vo);
		int plotResult = service.updatePlot(vo);
		
		if(contentResult > 0 && plotResult > 0) {
			msg = "??????";
		}else {
			msg = "??????";
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/WEB-INF/views/admin/content/updateCheck.jsp").forward(request, response);
		
	}
	
	//????????? ?????? ?????? ????????????
	public String getPosterPath(String genre) {
			
		String uploadPath = "";
			
		if(genre.equals("??????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\action";
		}else if(genre.equals("???????????????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\animation";
		}else if(genre.equals("?????????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\comedy";
		}else if(genre.equals("??????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\crime";
		}else if(genre.equals("??????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\horror";
		}else if(genre.equals("?????????")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\romance";
		}else if(genre.equals("sf")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\sf";
		}
			
			return uploadPath;
		}
		
		// db insert ?????? ?????? ????????????
		public String insertDbPosterPath(String genre) {
			
			String dbPath = "";
			
			if(genre.equals("??????")) {
				dbPath = "/Dditflix/contents/poster/action";
			}else if(genre.equals("???????????????")) {
				dbPath = "/Dditflix/contents/poster/animation";
			}else if(genre.equals("?????????")) {
				dbPath = "/Dditflix/contents/poster/comedy";
			}else if(genre.equals("??????")) {
				dbPath = "/Dditflix/contents/poster/crime";
			}else if(genre.equals("??????")) {
				dbPath = "/Dditflix/contents/poster/horror";
			}else if(genre.equals("?????????")) {
				dbPath = "/Dditflix/contents/poster/romance";
			}else if(genre.equals("sf")) {
				dbPath = "/Dditflix/contents/poster/sf";
			}
			
			return dbPath;
		}
		
		private String getFileName(Part part) {
				
				for(String content : part.getHeader("Content-Disposition").split(";")) {
					
					if(content.trim().startsWith("filename")) {
						return content.substring(content.indexOf("=")+1).trim().replace("\"","");
					}
					
				}
				
				
				return null;
			}

}
