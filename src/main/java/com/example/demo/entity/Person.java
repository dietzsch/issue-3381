package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import org.hibernate.envers.Audited;

@Entity
@Audited
public class Person {

  @Id @GeneratedValue Long id;
  String name;
  @Version Long version;
}
