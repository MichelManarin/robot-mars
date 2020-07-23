
package com.mars.apirest.repository.orientacao;

import com.mars.apirest.repository.Robo;

public class OrientacaoSul implements Orientacao{

    @Override
    public void Mover(Robo robo) {
        robo.DiminuirOrdenada();
    }    
    
    @Override
    public void GirarDireita(Robo robo) {
        robo.AlterarDirecao(new OrientacaoOeste());
    }
    
    @Override
    public void GirarEsquerda(Robo robo) {
        robo.AlterarDirecao(new OrientacaoLeste());
    }
    
    @Override
	public String GetSigla() {
		return "S";		
	}
}

