package br.com.intelipost.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.intelipost.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

	@Query("from Artista a where upper(a.nome) like upper(:nome) order by nome asc")
	List<Artista> buscaAsc(@Param("nome") String string);
	
	@Query("from Artista a where upper(a.nome) like upper(:nome) order by LENGTH(a.nome), nome asc")
	List<Artista> buscaAscWithSize(@Param("nome") String string);
	
	@Query("from Artista a where upper(a.nome) like upper(:nome) order by nome desc")
	List<Artista> buscaDesc(@Param("nome") String string);
	
	@Query("from Artista a where upper(a.nome) like upper(:nome) order by LENGTH(a.nome), nome desc")
	List<Artista> buscaDescWithSize(@Param("nome") String string);

}
