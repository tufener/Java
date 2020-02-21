package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	List<Personne> findByNom(String nom);
	List<Personne> findAllByOrderByNomDesc (); //décroissant
	List<Personne> findAllByOrderByNom (); // croissant
	@Query("select u from Personne u where u.nom like %")
	List<Personne> findBytest(String nom);

}
