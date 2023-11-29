package com.ranjs.spring.batch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjs.spring.batch.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	private JobService service;

	@PostMapping("/importCustomers") // localhost:9191/jobs/importCustomers -> post method
	public String importCsvToDBJob() {
		try {
			service.importCsvToDBJob();
			return "Batch processed successfully. ";
		} catch (Exception e) {
			e.printStackTrace();
			return "Batch processing got failed. ";
		}
	}
}
