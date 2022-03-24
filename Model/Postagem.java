package org.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity //infdica que virará uma tabela
@Table(name="tb_postagens") // Passa um nome para a tabela
public class Postagem {

	@Id //indica ao banco de dados que é uma chave primária
	@GeneratedValue(strategy= GenerationType.IDENTITY) //Indica o autoincrement pro BD
	private Long id;
	
	@NotNull
	private String titulo;
	
	@NotNull
	@Size(min=4, max=50)
	private String texto;
	
	@UpdateTimestamp //formatar o data de acordo com a formatação do meu PC
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
