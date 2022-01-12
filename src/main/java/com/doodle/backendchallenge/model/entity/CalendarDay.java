package com.doodle.backendchallenge.model.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class CalendarDay extends AbstractBaseEntity{
    @ManyToMany
    private List<Slot> slots;

    @ManyToMany
    private List<Meeting> meetings;
}
