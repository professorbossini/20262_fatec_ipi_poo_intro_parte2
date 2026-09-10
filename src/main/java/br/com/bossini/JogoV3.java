package br.com.bossini;
import java.util.Random;
public class JogoV3 {
  public static void main(String[] args) throws Exception {
    var p = new Personagem();
    var gerador = new Random();
    p.nome = "John";
    while(true){
      var oQueFazer = 1 + gerador.nextInt(3);//[0, 5)
      switch(oQueFazer){
        case 1:
          p.cacar();
          break;
        case 2:
          p.comer();
          break;
        case 3:
          p.dormir();
          break;
      }
      p.exibirEstado();
      System.out.println("------------------------------");
      Thread.sleep(8000);
    }
  }
}
