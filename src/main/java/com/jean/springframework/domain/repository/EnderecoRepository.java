package com.jean.springframework.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.springframework.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
