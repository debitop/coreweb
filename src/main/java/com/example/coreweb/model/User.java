package com.example.coreweb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import static com.example.coreweb.config.Constans.USERNAME_OR_PASSWORD_REGEXP;

@Data
@Builder(builderMethodName = "of", buildMethodName = "create")
@EqualsAndHashCode(exclude = {"id", "plainTextPassword", "hashedPassword"})
@ToString(exclude = {"id", "plainTextPassword", "hashedPassword"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty(value = "id")
    private Long id;

    @NotNull
    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @NotNull
    @JsonProperty(value = "userName")
    @Size(min = 3, max = 10, message = "Username length must be between 3 and 10 characters!")
    @Pattern(regexp = USERNAME_OR_PASSWORD_REGEXP, message = "Username can't contain any special characters or spaces!")
    private String userName;

    @NotNull
    @JsonProperty(value = "plainTextPassword")
    @Size(min = 6, message = "Username length must be bigger than 6 characters!")
    @Pattern(regexp = USERNAME_OR_PASSWORD_REGEXP, message = "Username can't contain any special characters or spaces!")
    private String plainTextPassword;

    private String hashedPassword;

}
