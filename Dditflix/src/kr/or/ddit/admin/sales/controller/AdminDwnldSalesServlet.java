package kr.or.ddit.admin.sales.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.admin.sales.service.AdminSalesServiceImpl;
import kr.or.ddit.admin.sales.service.IAdminSalesService;
import kr.or.ddit.admin.sales.vo.AdminSalesVO;

@WebServlet("/admin/sales/dwnldSales.do")
public class AdminDwnldSalesServlet extends HttpServlet {
	private static IAdminSalesService adminSalesService;
	
	public AdminDwnldSalesServlet() {
		if(adminSalesService==null) {
			adminSalesService = AdminSalesServiceImpl.getInstance();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminSalesVO vo = adminSalesService.getContentsSales();
		List<AdminSalesVO> list = adminSalesService.getContentsSalesChart();
		
		req.setAttribute("contentsSales", vo);
		req.setAttribute("contentsSalesChart", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/admin/sales/dwnldSales.jsp");
		dispatcher.forward(req, resp);
		
	}
}
