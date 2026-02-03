package com.vadim.DAMPF.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "benutzer")

public class benutzer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "benutzer_ID")
    private int benutzerID;

    @Column(name = "username")
    private String UserName;

    @Column(name = "balance")
    private float balance;

    @Column(name = "bibliothek_ID")
    private int bibliothekID;

}
