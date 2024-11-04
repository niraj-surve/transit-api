package com.transit.app.user.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "addresses")
public class Address {

    @Id
    private ObjectId id;

    private String houseNo;

    private String street;

    private String landmark;

    private String city;

    private String state;

    private String zipcode;
}
