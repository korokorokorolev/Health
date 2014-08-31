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
    @Column(name = "SEX", insertable = true, updatable = false, nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private Sex sex;
    @Column(name = "BIRTH_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(name = "ABOUTH", nullable = true, columnDefinition = "TEXT")
    private String about;

    public Trainer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
