package com.nikhilkarve;

import com.nikhilkarve.dao.CustomerDAO;
import com.nikhilkarve.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class KalamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalamsApplication.class, args);
	}
	private void createMultipleCustomers(CustomerDAO customerDAO){
		System.out.println("Creating multiple customers ....");
		Customer tempCustomer1 = new Customer(
				"Mary", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);
		Customer tempCustomer2 = new Customer(
				"Derek", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);
		Customer tempCustomer3 = new Customer(
				"Riya", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);
		Customer tempCustomer4 = new Customer(
				"Billy", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);
		Customer tempCustomer5 = new Customer(
				"Jason", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);

		System.out.println("Saving the student ....");

		customerDAO.save(tempCustomer1);
		customerDAO.save(tempCustomer2);
		customerDAO.save(tempCustomer3);
		customerDAO.save(tempCustomer4);
		customerDAO.save(tempCustomer5);

		System.out.println("Saved customers." );
	}

	private void createCustomer(CustomerDAO customerDAO) {
		System.out.println("Creating a new customer object ....");
		Customer tempCustomer = new Customer(
				"John", "Doe", "22 East Ave", "Earrings",
				2000, new Date(2004, 01, 01),
				2, 2
		);

		System.out.println("Saving the student ....");
		customerDAO.save(tempCustomer);

		System.out.println("Saved customer. Generated ID: " + tempCustomer.getId());
	}
}
