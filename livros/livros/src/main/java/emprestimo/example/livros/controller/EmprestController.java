package emprestimo.example.livros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emprestimo.example.livros.model.EmprestimoModel;
import service.EmprestimoService;

public class EmprestController {
	@RestController
	@RequestMapping("/emprestimos")
	public class EmprestimoController {

	    @Autowired
	    private EmprestimoService emprestimoService;

	    @PostMapping
	    public EmprestimoModel registrarEmprestimo(@RequestBody EmprestimoModel emprestimo) {
	        return emprestimoService.registrarEmprestimo(emprestimo);
	    }

	    
	}
}