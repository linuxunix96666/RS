package jp.co.poweredge.springboot.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import jp.co.poweredge.springboot.dao.ExhibitionMasterDAO;
import jp.co.poweredge.springboot.dao.MerchandiseMasterDAO;
import jp.co.poweredge.springboot.dao.impl.ExhibitionMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.MerchandiseMasterDAOImpl;


public class JdbcDAOFactory extends DAOFactory {

	@Autowired
	private static Environment env;

	public static String MYSQL_URL = "jdbc:mysql://localhost:3306/athleta";

	public static String USER = "root";

	public static String PASSWORD = "";

	public static Connection createConnection() {
		try {
			return DriverManager.getConnection(MYSQL_URL,USER,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MerchandiseMasterDAO getMerchandiseMasterDAO() {
		return new MerchandiseMasterDAOImpl();
	}

	@Override
	public ExhibitionMasterDAO getExhibitionMasterDAO() {
		return new ExhibitionMasterDAOImpl();
	}

}
