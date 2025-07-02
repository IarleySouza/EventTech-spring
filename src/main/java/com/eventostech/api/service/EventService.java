package com.eventostech.api.service;

import com.eventostech.api.domain.event.Event;
import com.eventostech.api.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    public Event createEvent(EventRequestDTO data) {
        String imgUrl = null;

        if (data.image() != null) {
           imgUrl =  this.uploadImg(data.image());
        }

        var event = new Event();
        event.setTitle(data.title());
        event.setDescription(data.description());
        event.setEventUrl(data.eventUrl());
        event.setDate(new Date(data.date()));
        event.setImgUrl(imgUrl);

        return event;
    }

    private String uploadImg(MultipartFile file) {
        return null;
    }
}
