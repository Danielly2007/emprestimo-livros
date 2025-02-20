package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emprestimo.example.livros.model.EmprestimoModel;

public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Integer>{

}
