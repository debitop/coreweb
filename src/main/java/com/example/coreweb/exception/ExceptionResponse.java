package com.example.coreweb.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "of", buildMethodName = "create")
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = -1234572375467234345L;

    @JsonProperty(value = "httpStatus")
    private HttpStatus httpStatus;

    @JsonProperty(value = "error")
    private String error;

    @JsonProperty(value = "errorDescription")
    private String errorDescription;
}
