CREATE TABLE public.cad_cliente (
	codigo serial NOT NULL,
	pj_pf char NOT NULL,
	razao_social varchar(50) NOT NULL,
	cpf_cnpj varchar(14) NOT NULL,
	ins_est_rg varchar(12) NOT NULL,
	tel1 numeric(11) NOT NULL,
	tel2 numeric(11) NOT NULL,
	email varchar(50) NOT NULL,
	cep char NOT NULL,
	estado char NOT NULL,
	ativ_prof varchar(50) NOT NULL,
	cidade varchar(50) NOT NULL,
	rua varchar(50) NOT NULL,
	numero varchar(6) NOT NULL,
	bairro varchar(50) NOT NULL,
	site varchar(50) NULL,
	observacoes text NULL
);

