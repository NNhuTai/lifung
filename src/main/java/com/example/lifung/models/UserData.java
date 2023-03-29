package com.example.lifung.models;

import lombok.Data;

/**
 * @author Tai Nguyen
 */
@Data
public class UserData {
    private Long id;
    private String name;
    public static UserData from(User user){
        if(user == null)
            return null;
        UserData response = new UserData();
        response.setId(user.getId());
        response.setName(user.getName());
        return response;
    }
}
