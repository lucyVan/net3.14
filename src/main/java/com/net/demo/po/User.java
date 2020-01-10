package com.net.demo.po;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@Data
public class User implements Serializable {
    @Id
    @GenericGenerator(name = "myIdGenerator", strategy = "uuid")
    @GeneratedValue(generator = "myIdGenerator")
    private String userId;
    private String userName;
    private String password;
    private Date birthday;
    private int age;
    private double salary;
    @Column(name = "regtime",columnDefinition = "timestamp")
    private Timestamp regtime;
}
