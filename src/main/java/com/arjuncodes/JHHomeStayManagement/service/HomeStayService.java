package com.arjuncodes.JHHomeStayManagement.service;

import com.arjuncodes.JHHomeStayManagement.entities.HomeStay;

public interface HomeStayService {
    void deleteHomeStay(HomeStay homeStay);
    HomeStay save(HomeStay homeStay);
}
