package com.jpa.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.relation.entity.Instruktor;
import com.jpa.relation.entity.InstruktorDetail;

public interface InstruktorRepository extends JpaRepository<Instruktor, Long> {

}
