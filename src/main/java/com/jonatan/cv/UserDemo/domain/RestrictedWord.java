package com.jonatan.cv.UserDemo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

/**
 * @author msjonatan on 30/06/18
 * @project UserDemo
 */
@Entity
@Getter
@Setter
public class RestrictedWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String word;
}
