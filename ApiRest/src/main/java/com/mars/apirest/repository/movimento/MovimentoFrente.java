package com.mars.apirest.repository.movimento;

import com.mars.apirest.repository.Robo;

public class MovimentoFrente implements Movimento  {

    public void executar(Robo robo) throws Exception {
        robo.getOrientacao_atual().Mover(robo);
        robo.ValidarLocalizacao();
    }

}
