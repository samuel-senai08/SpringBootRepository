package com.petshop.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.demo.Entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}

