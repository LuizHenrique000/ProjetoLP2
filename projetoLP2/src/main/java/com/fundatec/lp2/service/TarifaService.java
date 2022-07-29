package com.fundatec.lp2.service;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.TarifaConverter;
import com.fundatec.lp2.enums.TempoTarifa;
import com.fundatec.lp2.enums.TipoVeiculo;
import com.fundatec.lp2.models.Tarifa;
import com.fundatec.lp2.repository.TarifaRepository;
import com.fundatec.lp2.requestdto.TarifaRequestDTO;
import com.fundatec.lp2.responsedto.TarifaResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;
import com.fundatec.lp2.service.exceptions.TarifaInexistenteException;

@Service
public class TarifaService {

	@Autowired
	private TarifaRepository repository;

	public TarifaResponseDTO salvarTarifa(TarifaRequestDTO dto) {
		Tarifa entidade = TarifaConverter.converterParaEntity(dto);
		Tarifa entidadePersistida = repository.save(entidade);
		return TarifaConverter.converterParaResponse(entidadePersistida);
	}

	public List<Tarifa> findAll() {
		return repository.findAll();
	}

	public Tarifa findByTempoTarifaAndTipoVeiculo(TempoTarifa tempoTarifa, TipoVeiculo tipoVeiculo) {
		Tarifa tarifa = repository.findByTempoTarifaAndTipoVeiculo(tempoTarifa, tipoVeiculo);
		if (tarifa == null) {
			throw new TarifaInexistenteException("Tarifa inexistente");
		}
		return tarifa;
	}

	public TarifaResponseDTO atualizarValor(Integer id, BigDecimal valor) {
		Tarifa entidade = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		entidade.setValor(valor);
		Tarifa entidadePersistida = repository.save(entidade);
		return TarifaConverter.converterParaResponse(entidadePersistida);
	}

}
