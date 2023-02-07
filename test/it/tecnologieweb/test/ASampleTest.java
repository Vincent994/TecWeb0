package it.tecnologieweb.test;

//occorre aggiungere la libreria richiesta al build path libraries classpath (che non veniva trovata dal compilatore di eclipse).
//la libreria si trova nella cartella lib, la devo aggiungere affinchè venga vista

import junit.framework.Assert;

import it.tecnologieweb.app.HelloWorld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ASampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inizializzazione generale");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Pulizia generale");
	}

	// -------------------------------------------------------------------------

	@Before
	public void setUp() throws Exception {
		System.out.println("Inizializzazione prima di ogni test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Pulizia dopo ogni test");
	}
	// -------------------------------------------------------------------------

	@Test
	public void nomeCorretto() {
		String nome = "techweb";
		HelloWorld helloWorld = new HelloWorld(nome);
		Assert.assertEquals("Nome memorizzato con successo", nome, helloWorld.getName());
	}

	@Test
	public void rispostaCorretta() {
		String nome = "techweb";
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName(nome);
		Assert.assertTrue("Nome utilizzato con successo", helloWorld.sayIt().endsWith(nome));
	}

	// verificare che a seguito di una set(XX) si ottiene XX dalla get; aggiungere eventuali metodi
	// alla classe helloworld

}
