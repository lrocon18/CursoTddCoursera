package com.lssdeveloper.tdd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;



public class TesteConverterCamelCase {
	@Test
	public void testeConverterCamelCase() {
	    String original = "nomeComposto";
	    List<String> expected = Arrays.asList("nome", "Composto");
	    List<String> result = Main.converterCamelCase(original);
	    assertEquals(expected, result);
	}
	@Test
	public void testeConverterCamelCaseComPalavraUnica() {
	    String original = "cpf";
	    List<String> expected = Collections.singletonList("cpf");
	    List<String> result = Main.converterCamelCase(original);
	    assertEquals(expected, result);
	}

	@Test
	public void testeConverterCamelCaseComNumeros1() {
	    String original = "palavra32";
	    List<String> expected = Collections.singletonList("palavra32");
	    List<String> result = Main.converterCamelCase(original);
	    assertEquals(expected, result);
	}
	@Test
	public void testeConverterCamelCaseComNumeros2() {
	    String original = "cursoTddIta";
	    List<String> expected = Arrays.asList("curso","Tdd", "Ita");
	    List<String> result = Main.converterCamelCase(original);
	    assertEquals(expected, result);
		}
	   
}
