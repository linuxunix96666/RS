package jp.co.poweredge.springboot.dao.factory;

import jp.co.poweredge.springboot.dao.ExhibitionMasterDAO;
import jp.co.poweredge.springboot.dao.MerchandiseMasterDAO;

public abstract class DAOFactory {

	public abstract MerchandiseMasterDAO getMerchandiseMasterDAO();
	public abstract ExhibitionMasterDAO getExhibitionMasterDAO();

	public static DAOFactory getDAOJDBCFactory() {
		return new JdbcDAOFactory();
	}

	public static DAOFactory getDAOXMLFactory() {
		return null;
	}
}
