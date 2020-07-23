
package com.mars.apirest.repository.movimento;

import com.mars.apirest.repository.Robo;

public class MovimentoGirarEsquerda implements Movimento{

    public void executar(Robo robo) {
        robo.getOrientacao_atual().GirarEsquerda(robo);
    }

}
