package org.example.taskcrudmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Students {
    @Id
    Long id;
    String name;
    String email;
    String surname;
}
