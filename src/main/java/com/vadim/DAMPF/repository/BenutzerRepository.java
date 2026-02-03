package com.vadim.DAMPF.repository;

import com.vadim.DAMPF.entity.benutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BenutzerRepository extends JpaRepository<benutzer, Integer> {
    Optional<benutzer> findByUserName(String benutzername);
}
