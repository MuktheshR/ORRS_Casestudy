package com.RailwayReservationBookingService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.RailwayReservationBookingService.controller.BookingServiceController;
import com.RailwayReservationBookingService.model.UserDetails;
import com.RailwayReservationBookingService.repository.BookingRepository;
import com.RailwayReservationBookingService.service.BookingServiceImpl;
import com.netflix.discovery.converters.Auto;

@RunWith(SpringRunner.class)
@SpringBootTest
/* class RailwayReservationUsermanagementApplicationTests { */
class RailwayReservationBookingServiceApplicationTests {

	@MockBean
	private BookingRepository bookingRepository;

	@Autowired
	public UserDetails details;
	
	@Autowired
	public BookingServiceImpl bookingServiceImpl;

	@Autowired
	BookingServiceController bookingServiceController;
	
	 

	
//	@Test
//	public void deleteUserDetailsById() {
//		long pnrNo = 102000001;
//		bookingServiceController.deleteUserDetailsById((long) pnrNo);
//		((BookingService) verify(bookingRepository, times(1)))
//		.deleteUserBookingDetails((long) pnrNo);
//	}


	@Test
	public void getAll() {
		when(bookingServiceController.getAll()).thenReturn(Stream
				.of(new UserDetails(12, 25125212, "vicky", 21, "Male", "radhamukthesh@gmail.com", "kmp", 12640,
						"BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "FirstClassAcTier", 2, 1, "556"),
						new UserDetails(12, 25125212, "vicky", 21, "Male", "radhamukthesh@gmail.com", "kmp", 12640,
								"BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "FirstClassAcTier", 2, 1, "556"))
				.collect(Collectors.toList()));
		assertEquals(2, bookingServiceController.getAll().size());
	}

}
