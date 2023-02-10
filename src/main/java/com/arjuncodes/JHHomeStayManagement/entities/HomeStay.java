package com.arjuncodes.JHHomeStayManagement.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "homestay")
@Entity
@NoArgsConstructor
public class HomeStay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String homestayLocation;

}
