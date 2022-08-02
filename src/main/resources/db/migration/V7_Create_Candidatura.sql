CREATE TABLE `ee_candidatura` (
`id` bigint NOT NULL AUTO_INCREMENT,
`id_usuario` bigint NOT NULL,
`id_vaga` bigint NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`id_vaga`) REFERENCES ee_vaga(id),
FOREIGN KEY (`id_candidato`) REFERENCES ee_candidato(id)
); 

