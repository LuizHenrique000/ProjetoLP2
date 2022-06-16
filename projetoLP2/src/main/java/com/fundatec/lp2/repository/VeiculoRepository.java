package com.fundatec.lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fundatec.lp2.models.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer>{

}
