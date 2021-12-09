CREATE TABLE produto (
    id BIGINT AUTO_INCREMENT,
    codigo VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    quantidade INT DEFAULT 0,
    valor DOUBLE NOT NULL,
    UNIQUE(codigo),
    PRIMARY KEY (id)
);