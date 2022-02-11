package com.br.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // criando getters e setters
@AllArgsConstructor // criando o construtor com argumentos
@NoArgsConstructor // criando o construtor sem argumentos
@Builder(toBuilder = true) //criar os nosso objetos de uma maneira facil
public class PostModel {
	
	private Integer id;
	private String nome;
	private int idade;
	private String sexo;
	private int telefone;
	private String endereco;
	private String estado_civil;
	private int cep;
	private String local_nascimento;
	private String historico_paciente;

}
