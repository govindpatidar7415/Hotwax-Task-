package com.hotwax.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotwax.Entities.ContactMech;

@Repository
public interface ContactMechRepository extends JpaRepository<ContactMech, Long> {
}
