package com.arjuncodes.JHHomeStayManagement.dtos;

import com.arjuncodes.JHHomeStayManagement.entities.HomeStay;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
@Data
public class RoomDTO {
    private long id;
    private Date roomCheckinDate;
    private Date roomCheckoutDate;
    private String roomDescription;
    private String roomImage;
    private int isRented;

}
