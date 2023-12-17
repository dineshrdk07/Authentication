package com.cts.entities;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@Data
public class User {


    private String name;
    @Id
    private String email;

    private String password;

}
