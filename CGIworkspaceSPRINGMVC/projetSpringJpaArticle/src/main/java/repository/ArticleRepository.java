package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
//	List<Article> findByNom(String nom);
	List<Article> findByMarque(String marque);
//	List<Article> update(int id);

//	List<Article> findAllByOrderByNomDesc(); // décroissant
	List<Article> findAllByOrderByMarqueDesc();

//	List<Article> findAllByOrderByNom(); // croissant
	List<Article> findAllByOrderByMarque(); // croissant

//	List<Article> findAllByOrderByNomAsc();
	List<Article> findAllByOrderByMarqueAsc();
//	@Query("select u from Article u where u.marque like %?l")
//	List<Article> findByToto(String marque);
//
//	@Query("select u from Article u where u.marque=:laMarque")
//	List<Article> findMyQueryNom(@Param("laMarque") String marque);
	
	@Modifying
	@Query("update Article u set u.marque = ?1, u.description = ?2, u.prix = ?3 where u.id = ?4")
	List<Article> updateById(String marque, String description, Integer prix,  Integer id);
	
	@Modifying
	@Query(value ="insert into Article (id, marque, description, prix) values (:id, :marque, :description, :prix)", nativeQuery = true)
	void create(@Param("id") Integer id, @Param("marque") String marque, @Param("description") String description, @Param("prix") Integer prix);
	
	

}
