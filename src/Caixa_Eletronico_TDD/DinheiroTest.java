package Caixa_Eletronico_TDD;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class DinheiroTest extends TestCase {

	@Test
	public void testDinheiro() {
		Dinheiro dinheiro = new Dinheiro();
		dinheiro.setValor(1000);
		assertEquals(1000, dinheiro.getValor());
	}

}
