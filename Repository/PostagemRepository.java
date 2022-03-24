package org.generation.blogpessoal.repository;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.generation.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//findAllByTitulo (busca tudo pelo Titulo)

// Titulo: uma das variaveis declaradas em model

/*@NotNull
	@Size(min=4, max=50)
	private String texto;*/ 

//containing: mesma coisa do LIKE no SQL, busca por caracteres dentro dos parâmetros. Neste caso, (String titulo).

//IgnoreCase. Busca por maiúsculos e minúsculos não é diferida no parâmetro de busca.


@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
