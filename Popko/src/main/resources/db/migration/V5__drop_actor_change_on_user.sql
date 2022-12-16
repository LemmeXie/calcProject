INSERT INTO public.roles (id, name)
VALUES ('a6a2f440-c126-4289-a42b-638f532eec58', 'actor');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('2c591160-d9c7-477f-b536-81be483ff0c1', 'Mike', 'Myers', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('3d37fb99-e168-40a0-81f2-28c563549e43', 'Eddie', 'Murphy', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('5655bbd6-24a9-4cff-99ad-d5820dca1662', 'Cameron', 'Diaz', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('e2612b30-44f8-451c-8296-d37fa09fe59d', 'John', 'Lithgow', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('c0f8747c-0aa7-4c44-aa7e-fa052c28d05a', 'Vincent', 'Cassel', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('6b654f43-e0f7-45f2-95e1-4b9ffcb1cc77', 'Antonio', 'Banderas', 'a6a2f440-c126-4289-a42b-638f532eec58');

INSERT INTO public.users (id, first_name, last_name, role)
VALUES ('c9a493d6-cc73-40ea-a72f-f332c38f6b1c', 'John', 'Cleese', 'a6a2f440-c126-4289-a42b-638f532eec58');

alter table "cast"
    rename column id_actor to id_user;

drop table actors;