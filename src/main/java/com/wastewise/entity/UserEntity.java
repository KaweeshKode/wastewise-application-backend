package com.wastewise.entity;

import com.wastewise.util.CustomIdGenerator;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GenericGenerator(name = "user_id_seq", type = CustomIdGenerator.class, parameters = {
            @org.hibernate.annotations.Parameter( name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "U" ),
            @org.hibernate.annotations.Parameter( name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d" ) })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private String id;
    private String name;
    private String email;
    private String password;
    private String role;
}
