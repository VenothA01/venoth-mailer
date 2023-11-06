package com.dailycoder.venothmailer.controller;


import com.dailycoder.venothmailer.model.Message;
import com.dailycoder.venothmailer.model.Status;
import com.dailycoder.venothmailer.service.MailerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailerService service;

    @Autowired
    private ObjectMapper mapper;

    @PostMapping(value = "/email",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Status> sendEmail(@RequestBody String message) throws JsonProcessingException {
        Message message1 = mapper.readValue(message, Message.class);
        Status status = service.email(message1);
        return ResponseEntity.accepted().body(status);
    }
}
