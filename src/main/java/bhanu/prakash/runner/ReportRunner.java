package bhanu.prakash.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bhanu.prakash.Entity.ReportEntity;
import bhanu.prakash.repo.ReportRepositoty;

@Component // Been creation
public class ReportRunner implements CommandLineRunner {

	@Autowired
	private ReportRepositoty repo; // Dependency injuction to entity and repository 
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.deleteAll();
		
		ReportEntity RE1= new ReportEntity();
		RE1.setPlanename("INPATIANT");
		RE1.setPlanstatus("ICU");
		RE1.setGender("MALE");
		RE1.setStartdate(LocalDate.now());
		RE1.setEnddate(LocalDate.now().plusDays(7));
		
		ReportEntity RE2= new ReportEntity();
		RE2.setPlanename("INPATIANT");
		RE2.setPlanstatus("EMERGENCY");
		RE2.setGender("MALE");
		RE2.setStartdate(LocalDate.now());
		RE2.setEnddate(LocalDate.now().plusDays(10));
		
		
		ReportEntity RE3= new ReportEntity();
		RE3.setPlanename("OUTPATIENT");
		RE3.setPlanstatus("DISCHARGE");
		RE3.setGender("FE-MALE");
		RE3.setStartdate(LocalDate.now());
		RE3.setEnddate(LocalDate.now().plusDays(1));
		
		List<ReportEntity> l1=Arrays.asList(RE1,RE2,RE3);
		repo.saveAll(l1);
		
		
	}

}
