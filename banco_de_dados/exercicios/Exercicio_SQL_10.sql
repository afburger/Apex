-- Com base no capítulo 10 sobre Stored Procedure, elabore as questões
-- propostas abaixo:
-- 1. Criar uma base de dados chamada exercicios_procedure.
CREATE DATABASE exercicios_procedure;

-- 2. Desenvolva uma tabela com os campos código (int, ai e pk), nome (varchar 30) e idade (int).
CREATE TABLE usuarios (
	codigo INT IDENTITY(1,1),
	nome VARCHAR(30),
    idade INT
	PRIMARY KEY(codigo)
);

-- 3. Crie uma procedure para cadastrar novos usuários, essa procedure deverá ter dois parâmetros, sendo eles o nome e a idade.
CREATE PROCEDURE cadastraUsuario @nome VARCHAR(30), @idade INT AS INSERT INTO usuarios (nome, idade) VALUES (@nome, @idade);

EXEC cadastraUsuario @nome = 'André', @idade = 30;

-- 4. Implementar uma procedure para alterar dados, para isso peça o código, nome e idade.
CREATE PROCEDURE alteraUsuario @codigo INT, @nome VARCHAR(30), @idade INT AS UPDATE usuarios SET nome = @nome, idade = @idade WHERE codigo = @codigo;

EXEC alteraUsuario @codigo = 1, @nome = 'Felipe', @idade = 32;

-- 5. Desenvolver uma procedure para remover um usuário através do nome.
CREATE PROCEDURE excluiUsuario @nome VARCHAR(30) AS DELETE FROM usuarios WHERE nome = @nome;

EXEC excluiUsuario @nome = 'Felipe';

-- 6. Excluir todas as procedures.
DROP PROCEDURE cadastraUsuario;
DROP PROCEDURE alteraUsuario;
DROP PROCEDURE excluiUsuario;

-- 7. Excluir a base de dados.
DROP DATABASE exercicios_procedure;