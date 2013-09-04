package test;

import org.junit.*;

import static org.junit.Assert.*;


import org.openqa.selenium.*;
 

public class TwitterTest extends BeforeAfter{


  @Test
  public void testCase1() throws Exception {
  	String mensagem;
  	mensagem= "automatizando com selenium"+System.currentTimeMillis();
  	LoginPage login = new LoginPage(driver);
  	login.escreveUsername("gutsrsdojo");
  	login.escreveSenha("testingdojo");
  	HomePage home =login.entrar();
    home.escreveTweet(mensagem);
    home.enviaTweet();
    assertEquals ("Seu Tweet foi publicado!",home.getMsg());
    assertEquals(mensagem, home.getFirstTweet());

  }



@Test
  public void testCase2() throws Exception {
	String mensagem;
	mensagem="@gutsrsdojo Nos Testes automatizados com Selenium"+System.currentTimeMillis();

	LoginPage login = new LoginPage(driver);
  	login.escreveUsername("gutsrsdojo");
  	login.escreveSenha("testingdojo");
  	HomePage home =login.entrar();
    home.escreveTweet(mensagem);
    home.enviaTweet();
    assertEquals ("Seu Tweet para @gutsrsdojo foi enviado!",home.getMsg());
    assertEquals(mensagem, home.getFirstTweet());
    assertEquals ("Seu Tweet para @gutsrsdojo foi enviado!",home.getMsg());
    assertEquals(mensagem, home.getFirstTweet());
  }

}