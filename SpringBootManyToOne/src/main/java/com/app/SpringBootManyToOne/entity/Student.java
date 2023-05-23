package com.app.SpringBootManyToOne.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stdtab")
public class Student {

    @Id
    private Integer sid;

    private String sname;

    @ManyToOne
    @JoinColumn(name = "bidFk")
    private Book bob;
}
