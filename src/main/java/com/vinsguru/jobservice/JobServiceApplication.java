package com.vinsguru.jobservice;

import com.vinsguru.jobservice.entity.Job;
import com.vinsguru.jobservice.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
public class JobServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(JobServiceApplication.class, args);
	}

	@Autowired
	private JobRepository repository;
}
