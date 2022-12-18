CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
create table if not exists roles
(
    id          uuid            not null,
    name        varchar(100)    not null,
    UNIQUE      (id),
    PRIMARY KEY (id)
    );
create table if not exists users
(
    id          uuid         not null,
    first_name  varchar(100) not null,
    last_name   varchar(100) not null,
    role        uuid,
    UNIQUE      (id),
    PRIMARY KEY (id)
    );
ALTER TABLE users ADD CONSTRAINT fk_roles FOREIGN KEY (role) references roles(id)