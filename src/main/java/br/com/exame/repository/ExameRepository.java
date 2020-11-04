package br.com.exame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exame.entity.Exame;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

}
