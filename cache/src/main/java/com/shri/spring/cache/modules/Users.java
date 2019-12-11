package com.shri.spring.cache.modules;

import com.shri.spring.cache.modules.enums.Gender;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Slf4j
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Users implements Serializable {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @Transient
    private final Long UUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String address;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    public Users(String firstName, String lastName, String address, Gender gender) {
        log.info(">>>>>>>>>>>>>>>> user entity called");
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }
}
