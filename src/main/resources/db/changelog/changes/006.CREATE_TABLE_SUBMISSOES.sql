create table submissoes (
  id bigint auto_increment not null,
  evento varchar(255) not null,
  usuario varchar(255) not null,
  titulo varchar(255) not null,
  resumo varchar(255) not null,
  dataSubmissao varchar(255) not null,
  arquivo varchar(255) not null,
  primary key (id)
)


