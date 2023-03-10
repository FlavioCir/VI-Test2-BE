package it.epicode.flaviocirillo.D2S6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.flaviocirillo.D2S6.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

}
