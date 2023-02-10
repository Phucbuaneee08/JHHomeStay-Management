package com.arjuncodes.JHHomeStayManagement.service;

import com.arjuncodes.JHHomeStayManagement.entities.HomeStay;
import com.arjuncodes.JHHomeStayManagement.entities.Room;

import java.util.List;

public interface RoomService {
    Room saveRoom(Room room);
    List<Room> findAllRoomByHomestay(HomeStay homeStay);

}
