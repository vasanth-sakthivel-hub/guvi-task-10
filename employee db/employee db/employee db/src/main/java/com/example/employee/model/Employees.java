package com.example.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employees {


    @Id
    private String id;
    private String name;
    private String email;
    private String location;


}
