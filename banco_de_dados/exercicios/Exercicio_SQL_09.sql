-- 1. Criar uma base de dados chamada exercicio_joins
CREATE DATABASE exercicio_joins;

USE exercicio_joins;

-- 2. Implemente a tabela cursos , com os seguintes campos:
CREATE TABLE cursos (
	codigo INT IDENTITY(1,1),
	curso VARCHAR(30),
	PRIMARY KEY(codigo)
);

-- 3. Desenvolva a tabela clientes, com os seguintes campos:
CREATE TABLE clientes (
	codigo INT IDENTITY(1,1),
	cliente VARCHAR(30),
	codigo_curso INT,
	PRIMARY KEY(codigo),
	FOREIGN KEY(codigo_curso) REFERENCES cursos(codigo)
);

-- 4. Cadastre os cursos:
INSERT INTO cursos (curso) VALUES
('Java'),
('C#'),
('Python'),
('PHP'),
('Node.js');

-- 5. Cadastre os seguintes clientes:
INSERT INTO clientes (cliente, codigo_curso) VALUES
('Larissa', 3),
('Gabriel', 1),
('Jean', 1),
('Gabriela', 2),
('Robson', 3),
('Isabella', 3),
('Eduardo', 2),
('Juliana', 3),
('Carlos', 2),
('Lorena', 1)
;

-- 6. Liste o nome dos clientes e o nome dos cursos que cada um está participando.
SELECT clientes.cliente, cursos.curso FROM clientes INNER JOIN cursos ON cursos.codigo = clientes.codigo_curso;

-- 7. Contar a quantidade de cursos adquiridos pelos clientes. Exiba o nome e a
-- quantidade desses cursos. Será obrigatório a exibição de todos os cursos,
-- independente se há clientes realizando esse curso.
SELECT cursos.curso, COUNT(clientes.cliente) FROM clientes RIGHT JOIN cursos ON cursos.codigo = clientes.codigo_curso GROUP BY cursos.curso;

SELECT cursos.curso, COUNT(clientes.cliente) FROM cursos LEFT JOIN clientes ON clientes.codigo_curso = cursos.codigo GROUP BY cursos.curso;