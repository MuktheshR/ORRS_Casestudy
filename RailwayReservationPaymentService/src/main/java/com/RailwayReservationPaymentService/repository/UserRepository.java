package com.RailwayReservationPaymentService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.RailwayReservationPaymentService.model.UserDetailsData;

/**
 *Repository For Connecting MongoDb With UserDetails Model
 */
@Repository
public interface UserRepository extends MongoRepository<UserDetailsData, Integer> {

}
