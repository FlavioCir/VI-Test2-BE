package it.epicode.flaviocirillo.D2S6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.flaviocirillo.D2S6.entity.Edificio;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio, Integer>{

}
