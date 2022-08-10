package jp.co.poweredge.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.poweredge.springboot.dao.factory.DAOFactory;
import jp.co.poweredge.springboot.dao.impl.ExhibitionMasterDAOImpl;
import jp.co.poweredge.springboot.model.ExhibitionMaster;

@Service
public class ExhibitionMasterService {

	DAOFactory jdbcDaoFactory = DAOFactory.getDAOJDBCFactory();
	ExhibitionMasterDAOImpl exhibitionMasterDAOImpl = (ExhibitionMasterDAOImpl) jdbcDaoFactory.getExhibitionMasterDAO();

	public List<ExhibitionMaster> getAllExhibition() {
		List<ExhibitionMaster> exhibitionMasterList =  exhibitionMasterDAOImpl.findAllExhibition();
		return exhibitionMasterList;
	}

}
