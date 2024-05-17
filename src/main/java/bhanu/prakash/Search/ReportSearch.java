package bhanu.prakash.Search;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ReportSearch {
	
	private LocalDate startdate;
	private LocalDate enddate;
	private String PlaStrings;
	private String planstatus;
	//
	public LocalDate getStartdate() {
		return startdate;
	}
	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}
	public LocalDate getEnddate() {
		return enddate;
	}
	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
	}
	public String getPlaStrings() {
		return PlaStrings;
	}
	public void setPlaStrings(String plaStrings) {
		PlaStrings = plaStrings;
	}
	public String getPlanstatus() {
		return planstatus;
	}
	public void setPlanstatus(String planstatus) {
		this.planstatus = planstatus;
	}
	//
	public ReportSearch(LocalDate startdate, LocalDate enddate, String plaStrings, String planstatus) {
		super();
		this.startdate = startdate;
		this.enddate = enddate;
		PlaStrings = plaStrings;
		this.planstatus = planstatus;
	}
	//
	public ReportSearch() {
		super();
	}
	//
	@Override
	public String toString() {
		return "ReportSearch [startdate=" + startdate + ", enddate=" + enddate + ", PlaStrings=" + PlaStrings
				+ ", planstatus=" + planstatus + "]";
	}
	

}
