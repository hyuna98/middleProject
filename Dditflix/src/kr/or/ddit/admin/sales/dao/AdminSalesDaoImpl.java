package kr.or.ddit.admin.sales.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.admin.sales.vo.AdminSalesVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class AdminSalesDaoImpl implements IAdminSalesDao {
	
	private static IAdminSalesDao adminSalesDao;
	private SqlMapClient smc;

	private AdminSalesDaoImpl() {
		if(smc==null) {
			smc = SqlMapClientFactory.getInstance();
		}
	}

	public static IAdminSalesDao getInstance() {
		if(adminSalesDao==null) {
			adminSalesDao = new AdminSalesDaoImpl();
		}
		return adminSalesDao;
	}

	@Override
	public AdminSalesVO getMembershipSales() {
		AdminSalesVO vo = new AdminSalesVO();
		try {
			vo = (AdminSalesVO) smc.queryForObject("adminSales.getMembershipSales");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public List<AdminSalesVO> getMembershipSalesChart() {
		List<AdminSalesVO> list = new ArrayList<AdminSalesVO>();
		try {
			list = (List<AdminSalesVO>) smc.queryForList("adminSales.getMembershipSalesChart");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AdminSalesVO getContentsSales() {
		AdminSalesVO vo = new AdminSalesVO();
		try {
			vo = (AdminSalesVO) smc.queryForObject("adminSales.getContentsSales");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public List<AdminSalesVO> getContentsSalesChart() {
		List<AdminSalesVO> list = new ArrayList<AdminSalesVO>();
		try {
			list = (List<AdminSalesVO>) smc.queryForList("adminSales.getContentsSalesChart");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public AdminSalesVO getTotalSales() {
		AdminSalesVO vo = new AdminSalesVO();
		try {
			vo = (AdminSalesVO) smc.queryForObject("adminSales.getTotalSales");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public List<AdminSalesVO> getTotalSalesChart() {
		List<AdminSalesVO> list = new ArrayList<AdminSalesVO>();
		try {
			list = (List<AdminSalesVO>) smc.queryForList("adminSales.getTotalSalesChart");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
}
