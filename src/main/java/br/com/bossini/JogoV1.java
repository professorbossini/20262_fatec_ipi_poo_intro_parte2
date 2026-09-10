package br.com.bossini;

public class JogoV1 {
  public static void main(String[] args) {
    var p = new Personagem();//Java 10+
    p.nome = "John";
    p.cacar();
    p.comer();
    p.dormir();  
  }  
}
