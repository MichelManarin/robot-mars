package com.mars.apirest.repository;

import com.mars.apirest.repository.movimento.MovimentoFrente;
import com.mars.apirest.repository.movimento.MovimentoGirarDireita;
import com.mars.apirest.repository.movimento.MovimentoGirarEsquerda;

public class ExecutaComando {

	
	public String ExecutaComando(String comando) throws Exception {
	
		char [] letras = comando.toCharArray();
		
		Terreno terreno = new Terreno(-5, 5, -5, 5);
	    Robo robo = new Robo(terreno, 0 ,0);
	    
	    MovimentoFrente movimento = new MovimentoFrente();
	    MovimentoGirarDireita movimento_girarDireita = new MovimentoGirarDireita();
	    MovimentoGirarEsquerda movimento_girarEsquerda = new MovimentoGirarEsquerda();
		
		for (char le : letras) {
			
			switch(le) {
			  case 'L':
			    movimento_girarEsquerda.executar(robo);
			    break;
			  case 'R':
				movimento_girarDireita.executar(robo);
			    break;
			  case 'M':
				movimento.executar(robo);
				break;
			  default:
		        throw new Exception("Comando inválido.");
			}
		}
		
	
        return robo.getLocalizacao();
	    
	}
}
