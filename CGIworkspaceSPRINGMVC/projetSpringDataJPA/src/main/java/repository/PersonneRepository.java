package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	List<Personne> findByNom(String nom);

	List<Personne> findAllByOrderByNomDesc(); // décroissant

	List<Personne> findAllByOrderByNom(); // croissant
	// List<Personne> findAllByOrderByNomAsc();
	// @Query("select u from Personne u where u.nom like %?l")
	// List<Personne> findByToto(String nom);

	@Query("select u from Personne u where u.nom=:leNom")
	List<Personne> findMyQueryNom(@Param("leNom") String nom);

}
