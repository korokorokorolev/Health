package ru.akorolev.healthwsmodel;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by akorolev on 8/31/14.
 */
@Entity
@Table(name = "TRAINER")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "LAST_NAME", nullable = false, length = 255)
    private String lastName;
    @Column(name = "FIRST_NAME", nullable = false, length = 255)
    private String firstName;
    @Column(name = "MIDDLE_NAME", nullable = true, length = 255)
    private String middleName;
    @Column(name = "SEX", nullable = false, length = 2)
    private String sex;
    @Column(name = "BIRTH_DATE", nullable = true)
    private Date birthDate;
    @Column(name = "ABOUTH", nullable = true, columnDefinition = "TEXT")
    private String about;

}
