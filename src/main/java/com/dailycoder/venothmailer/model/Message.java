package com.dailycoder.venothmailer.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class Message {

    @NotBlank(message = "subject cannot be blank")
    private String subject;

    @JsonProperty("text")
    private String body;

    @JsonProperty("to")
    @Email(message = "not a valid email address")
    private String recipient;


}
