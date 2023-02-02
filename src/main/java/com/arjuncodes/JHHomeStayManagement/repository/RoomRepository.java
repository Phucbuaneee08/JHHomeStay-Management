package com.arjuncodes.JHHomeStayManagement.repository;

import com.arjuncodes.JHHomeStayManagement.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Customer, Long> {
    
}
