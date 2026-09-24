package br.com.bossini;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder  
@Getter 
@Setter
public class Pessoa {
  private String nome;
  private int idade;
  private double peso;  
}

