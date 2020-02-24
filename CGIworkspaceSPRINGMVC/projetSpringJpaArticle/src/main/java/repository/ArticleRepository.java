package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
//	List<Article> findByNom(String nom);
	List<Article> findByMarque(String marque);

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

}
