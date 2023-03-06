-- 1. Criar uma base de dados chamada: exercicio
CREATE DATABASE exercicio;

-- 2. Selecionar a base criada anteriormente
USE exercicio;

-- 3. Criar uma tabela chamada uzuarios , com a seguinte estrutura:
-- a. nome varchar de 20 caracteres
-- b. sobrenome de 40 caracteres
-- c. idade do tipo inteiro
CREATE TABLE uzuarios (
	nome VARCHAR(20),
    sobrenome VARCHAR(40),
    idade INT
);

-- 4. Renomeie a tabela uzuarios para usuarios.
exec sp_rename 'uzuarios', 'usuarios';

-- 5. Adicione uma coluna e-mail com suporte até 40 caracteres
ALTER TABLE usuarios ADD email VARCHAR(40);

-- 6. Exclua a coluna sobrenome
ALTER TABLE usuarios DROP COLUMN sobrenome;

-- 7. Cadastre os seguintes dados:
INSERT INTO usuarios VALUES 
('Vanessa', 16, 'vanessa.rosa@gmail.com'),
('Adailton', 22, 'adailton.mas@yahoo.com'),
('Andressa', 36, 'andressa.simas@uol.com.br'),
('Mayra', 24, 'mayra_antunes@gmail.com'),
('Cristiane', 14, 'cris.maya@gmail.com'),
('Carina', 27, 'carina.almeida@gmail.com'),
('Clóvis', 29, 'clovis.simao@hotmail.com'),
('Gabriela', 23, 'gabriela.bragantino@live.com'),
('Cibele', null, 'cibele_lins@uol.com.br');

-- 8. Exiba quantos registros existem na tabela
SELECT COUNT(*) FROM usuarios;

-- 9. Exibir a quantidade de usuários com idade até 17 anos
SELECT COUNT(*) FROM usuarios WHERE idade <= 17;

-- 10.Retornar a quantidade de usuários com o e-mail gmail
SELECT COUNT(*) FROM usuarios WHERE email LIKE '%gmail%';

-- 11.Retornar o nome e a idade da pessoa mais velha
SELECT nome, idade FROM usuarios WHERE idade = (SELECT MAX(idade) FROM usuarios);

-- 12.Retornar os dados do usuário com idade igual a nulo
SELECT * FROM usuarios WHERE idade is null;

-- 13.Alterar para 27 todas as idades nulas
UPDATE usuarios set idade = 27 WHERE idade is null;

-- 14.Deletar todos os usuários com idade inferior a 18 anos
DELETE FROM usuarios where idade < 18;

-- 15.Excluir todos os dados da tabela e reiniciar a contabilização
DELETE FROM usuarios;

-- 16.Excluir a base de dados
DROP DATABASE exercicio;