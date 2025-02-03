package com.saaspera.project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Saaspera {

		@GetMapping()
		public String SaasperaHelloWorld()
		{
			return "Hello, Saaspera!";
			
		}

}
