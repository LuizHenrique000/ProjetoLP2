package com.fundatec.lp2.service;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fundatec.lp2.converter.AssinanteConverter;
import com.fundatec.lp2.models.Assinante;
import com.fundatec.lp2.repository.AssinanteRepository;
import com.fundatec.lp2.requestdto.AssinanteRequestDTO;
import com.fundatec.lp2.responsedto.AssinanteResponseDTO;
import com.fundatec.lp2.service.exceptions.EntityNotFoundException;

@Service
public class AssinanteService {

	@Autowired
	private AssinanteRepository repository;

	public List<Assinante> findAll() {
		return repository.findAll();
	}

	public AssinanteResponseDTO salvarAssinante(AssinanteRequestDTO dto) {
		Assinante entidade = AssinanteConverter.converterParaEntity(dto);
		Assinante entidadePersistida = repository.save(entidade);
		return AssinanteConverter.converterParaResponse(entidadePersistida);
	}

	public void deleteById(Integer id) {
		repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		repository.deleteById(id);

	}

	public AssinanteResponseDTO recarregarCredito(Integer id, BigDecimal credito) {
		Assinante entidade = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Id " + id + " inexistente"));
		BigDecimal creditoAtual = entidade.getCredito();
		BigDecimal creditoAtualizado = creditoAtual.add(credito);
		entidade.setCredito(creditoAtualizado);
		Assinante entidadePersistida = repository.save(entidade);
		return AssinanteConverter.converterParaResponse(entidadePersistida);

	}

}
