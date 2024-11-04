package com.example.jpa.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddressDto {

    private String city;
    private String street;
    private String country;
    private Integer numberOfStreet;
}
