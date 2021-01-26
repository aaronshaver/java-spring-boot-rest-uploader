package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Javaspringbootrestuploader2Application {

	// Note: I was having trouble with the app because my package structure and component scanning wasn't
	// correct. Spring will by default only scan in the package associated with this application class and any
	// sub-packages. You can either keep things packaged together or if you want separate packages, you can
	// force it to scan like so:
	//
	//    @SpringBootApplication
	//    @ComponentScan({"com.our.main.package", "com.some.outside.package"})

	public static void main(String[] args) {
		SpringApplication.run(Javaspringbootrestuploader2Application.class, args);
		System.out.println("our app is running...");


	}
}
