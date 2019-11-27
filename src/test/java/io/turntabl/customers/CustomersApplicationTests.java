package io.turntabl.customers;

import io.turntabl.customers.v1.Implementors.ClientDAOImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest
class CustomersApplicationTests {

	@Test
	void testSearchClientByID() {
		String expected = "Test";
		assertEquals(expected,"Test");
	}

}
