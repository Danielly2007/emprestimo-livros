package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emprestimo.example.livros.model.EmprestimoModel;
import repository.EmprestimoRepository;

@Service
public class EmprestimoService {


@Autowired
private EmprestimoRepository emprestimoRepository;

public EmprestimoModel registrarEmprestimo(EmprestimoModel emprestimo) {
    return emprestimoRepository.save(emprestimo);
         }


}
