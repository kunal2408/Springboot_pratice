package net.engineeringdigest.journalApp.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Data
public class Student {

    @Id
    private String id;  // MongoDB uses String/ObjectId
    private String name;
    private int rollNo;

}