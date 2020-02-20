package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	

}
