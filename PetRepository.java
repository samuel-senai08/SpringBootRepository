package com.petshop.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.demo.Entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}

