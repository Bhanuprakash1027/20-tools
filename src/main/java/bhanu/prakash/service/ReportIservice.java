package bhanu.prakash.service;

import java.util.List;

import bhanu.prakash.Entity.ReportEntity;
import bhanu.prakash.Search.ReportSearch;

public interface ReportIservice {
	
	public List<String> getplanname();
	public List<String> getplanstatus();
	public List<ReportEntity> search(ReportSearch searcha);
	public Boolean exportExcel();
	public boolean exportpdf();

}
