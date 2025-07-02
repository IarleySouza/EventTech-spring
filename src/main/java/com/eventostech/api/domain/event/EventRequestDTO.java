package com.eventostech.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, String city, Long date, String state, Boolean remote, String eventUrl, MultipartFile image) {
}
