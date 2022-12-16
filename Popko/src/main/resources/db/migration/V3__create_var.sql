create table films
(
    id   uuid    not null,
    name varchar not null,
    UNIQUE (id, name),
    PRIMARY KEY (id)
);
CREATE TABLE actors
(
    id   uuid    not null,
    name varchar not null,
    unique (id, name),
    primary key (id)
);
create table "cast"
(
    id       uuid    not null,
    name     varchar not null,
    id_film  uuid    not null,
    id_actor uuid    not null,
    unique (id),
    primary key (id)
);