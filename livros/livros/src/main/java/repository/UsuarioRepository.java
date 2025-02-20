package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emprestimo.example.livros.model.EmprestimoModel;

public interface UsuarioRepository extends JpaRepository<EmprestimoModel, Integer> {

}
