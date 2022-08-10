package jp.co.poweredge.springboot.dao;

import java.util.List;

import jp.co.poweredge.springboot.model.ExhibitionMaster;

public interface ExhibitionMasterDAO {
	public int insertExhibition();
	public boolean deleteExhibition();
	public List<ExhibitionMaster> findAllExhibition();
	public boolean updateExhibition();
}
