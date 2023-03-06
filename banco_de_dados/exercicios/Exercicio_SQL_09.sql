-- Implementando o exercício anterior de Joins, crie uma View contendo as
-- seguintes funcionalidades:
-- 1. Listar o nome do cliente e o nome do curso.
CREATE VIEW clientesCurso AS SELECT clientes.cliente, cursos.curso FROM clientes INNER JOIN cursos on cursos.codigo = clientes.codigo_curso;
SELECT * FROM clientesCurso;
-- 2. Listar todos os cursos e o nome dos clientes que fazem determinado curso,
-- caso não exista cliente para determinado curso, deverá aparecer null no
-- nome do cliente.
CREATE VIEW cursosClientes AS SELECT cursos.curso, clientes.cliente FROM cursos LEFT JOIN  clientes on clientes.codigo_curso = cursos.codigo;
SELECT * FROM cursosClientes;

-- 3. Exibir o nome dos cursos e a quantidade de clientes cadastrados em cada curso.
CREATE VIEW quantidadeClientes AS SELECT cursos.curso, COUNT(clientes.cliente) AS contagemClientes FROM cursos LEFT JOIN  clientes on clientes.codigo_curso = cursos.codigo GROUP BY cursos.curso;
SELECT * FROM quantidadeClientes;

-- 4. Exibir em ordem alfabética o nome dos clientes.
CREATE VIEW clientesOrdenados AS SELECT TOP(100) clientes.cliente FROM clientes ORDER BY clientes.cliente;
SELECT * FROM clientesOrdenados;

CREATE VIEW clientesOrdenados AS SELECT clientes.cliente FROM clientes;
SELECT * FROM clientesOrdenados ORDER BY cliente;

-- 5. Excluir todas as Views criadas.
DROP VIEW clientesCurso;
DROP VIEW cursosClientes;
DROP VIEW quantidadeClientes;
DROP VIEW clientesOrdenados;
