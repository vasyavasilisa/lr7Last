package by.bsuir.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "surname", nullable = false, length = 45)
    private String surname;

    @Column(name = "discount", nullable = false, length = 1)
    private String discount;

    @Column(name = "zip", nullable = false)
    private int zip;

    @Column(name = "phone_number", nullable = false, length = 13)
    private String phone;

    @Column(name = "email", nullable = false, length = 75)
    private String email;

    @Column(name = "city", nullable = false, length = 45)
    private String city;
}
