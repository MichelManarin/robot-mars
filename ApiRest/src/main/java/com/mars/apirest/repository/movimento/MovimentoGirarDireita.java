
package com.mars.apirest.repository.movimento;

import com.mars.apirest.repository.Robo;

public class MovimentoGirarDireita implements Movimento{

    public void executar(Robo robo) {
        robo.getOrientacao_atual().GirarDireita(robo);
    }

}
