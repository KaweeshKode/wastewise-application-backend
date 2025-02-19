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
@Table(name = "municipal_team")
public class MunicipalTeamEntity {
    @Id
    @GenericGenerator(name = "mt_id_seq", type = CustomIdGenerator.class, parameters = {
            @org.hibernate.annotations.Parameter( name = CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "MCT" ),
            @org.hibernate.annotations.Parameter( name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d" ) })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mt_id_seq")
    private String teamId;
    private String teamName;
}
