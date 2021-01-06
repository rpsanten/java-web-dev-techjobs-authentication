package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    //@NotBlank
    @Size(min = 3, max = 30, message = "Username not acceptable. Please enter a username between" +
            " 3 and 30 characters.")
    private String username;

    @NotNull
    //@NotBlank
    @Size(min = 4, max = 27, message="Invalid passowrd. Please enter a new password that is between" +
            " 4 and 27 characters")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
