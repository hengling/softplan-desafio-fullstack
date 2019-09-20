DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  tipo VARCHAR(32) DEFAULT NULL,
  situacao VARCHAR(32) DEFAULT NULL
);

INSERT INTO usuario (nome, email, tipo, situacao) VALUES
  ('José de Freitas', 'josefreitas@tj.com.br', 'ADMINISTRADOR', 'ATIVO'),
  ('João da Silva', 'joaosilva@tj.com.br', 'TRIADOR', 'ATIVO'),
  ('Maria da Glória', 'mariagloria@tj.com.br', 'FINALIZADOR', 'ATIVO');