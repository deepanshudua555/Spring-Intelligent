package com.hatsu.schoolManagement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/*
@Data annotation is provided by Lombok library which generates getter, setter,
equals(), hashCode(), toString() methods & Constructor at compile time.
This makes our code short and clean.
*/
@Data
public class Contact {
    @NotBlank(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message = "email address is required")
    @Email(message = "Invalid email address")
    private String email ;

    @NotBlank(message = "subject is required")
    @Size(min = 3, message = "subject must be at least 3 characters long")
    private String subject;

    @NotBlank(message = "message is required")
    @Size(min = 3, message = "message must be at least 3 characters long")
    private String message;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMobileNum() {
//        return mobileNum;
//    }
//
//    public void setMobileNum(String mobileNum) {
//        this.mobileNum = mobileNum;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    @Override
//    public String toString() {
//        return "Contact{" +
//                "name='" + name + '\'' +
//                ", mobileNum='" + mobileNum + '\'' +
//                ", email='" + email + '\'' +
//                ", subject='" + subject + '\'' +
//                ", message='" + message + '\'' +
//                '}';
//    }
}
