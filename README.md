# emprestimo-livros

Sql

INSERT INTO livros.usuario_modell (name, email) 
VALUES ('João', 'joao@example.com'),
       ('Maria', 'maria@example.com'),
       ('Pedro', 'pedro@example.com');


INSERT INTO livros.livros_model (titulo, autor, ano_publicacao)
VALUES
    ('O Senhor dos Anéis', 'J.R.R. Tolkien', 1954),
    ('1984', 'George Orwell', 1949),
    ('Dom Casmurro', 'Machado de Assis', 1899);


INSERT INTO emprestimo_model (data_devolucao_prevista,  data_emprestimo, livro_id ,usuario_id )
VALUES
    ('2025-02-01','2025-01-01',  2 , 1 ),
    ('2025-02-01','2025-01-01',  2 , 1 ),
    ('2025-02-01','2025-01-01',  2 , 1 );
    
