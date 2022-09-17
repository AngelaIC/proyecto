package edu.udea.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;
import java.sql.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Unique
    private String name;

    @Unique
    private String document;

    private String phone;
    private String address;
    private User[] users;
    private Transaction[] transactions;
    private Date createdAt;
    private Date updatedAt;
}
