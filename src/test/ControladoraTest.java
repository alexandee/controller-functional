package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controladora.Controladora;

class ControladoraTest {

	@Test
	void executarTest1() {
		Controladora controladora = new Controladora();
		assertEquals("001234321000", controladora.executar("..P...O....."));
	}
	
	@Test
	void executarTest2() {
		Controladora controladora = new Controladora();
		assertEquals("012345", controladora.executar(".P...."));
	}
	
	@Test
	void executarTest3() {
		Controladora controladora = new Controladora();
		assertEquals("000122222345", controladora.executar("...P.P...P.."));	
	}
	
	@Test
	void executarTest4() {
		Controladora controladora = new Controladora();
		assertEquals("123210", controladora.executar("P..O.."));	
	}
	
	@Test
	void executarTest5() {
		Controladora controladora = new Controladora();
		assertEquals("123333343210", controladora.executar("P..P...PO..."));
	}
	
	@Test
	void executarTest6() {
		Controladora controladora = new Controladora();
		assertEquals("123432344444555", controladora.executar("P...O.O.P...P.."));
	}
	
	@Test
	void executarTest7() {
		Controladora controladora = new Controladora();
		assertEquals("123455433332100", controladora.executar("P.....P.P..P..."));
	}
	
	@Test
	void executarTest8() {
		Controladora controladora = new Controladora();
		assertEquals("000001234555555", controladora.executar("O..O.P......O.."));
	}
	
	@Test
	void executarTest9() {
		Controladora controladora = new Controladora();
		assertEquals("11223", controladora.executar("PPPPP"));
	}
	
	@Test
	void executarTest10() {
		Controladora controladora = new Controladora();
		assertEquals("121212", controladora.executar("P.OOOO"));
	}

	@Test
	void executarTest11() {
		Controladora controladora = new Controladora();
		assertEquals("10111111", controladora.executar("POPP...."));
	}


}
