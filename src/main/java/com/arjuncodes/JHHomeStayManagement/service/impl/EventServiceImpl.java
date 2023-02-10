package com.arjuncodes.JHHomeStayManagement.service.impl;

import com.arjuncodes.JHHomeStayManagement.entities.Event;
import com.arjuncodes.JHHomeStayManagement.repository.EventRepository;
import com.arjuncodes.JHHomeStayManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }



    //update - delete

    public boolean updateEvent(Long id, Event newEvent) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if (eventOptional.isEmpty()) return false;
        Event event = eventOptional.get();
        event.setName(newEvent.getName());
        event.setDescription(newEvent.getDescription());
        event.setValue(newEvent.getValue());
        event.setStartDay(newEvent.getStartDay());
        event.setEndDay(newEvent.getEndDay());
        eventRepository.save(event);
        return true;
    }

    public boolean deleteEvent(Long id) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if (eventOptional.isEmpty()) return false;
        eventRepository.delete(eventOptional.get());
        return true;
    }
    //create - get
    public void createEvent(Event newEvent){
        eventRepository.save(newEvent);
    }
    public List<Event> getAllEvent(){
        return eventRepository.findAll();
    }
    public Optional<Event> getEvent(Long id){
        return eventRepository.findById(id);
    }
}
