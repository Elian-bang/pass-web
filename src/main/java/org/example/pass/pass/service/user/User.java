package org.example.pass.pass.service.user;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.pass.pass.repository.user.UserStatus;

@Getter
@Setter
@ToString
public class User {
    private String userId;
    private String userName;
    private UserStatus status;

}
