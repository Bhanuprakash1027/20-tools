package bhanu.prakash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bhanu.prakash.Entity.ReportEntity;
import bhanu.prakash.Search.ReportSearch;
import bhanu.prakash.repo.ReportRepositoty;

@Service
public class RepositoryIMPL implements ReportIservice {

	@Autowired
	private ReportRepositoty repo;
	
	@Override
	public List<String> getplanname() {
		return null;
	}

	@Override
	public List<String> getplanstatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReportEntity> search(ReportSearch searcha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportExcel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportpdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
