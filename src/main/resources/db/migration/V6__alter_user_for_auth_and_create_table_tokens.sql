DELETE
FROM public.users
WHERE id = '698b26b7-305d-4948-b30a-66e282643226';

DELETE
FROM public.users
WHERE id = 'fcf4d1c4-b3ba-461b-8a6f-3e800d066e90';

DELETE
FROM public.users
WHERE id = 'c9a493d6-cc73-40ea-a72f-f332c38f6b1c';

DELETE
FROM public.users
WHERE id = 'e2612b30-44f8-451c-8296-d37fa09fe59d';

DELETE
FROM public.users
WHERE id = '3d37fb99-e168-40a0-81f2-28c563549e43';

DELETE
FROM public.users
WHERE id = 'c0f8747c-0aa7-4c44-aa7e-fa052c28d05a';

DELETE
FROM public.users
WHERE id = '5655bbd6-24a9-4cff-99ad-d5820dca1662';

DELETE
FROM public.users
WHERE id = '6b654f43-e0f7-45f2-95e1-4b9ffcb1cc77';

DELETE
FROM public.users
WHERE id = '2c591160-d9c7-477f-b536-81be483ff0c1';


ALTER TABLE users
    ADD email varchar(25)  NOT NULL UNIQUE default 'email',
    ADD password varchar(120) NOT NULL default '123',
    ADD enabled boolean default true;

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('698b26b7-305d-4948-b30a-66e282643226', 'user', 'user', '2c7a6b67-3ba1-4e6d-81c1-091a65469af0', 'user@user.com',
        '12345');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('fcf4d1c4-b3ba-461b-8a6f-3e800d066e90', 'admin', 'admin', 'ae4ff1ff-ff6e-4ee7-9bd6-4843ff0ccb87',
        'admin@user.com', '123');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('74322341-473e-4e28-b702-4c751db6ae29', 'firstnameGest', 'lastnameTest', '2c7a6b67-3ba1-4e6d-81c1-091a65469af0',
        'fn@user.com', '123');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('2c591160-d9c7-477f-b536-81be483ff0c1', 'Mike', 'Myers', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'MikeMyers@email.com', 'Myers');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('3d37fb99-e168-40a0-81f2-28c563549e43', 'Eddie', 'Murphy', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'EddieMurphy@email.com', '123412');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('5655bbd6-24a9-4cff-99ad-d5820dca1662', 'Cameron', 'Diaz', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'CameronDiaz@email.com', '123');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('e2612b30-44f8-451c-8296-d37fa09fe59d', 'John', 'Lithgow', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'JohnLithgow@email.com', '123');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('c0f8747c-0aa7-4c44-aa7e-fa052c28d05a', 'Vincent', 'Cassel', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'VincentCassel@email.com', '123');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('6b654f43-e0f7-45f2-95e1-4b9ffcb1cc77', 'Antonio', 'Banderas', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'AntonioBanderas@email.com', '132');

INSERT INTO public.users (id, first_name, last_name, role, email, password)
VALUES ('c9a493d6-cc73-40ea-a72f-f332c38f6b1c', 'John', 'Cleese', 'a6a2f440-c126-4289-a42b-638f532eec58',
        'JohnCleese@email.com', '123');

create table if not exists tokens(
                                     user_id uuid not null,
                                     value varchar(255) not null,
                                     killed bool,
                                     primary key(user_id),
                                     unique (user_id),
                                     unique (value)
);
alter table tokens add foreign key (user_id) references users(id)