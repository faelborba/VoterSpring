create table voter (
  id integer identity primary key,
  email varchar(255) unique not null,
  name varchar(255) not null,
  password varchar(255) not null
);

create table token (
  id integer identity primary key,
  voter_id integer unique not null,
  token varchar(255) not null,
  expire_date datetime not null
);
