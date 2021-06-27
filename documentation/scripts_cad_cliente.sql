-- Criar tabela
CREATE TABLE public.tab_cliente (
	codigo int4 NOT NULL,
	pj_pf bpchar(1) NOT NULL,
	razao_social varchar(50) NOT NULL,
	cpf_cnpj varchar(14) NOT NULL,
	ins_est_rg varchar(12) NOT NULL,
	tel1 numeric(11) NOT NULL,
	tel2 numeric(11) NOT NULL,
	email varchar(70) NOT NULL,
	ativ_prof varchar(50) NOT NULL,
	cep bpchar(8) NOT NULL,
	estado bpchar(2) NOT NULL,
	cidade varchar(50) NOT NULL,
	rua varchar(50) NOT NULL,
	numero varchar(6) NOT NULL,
	complemento varchar(30) NULL,
	bairro varchar(40) NOT NULL,
	site varchar(50) NULL,
	observacoes text NULL,
	CONSTRAINT tab_cliente_pkey PRIMARY KEY (codigo)
);