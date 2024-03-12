package com.KA.algorithm;

import com.KA.algorithm.service.SortService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmApplication.class, args);

		SortService service = new SortService();
		service.bubbleSort();
		service.chosenSort();
		service.quickSort();
	}


}
