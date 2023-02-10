package com.arjuncodes.JHHomeStayManagement.repository;

import com.arjuncodes.JHHomeStayManagement.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
