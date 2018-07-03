package com.statestr.dao;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.statestr.repository.Customer;

public interface CustomerRepository extends Repository<Customer, Long> {

    List<Customer> findByEmail(String email);

    @Query("select c from Customer c where c.email = :email")
    Stream<Customer> findByEmailReturnStream(@Param("email") String email);

    List<Customer> findByDate(Date date);

    //@Query("select c from Customer c")
    //Stream<Customer> findAllAndStream();

    //List<Customer> findByDateBetween(Date from, Date to);

}
