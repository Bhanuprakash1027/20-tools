package bhanu.prakash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bhanu.prakash.service.ReportIservice;

@Controller
public class ReportController {

	@Autowired
	private ReportIservice service;
	
	@GetMapping("/one")
	public String GetReport(Model model)
	{
		model.addAttribute("ReportSearch", model);
		return "index";
	}
}
