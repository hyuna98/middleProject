package kr.or.ddit.admin.sales.service;

import java.util.List;

import kr.or.ddit.admin.sales.dao.AdminSalesDaoImpl;
import kr.or.ddit.admin.sales.dao.IAdminSalesDao;
import kr.or.ddit.admin.sales.vo.AdminSalesVO;

public class AdminSalesServiceImpl implements IAdminSalesService {
	
	private IAdminSalesDao adminSalesDao;
	private static IAdminSalesService adminSalesService;
	
	private AdminSalesServiceImpl() {
		if(adminSalesDao==null) {
			adminSalesDao = AdminSalesDaoImpl.getInstance();
		}
	}
	public static IAdminSalesService getInstance() {
		if(adminSalesService==null) {
			adminSalesService = new AdminSalesServiceImpl();
		}
		return adminSalesService;
	}
	@Override
	public AdminSalesVO getMembershipSales() {
		return adminSalesDao.getMembershipSales();
	}
	@Override
	public List<AdminSalesVO> getMembershipSalesChart() {
		return adminSalesDao.getMembershipSalesChart();
	}
	@Override
	public AdminSalesVO getContentsSales() {
		return adminSalesDao.getContentsSales();
	}
	@Override
	public List<AdminSalesVO> getContentsSalesChart() {
		return adminSalesDao.getContentsSalesChart();
	}
	@Override
	public AdminSalesVO getTotalSales() {
		return adminSalesDao.getTotalSales();
	}
	@Override
	public List<AdminSalesVO> getTotalSalesChart() {
		return adminSalesDao.getTotalSalesChart();
	}
	
	
}
