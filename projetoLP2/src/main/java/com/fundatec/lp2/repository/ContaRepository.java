package com.fundatec.lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundatec.lp2.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
