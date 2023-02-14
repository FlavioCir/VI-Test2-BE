package it.epicode.flaviocirillo.D2S6.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D2S6.entity.Edificio;
import it.epicode.flaviocirillo.D2S6.entity.Postazione;
import it.epicode.flaviocirillo.D2S6.entity.Utente;

@Service
public class UtenteService {
	@Autowired
    private UtenteRepository utenteRepo;

    public void insertUtente(Utente u) {
        utenteRepo.save(u);
        System.out.println("Utente inserito correttamente!");
    }
    
    public Optional<Utente> getById(int id) {
		return utenteRepo.findById(id);
	}

}
