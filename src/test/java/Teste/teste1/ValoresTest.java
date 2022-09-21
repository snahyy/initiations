package Teste.teste1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValoresTest {
		Valores val;
	@Before
	public void setUp() throws Exception {
		val = new Valores();
	}

	@Test
	public void testIns() {
		boolean resp = val.ins(-1);
		assertFalse(resp);
	}

	@Test
	public void maisDe10() {
		for (int i = 1; i <= 10; i++) {
			val.ins(i);
		}
		boolean resp = val.ins(11);
		assertFalse(resp);
	}

	@Test
	public void media() {
		val.ins(10);
		val.ins(5);
		val.ins(5);
		val.ins(5);

		double resp = val.mean();

		assertEquals(resp, 6.25, 0.01);
	}

	@Test
	public void tamanho() {
		val.ins(1);
		val.ins(2);

		assertEquals(val.size(), 2);
	}
	
	@Test
	public void maiorNumero() {
		val.ins(1);
		val.ins(2);
		val.ins(3);
		val.ins(4);
		val.ins(5);
		val.ins(6);
		val.ins(7);
		val.ins(8);
		val.ins(9);
		val.ins(10);
		
		int resp = val.greater();
		assertEquals(resp, 10);
	}
	
	@Test
	public void menorNumero() {
		val.ins(1);
		val.ins(2);
		val.ins(3);
		val.ins(4);
		val.ins(5);
		val.ins(6);
		val.ins(7);
		val.ins(8);
		val.ins(9);
		val.ins(10);
		
		int resp = val.lower();
		assertEquals(resp, 1);
	}

	@Test
	public void deletar() {
		val.ins(1);
		val.ins(2);
		val.ins(3);
		val.ins(4);
		val.ins(5);
		val.ins(6);
		val.ins(7);
		val.ins(8);
		val.ins(9);
		val.ins(10);
		
		int resp = val.del(1);
		
		assertEquals(resp, -1);
	}
}
