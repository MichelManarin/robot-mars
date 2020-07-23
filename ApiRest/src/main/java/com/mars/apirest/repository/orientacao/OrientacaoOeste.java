
package com.mars.apirest.repository.orientacao;

import com.mars.apirest.repository.Robo;

public class OrientacaoOeste implements Orientacao{

    @Override
    public void Mover(Robo robo) {
        robo.DiminuirAbcissa();
    }    
    
    @Override
    public void GirarDireita(Robo robo) {
        robo.AlterarDirecao(new OrientacaoNorte());
    }
    
    @Override
    public void GirarEsquerda(Robo robo) {
        robo.AlterarDirecao(new OrientacaoSul());
    }
    
    @Override
	public String GetSigla() {
		return "W";		
	}
}

