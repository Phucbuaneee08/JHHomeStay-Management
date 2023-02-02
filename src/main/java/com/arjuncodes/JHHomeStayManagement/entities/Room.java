package com.arjuncodes.JHHomeStayManagement.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "room")
@Entity
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date roomCheckinDate;
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date roomCheckoutDate;
    private String roomDescription;
    private String roomImage;
    private int isRented;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "homestay_id",nullable = false )
    private HomeStay homeStay;
}
