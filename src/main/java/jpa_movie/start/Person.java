package jpa_movie.start;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorColumn(name = "type")
public class Person { // 고객과 직원이 상속하기 위한 Class

    @Id @GeneratedValue
    @Column(name = "PERSON_ID")
    private Long id; // PK

    @Column(name = "PERSON_NAME")
    private String name;

    @Column(name = "PERSON_BIRTH")
    private long birth;

    @Embedded
    private Address address; // Embedded From Address Class
}
