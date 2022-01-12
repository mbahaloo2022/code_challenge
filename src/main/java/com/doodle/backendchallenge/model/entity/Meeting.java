package com.doodle.backendchallenge.model.entity;

import com.doodle.backendchallenge.model.dto.UserDto;
import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID slotId;
    private String title;
    private OffsetDateTime startAt;
    private OffsetDateTime endAt;

    //Default load strategy is lazy
    @ManyToMany
    private List<User> participants;

}
