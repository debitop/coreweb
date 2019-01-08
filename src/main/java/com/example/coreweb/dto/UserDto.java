package com.example.coreweb.dto;

import com.example.coreweb.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder(buildMethodName = "create", builderMethodName = "of")
public class UserDto {

    @JsonProperty(value = "id")
    private Long id;

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "userName")
    private String userName;

    public interface UserDtoManager{
        static UserDto toUserDto(User user){
            return UserDto.of()
                    .id(user.getId())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .userName(user.getUserName())
                    .create();
        }
    }

}
