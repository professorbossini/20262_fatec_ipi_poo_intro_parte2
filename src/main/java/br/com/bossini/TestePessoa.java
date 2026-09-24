package br.com.bossini;

public class TestePessoa {
  public static void main(String[] args) {
    var p1 = new Pessoa("Ana", 18, 80);
    var p2 = 
    Pessoa
    .builder()
    .nome("Ana")
    .idade(18)
    .peso(80)
    .build();


    // var p = new Pessoa("Ana", 80);
    // p.setIdade(18);
    // p.setNome("Ana");
    // p.setPeso(80);
  }
}
