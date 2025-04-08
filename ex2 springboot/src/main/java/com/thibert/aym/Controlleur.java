package com.thibert.aym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Sera automatiquement détecté au démarrage du serveur
@Controller
public class Controlleur {

	@Autowired
	public TrucService trucService;




	@PostMapping("/prout/envoyer")
	public @ResponseBody String ajouterEnPost(
			@RequestBody String chose, @RequestParam(required = false, name = "taille") Integer taille) throws com.thibert.aym.PasBonneChoseException {
		trucService.ajouterUnTruc(chose);

		if (taille > 0) {
			StringBuilder result = new StringBuilder();
			while (result.length() < taille) {
				result.append(chose);
			}

			return result.substring(0, taille);
		}
		return chose;
	}



}