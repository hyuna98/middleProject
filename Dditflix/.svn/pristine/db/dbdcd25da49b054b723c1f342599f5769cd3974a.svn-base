package kr.or.ddit.admin.content.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;

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


@WebServlet("/admin/content/insertContent.do")
@MultipartConfig(fileSizeThreshold = 1024*1024*3, maxFileSize = 1024*1024*40, maxRequestSize = 1024*1024*50)
public class AdminContentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminContentInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/admin/content/ContentInsert.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("conTitle"); //컨텐츠 제목
		String cast = request.getParameter("cast"); //주연
		String genre = request.getParameter("genre"); //장르
		String director = request.getParameter("director"); // 감독
		String nation = request.getParameter("nation"); //국가
		String time = request.getParameter("time"); //러닝타임
		String plot = request.getParameter("plot"); //줄거리
		
		String uploadPath = getPosterPath(genre);
		//db 포스터 자장경로
		String dbPath = insertDbPosterPath(genre);
		//영상 db 저장경로
		String moviePath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\video";
		String playPath = "/video";
		//파일명 
		String fileName = "";
		//비교용 문자열
		String cmp = "";
		String msg = "";
		
		
		
		try {		
			for (Part part : request.getParts()) {
				fileName = getFileName(part);
						
				System.out.println("이름 : "+ fileName + " cmp : " + cmp);
				
				// 파일이 비어있지 않은 경우
				if(cmp.equals("") && fileName != null && !fileName.equals("")) {
					part.write(uploadPath + "/" + fileName);
					dbPath += "/" + fileName;
					System.out.println("경로" + dbPath);
					cmp = fileName;			
				}
				
				if(!cmp.equals(fileName) && fileName != null && !fileName.equals("")) {
					part.write(moviePath + File.separator + fileName);
					playPath += "/" + fileName;
					System.out.println("경로" + moviePath);
				}			

			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		AdminContentVO vo = new AdminContentVO();
		vo.setCont_title(title);
		vo.setCont_cast(cast);
		vo.setCont_genre(genre);
		vo.setCont_director(director);
		vo.setCont_nation(nation);
		vo.setCont_running_time(time);
		vo.setEp_plot(plot);
		vo.setCont_poster(dbPath);
		vo.setVideo_file_save_path(playPath);
		IAdminContentService service = AdminContentServiceImpl.getInstance();
		
		int result = service.insertContent(vo);
		
		if(result > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		request.setAttribute("msg", msg);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/content/insertCheck.jsp").forward(request, response);
		
		
	}
	
	//포스터 저장 경로 받아오기
	public String getPosterPath(String genre) {
		
		String uploadPath = "";
		
		if(genre.equals("액션")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\action";
		}else if(genre.equals("애니메이션")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\animation";
		}else if(genre.equals("코메디")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\comedy";
		}else if(genre.equals("범죄")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\crime";
		}else if(genre.equals("공포")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\horror";
		}else if(genre.equals("로맨스")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\romance";
		}else if(genre.equals("sf")) {
			uploadPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\Dditflix\\WebContent\\contents\\poster\\sf";
		}
		
		return uploadPath;
	}
	
	// db insert 저장 경로 받아오기
	public String insertDbPosterPath(String genre) {
		
		String dbPath = "";
		
		if(genre.equals("액션")) {
			dbPath = "/Dditflix/contents/poster/action";
		}else if(genre.equals("애니메이션")) {
			dbPath = "/Dditflix/contents/poster/animation";
		}else if(genre.equals("코메디")) {
			dbPath = "/Dditflix/contents/poster/comedy";
		}else if(genre.equals("범죄")) {
			dbPath = "/Dditflix/contents/poster/crime";
		}else if(genre.equals("공포")) {
			dbPath = "/Dditflix/contents/poster/horror";
		}else if(genre.equals("로맨스")) {
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
