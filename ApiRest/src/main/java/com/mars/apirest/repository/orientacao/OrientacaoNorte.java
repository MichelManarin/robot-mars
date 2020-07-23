
package com.mars.apirest.repository.orientacao;

import com.mars.apirest.repository.Robo;

public class OrientacaoNorte implements Orientacao{

    @Override
    public void Mover(Robo robo) {
        robo.AumentarOrdenada();
    }    
    
    @Override
    public void GirarDireita(Robo robo) {
        robo.AlterarDirecao(new OrientacaoLeste());
    }
    
    @Override
    public void GirarEsquerda(Robo robo) {
        robo.AlterarDirecao(new OrientacaoOeste());
    }
    
    @Override
	public String GetSigla() {
		return "N";		
	}
}

