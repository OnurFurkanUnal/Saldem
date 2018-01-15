package com.saldemsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saldemsoft.entity.Afet;

@Repository
public interface AfetRepository extends JpaRepository<Afet, Long>{

}
