package me.rizexor.statuspage.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such Incident")
public class IncidentNotFoundException extends RuntimeException {
}
