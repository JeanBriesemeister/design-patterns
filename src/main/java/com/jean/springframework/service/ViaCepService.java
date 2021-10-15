package com.jean.springframework.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jean.springframework.domain.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping(value = "/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
