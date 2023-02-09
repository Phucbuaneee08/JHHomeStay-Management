package com.arjuncodes.JHHomeStayManagement.controller;

import com.arjuncodes.JHHomeStayManagement.entities.Event;
import com.arjuncodes.JHHomeStayManagement.service.impl.EventServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EventController {
    private final EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }

    @PutMapping("/event/{id}")
    public ResponseEntity<?> updateEvent(@PathVariable Long id,
                                         @RequestBody Event newEvent) {
        if (eventService.updateEvent(id, newEvent))
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("update success");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found event by " + id);
    }

    @DeleteMapping("/event/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable Long id) {
        if (eventService.deleteEvent(id))
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("delete success");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found event by " + id);
    }
}
