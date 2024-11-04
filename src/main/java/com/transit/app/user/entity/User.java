package com.transit.app.user.entity;

import com.transit.app.user.constants.AccountStatus;
import com.transit.app.user.constants.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private ObjectId id;

    @NonNull
    private String name;

    @NonNull
    @Indexed(unique = true)
    private String email;

    @NonNull
    @Indexed(unique = true)
    private String phone;

    @NonNull
    private String password;

    @NonNull
    private Role role;

    private boolean isVerified;
    private AccountStatus accountStatus;

    @DBRef
    private List<Address> address = new ArrayList<>();
    private String emergencyPhone;
    private String gender;
    private String bloodGroup;
    private String aadharNo;
    private String panNo;
    private String aadharFile;
    private String panFile;

    @Indexed(unique = true)
    private String badgeNo;

    private LocalDateTime dateOfBirth;

    private String liscenceType;

    @Indexed(unique = true)
    private String liscenceNumber;

    private LocalDateTime liscenceExpiry;
    private String liscenceFile;

    private String otp;
    private LocalDateTime otpExpiry;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
