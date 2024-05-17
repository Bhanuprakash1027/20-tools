package bhanu.prakash.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ReportEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ReportId;
	private String Planename;
	private String planstatus;
	private String gender;
	private LocalDate startdate;
	private LocalDate enddate;
	private String Termination_resion;
	/// this is  
	public Integer getReportId() {
		return ReportId;
	}
	public void setReportId(Integer reportId) {
		ReportId = reportId;
	}
	public String getPlanename() {
		return Planename;
	}
	public void setPlanename(String planename) {
		Planename = planename;
	}
	public String getPlanstatus() {
		return planstatus;
	}
	public void setPlanstatus(String planstatus) {
		this.planstatus = planstatus;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
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
	public String getTermination_resion() {
		return Termination_resion;
	}
	public void setTermination_resion(String termination_resion) {
		Termination_resion = termination_resion;
	}
	// Constructor with parameters
	public ReportEntity(Integer reportId, String planename, String planstatus, String gender, LocalDate startdate,
			LocalDate enddate, String termination_resion) {
		super();
		ReportId = reportId;
		Planename = planename;
		this.planstatus = planstatus;
		this.gender = gender;
		this.startdate = startdate;
		this.enddate = enddate;
		Termination_resion = termination_resion;
	}
	// constructor without parameters
	public ReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	// ToString methos
	@Override
	public String toString() {
		return "ReportEntity [ReportId=" + ReportId + ", Planename=" + Planename + ", planstatus=" + planstatus
				+ ", gender=" + gender + ", startdate=" + startdate + ", enddate=" + enddate + ", Termination_resion="
				+ Termination_resion + "]";
	}
	
}
