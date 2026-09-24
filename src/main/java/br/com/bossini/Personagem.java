package br.com.bossini;

public class Personagem {
  private static final int ENERGIA_MINIMA_PADRAO = 0;
  private static final int ENERGIA_MAXIMA_PADRAO = 10;
  private static final int ENERGIA_PADRAO = 10;
  private static final int FOME_MINIMA_PADRAO = 0;
  private static final int FOME_MAXIMA_PADRAO = 10;
  private static final int FOME_PADRAO = 0; 
  private static final int SONO_MINIMA_PADRAO = 0;
  private static final int SONO_MAXIMA_PADRAO = 10;
  private static final int SONO_PADRAO = 0;  
  String nome;
  private int energia;
  private int fome;
  private int sono;

  
    return energia;
  }
  //sobrecarga de construtores(overload)
  Personagem(){
    energia = ENERGIA_PADRAO;
    fome = FOME_PADRAO;
    sono = SONO_PADRAO;
  }

  Personagem(int energia, int fome, int sono){
    if(energia >= ENERGIA_MINIMA_PADRAO && energia <= ENERGIA_MAXIMA_PADRAO)
      this.energia = energia;
    else
      this.energia = ENERGIA_PADRAO;
    if(fome >= FOME_MINIMA_PADRAO && fome <= FOME_MAXIMA_PADRAO)
      this.fome = fome;
    else
      this.fome = FOME_PADRAO;
    if(sono >= SONO_MINIMA_PADRAO && sono <= SONO_MAXIMA_PADRAO)
      this.sono = sono;  
    else
      sono = SONO_PADRAO;
  }
  
  void cacar(){
    if(energia >= 2){
      System.out.printf("%s caçando...\n", nome);
      energia -= 2; //energia = energia - 2;
    }
    else{
      System.out.printf("%s sem energia para caçar...\n", nome);
    }
    if(fome < 10)
      fome++;
    sono = Math.min(sono + 1, 10);
  }

  void comer(){
    if(fome >= 1){
      System.out.printf("%s comendo...\n", nome);
      fome--;
      energia = energia < 10 ? energia + 1 : energia;
    }
    else{
      System.out.printf("%s sem fome...\n", nome);
    }
  }

  void dormir(){
    if(sono >= 1){
      System.out.println(nome + " dormindo...");
      --sono;
      if(energia < 10) energia++;
    }
    else{
      System.out.println(nome + " sem sono...");
    }
  }
 
  void exibirEstado(){
    System.out.printf(
      "nome: %s, energia: %d, fome: %d, sono: %d\n",
      nome, energia, fome, sono     
    );
  }

  @Override 
  public String toString(){
    return String.format(
      "nome: %s, e: %d, f: %d, s: %d",
        nome, energia, fome, sono
    );
  }

}
