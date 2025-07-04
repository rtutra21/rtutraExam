package edu.javaDigitalCaf.rtutra.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "age", nullable = false)
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Country country;

}
