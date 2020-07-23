package com.mars.apirest.repository.orientacao;

import com.mars.apirest.repository.Robo;

public interface Orientacao {
            
    public void Mover(Robo robo);
    public void GirarDireita(Robo robo);
    public void GirarEsquerda(Robo robo);
    public String GetSigla();
}
