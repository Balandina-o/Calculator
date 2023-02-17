package ru.usatu.project.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "fighterAircrafts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FighterAircraft {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "p2", columnDefinition = "text")
    private String p2;
    @Column(name = "p3")
    private String p3;
    @Column(name = "p4")
    private String p4;
    @Column(name = "p5")
    private String p5;
}
