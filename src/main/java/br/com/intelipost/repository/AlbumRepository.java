package br.com.intelipost.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.intelipost.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
