package com.arjuncodes.JHHomeStayManagement.repository;

import com.arjuncodes.JHHomeStayManagement.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeStayRepository extends JpaRepository<Customer, Long> {
    
}
