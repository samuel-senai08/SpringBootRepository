package com.petshop.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.demo.Entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

}
