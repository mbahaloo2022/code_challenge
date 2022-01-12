package com.doodle.backendchallenge.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.UUID;

@Data
@Entity
public class CalendarMonth {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Min(1)
    @Max(12)
    private int month;

    @ManyToOne
    private CalendarDay calendarDay;
}
