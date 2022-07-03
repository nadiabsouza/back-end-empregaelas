CREATE TABLE `ee_endereco` (
  `id` bigint NOT NULL UNIQUE AUTO_INCREMENT,
  `logradouro` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `num` varchar(5) COLLATE utf8_unicode_ci NOT NULL,
  `compl` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bairro` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `uf` char(2) COLLATE utf8_unicode_ci NOT NULL,
  `cep` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `ee_empresa` (
  `id` bigint NOT NULL UNIQUE AUTO_INCREMENT,
  `cnpj` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  `razao_social` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nome_fantasia` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `responsavel` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `segmento` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `num_func` int NOT NULL,
  `tipo_permissao` enum('empresa','candidato','administrador'),
  `id_endereco` bigint NOT NULL,
  `email_usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `data_cadastro` datetime NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_endereco`) REFERENCES ee_endereco(id)
);

CREATE TABLE `ee_candidato` (
  `id` bigint NOT NULL UNIQUE AUTO_INCREMENT,
  `cpf` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `nome` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `nome_social` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `data_nasc` date NOT NULL,
  `telefone` varchar(11) COLLATE utf8_unicode_ci NOT NULL,
  `estado_civil` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `linkedin` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `github` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `portfolio` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `raca` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `genero` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `sexo_bio` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `sobre` text COLLATE utf8_unicode_ci DEFAULT NULL,
  `idioma` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pretensao_salarial` decimal(5,2)  DEFAULT NULL,
  `pcd` enum('fisica','auditiva','visual','mental','multipla') DEFAULT NULL,
  `id_fa` bigint DEFAULT NULL,
  `id_experiencia` bigint DEFAULT NULL,
  `tipo_permissao` enum('empresa','candidato','administrador'),
  `id_endereco` bigint DEFAULT NULL,
  `email_usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `data_cadastro` datetime NOT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `ee_vaga` (
 `id` bigint NOT NULL AUTO_INCREMENT, 
 `id_empresa` bigint NOT NULL, 
`publicada` Tinyint (1) NOT NULL, 
`data_publicacao` datetime NOT NULL, 
`cargo` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`nivel` varchar(20) COLLATE utf8_unicode_ci NOT NULL, 
`jornada` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`salario` decimal(5,2) DEFAULT NULL, 
`tipo_contrato` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`modalidade` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`descr_vaga` text COLLATE utf8_unicode_ci NOT NULL, 
`requisitos` text COLLATE utf8_unicode_ci NOT NULL, 
`desejavel` text COLLATE utf8_unicode_ci NOT NULL, 
`beneficios` text COLLATE utf8_unicode_ci NOT NULL, 
`uf` char(2) COLLATE utf8_unicode_ci NOT NULL, 
`cidade` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`bairro` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`cep` varchar(10) COLLATE utf8_unicode_ci NOT NULL, 
`exibir_empresa` Tinyint (1) NOT NULL, 
PRIMARY KEY (`id`),
FOREIGN KEY (`id_empresa`) REFERENCES ee_empresa(id)

);

CREATE TABLE `ee_formacao_academica` (
  `id` bigint NOT NULL UNIQUE AUTO_INCREMENT,
  `id_candidato` bigint NOT NULL,
  `formacao` varchar(13) COLLATE utf8_unicode_ci NOT NULL,
  `curso` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `instituicao` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `data_inicio` date NOT NULL,
  `data_final` date NOT NULL,
  `informacoes_adicionais` text COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`id_candidato`) REFERENCES ee_candidato(id)
  
);

CREATE TABLE `ee_experiencia` (
 `id` bigint NOT NULL AUTO_INCREMENT,
`id_candidato` bigint NOT NULL,
 `tipo_contrato` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`contratante` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`cargo` varchar(30) COLLATE utf8_unicode_ci NOT NULL, 
`data_inicio` date NOT NULL,
`emprego_atual` Tinyint (1) NOT NULL, 
`data_saida`  date DEFAULT NULL, 
`atribuicoes` text NOT NULL, 
PRIMARY KEY (`id`),
FOREIGN KEY (`id_candidato`) REFERENCES ee_candidato(id)
);

CREATE TABLE `ee_candidatura` (
`id` bigint NOT NULL AUTO_INCREMENT, 
`id_candidato` bigint NOT NULL, 
`id_vaga` bigint NOT NULL, 
PRIMARY KEY (`id`),
FOREIGN KEY (`id_vaga`) REFERENCES ee_vaga(id),
FOREIGN KEY (`id_candidato`) REFERENCES ee_candidato(id)
); 


