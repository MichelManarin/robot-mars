package com.mars.apirest.repository.movimento;

import com.mars.apirest.repository.Robo;

public interface Movimento {
            
    public void executar(Robo robo) throws Exception;
}
