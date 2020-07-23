package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mars.apirest.repository.ExecutaComando;
import com.mars.apirest.repository.Robo;
import com.mars.apirest.repository.Terreno;
import com.mars.apirest.repository.movimento.MovimentoFrente;
import com.mars.apirest.repository.movimento.MovimentoGirarDireita;
import com.mars.apirest.repository.movimento.MovimentoGirarEsquerda;

class TestRobo {

	@Test
	void test() throws Exception {
		String result = new ExecutaComando().ExecutaComando("MML");
		System.out.printf("%s",result);
		assertEquals("(0, 2, W)", result);
	}
	
	@Test
	void test2() throws Exception {
		String result = new ExecutaComando().ExecutaComando("MMRMMRMM");
		System.out.printf("%s",result);
		assertEquals("(2, 0, S)", result);
	}

}
