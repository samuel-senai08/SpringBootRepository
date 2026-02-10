package com.petshop.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.demo.Entity.Chip;

public interface ChipRepository extends JpaRepository<Chip, Long> {

}

