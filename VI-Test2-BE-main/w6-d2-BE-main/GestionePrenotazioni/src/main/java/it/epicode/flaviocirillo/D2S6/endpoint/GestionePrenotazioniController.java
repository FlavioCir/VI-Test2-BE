package it.epicode.flaviocirillo.D2S6.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import it.epicode.flaviocirillo.D2S6.dao.GestionePrenotazioniService;

@Controller
public class GestionePrenotazioniController {

	@Autowired
	GestionePrenotazioniService prenotazioniSrv;
	
	@GetMapping("/istruzioni/{lingua}")
	@ResponseBody
	public String istruzioni(@PathVariable String lingua) {
		return prenotazioniSrv.informativa(lingua) + "ciao";
	}
}
