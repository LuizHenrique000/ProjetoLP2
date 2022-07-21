package com.fundatec.lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {

	Tarifa findByTempoTarifaAndTipoVeiculo(TempoTarifa tempoTarifa, TipoVeiculo tipoVeiculo);

}
