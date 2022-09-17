package edu.udea.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String image;
    private String phone;
    private User user;
    private Date createdAt;
    private Date updatedAt;
}
