package com.william.marvelspring.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "characters", schema = "marvel")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "character")
    private List<Comic> comics;

    @OneToMany(mappedBy = "character")
    private List<Event> events;

    @OneToMany(mappedBy = "character")
    private List<Serie> series;

    @OneToMany(mappedBy = "character")
    private List<Storie> stories;
}
