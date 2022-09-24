package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotBlank(message = "이메일은 필수입니다.")
    @Size(min = 2, message = "이메일은 최소 2글자 이상입니다.")
    @Email
    private String email;

    @NotBlank(message = "이름은 필수입니다.")
    @Size(min = 2, message = "이름은 최소 2글자 이상입니다.")
    private String name;

    @NotBlank(message = "비밀번호는 필수입니다.")
    @Size(min = 8, message = "비밀번호는 최소 2글자 이상입니다.")
    private String pwd;

}
