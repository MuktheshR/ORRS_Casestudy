package com.RailwayReservationPaymentService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.RailwayReservationPaymentService.controller.PaymentController;
import com.RailwayReservationPaymentService.model.PaymentDetails;

@SpringBootTest
class RailwayReservationPaymentServiceApplicationTests {
	
	
	@MockBean
	public PaymentController controller;
	@Test
	public void getAll() {
		when(controller.getAll()).thenReturn(
				Stream.of(new PaymentDetails("radhamukthesh1@gmail.com","5213241523654215",524362545,522,"SBI","FirstclassActier"),
						new PaymentDetails("radha@gmail.com","5213241523654215",524362545,522,"SBI","FirstclassActier"))
				.collect(Collectors.toList()));
		assertEquals(2, controller.getAll().size());
	}
	

}
