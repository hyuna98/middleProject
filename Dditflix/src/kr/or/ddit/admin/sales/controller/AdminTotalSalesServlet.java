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

@WebServlet("/admin/sales/totalSales.do")
public class AdminTotalSalesServlet extends HttpServlet {
	private static IAdminSalesService adminSalesService;
	
	public AdminTotalSalesServlet() {
		if(adminSalesService==null) {
			adminSalesService = AdminSalesServiceImpl.getInstance();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		AdminSalesVO vo = adminSalesService.getTotalSales();
		List<AdminSalesVO> list = adminSalesService.getTotalSalesChart();
		
		req.setAttribute("totalSales", vo);
		req.setAttribute("totalSalesChart", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/admin/sales/totalSales.jsp");
		dispatcher.forward(req, resp);
		
	}
}
