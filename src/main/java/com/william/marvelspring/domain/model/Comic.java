package com.william.marvelspring.domain.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comics", schema = "marvel")
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "issue_number", nullable = false)
    private Long issueNumber;

    @Column(name = "modified", nullable = false)
    private LocalDateTime modified;

    @ManyToOne()
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

}
