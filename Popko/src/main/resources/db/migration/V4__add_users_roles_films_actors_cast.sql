INSERT INTO roles (id, name)
VALUES ('ae4ff1ff-ff6e-4ee7-9bd6-4843ff0ccb87', 'landlord'),
       ('2c7a6b67-3ba1-4e6d-81c1-091a65469af0', 'peasant');

INSERT into users(id, first_name, last_name, role)
VALUES ('698b26b7-305d-4948-b30a-66e282643226','user','user','2c7a6b67-3ba1-4e6d-81c1-091a65469af0'),
       ('fcf4d1c4-b3ba-461b-8a6f-3e800d066e90','admin','admin','ae4ff1ff-ff6e-4ee7-9bd6-4843ff0ccb87');

INSERT INTO actors (id, name)
VALUES ('2c591160-d9c7-477f-b536-81be483ff0c1', 'Mike Myers'),
       ('3d37fb99-e168-40a0-81f2-28c563549e43', 'Eddie Murphy'),
       ('5655bbd6-24a9-4cff-99ad-d5820dca1662', 'Cameron Diaz'),
       ('e2612b30-44f8-451c-8296-d37fa09fe59d', 'John Lithgow'),
       ('c0f8747c-0aa7-4c44-aa7e-fa052c28d05a', 'Vincent Cassel'),
       ('6b654f43-e0f7-45f2-95e1-4b9ffcb1cc77', 'Antonio Banderas'),
       ('c9a493d6-cc73-40ea-a72f-f332c38f6b1c', 'John Cleese');

INSERT INTO films (id, name)
VALUES ('476e2d7a-a897-4b5b-b6e3-1609cba623b6', 'Shrek'),
       ('be1dc365-ced3-4cb6-9efc-f673c8dde65c', 'Shrek 2');

INSERT INTO "cast" (id, name, id_film, id_actor)
VALUES ('e191f34d-32ad-45a4-99d4-69d550f4faa5', 'Shrek','476e2d7a-a897-4b5b-b6e3-1609cba623b6','2c591160-d9c7-477f-b536-81be483ff0c1'),
       ('e761a722-b28e-4af3-adb1-43e2495255b7', 'Donkey','476e2d7a-a897-4b5b-b6e3-1609cba623b6','3d37fb99-e168-40a0-81f2-28c563549e43'),
       ('f916afc4-813e-48e1-8ab8-d8ab6df8a54a', 'Princess Fiona','476e2d7a-a897-4b5b-b6e3-1609cba623b6','5655bbd6-24a9-4cff-99ad-d5820dca1662'),
       ('2e8aaf57-a8d8-42ef-bab1-e04c0b99d595', 'Lord Farquaad','476e2d7a-a897-4b5b-b6e3-1609cba623b6','e2612b30-44f8-451c-8296-d37fa09fe59d'),
       ('5073ecd8-03f0-4eb7-93a2-a43fde010c91', 'Monsieur Hood','476e2d7a-a897-4b5b-b6e3-1609cba623b6','c0f8747c-0aa7-4c44-aa7e-fa052c28d05a'),
       ('a8f5b96b-3294-4840-8b37-d8613b0bab13', 'Shrek','be1dc365-ced3-4cb6-9efc-f673c8dde65c','2c591160-d9c7-477f-b536-81be483ff0c1'),
       ('14d13fa8-61cf-4d3a-afe5-74e51b4cb0a3', 'Donkey','be1dc365-ced3-4cb6-9efc-f673c8dde65c','3d37fb99-e168-40a0-81f2-28c563549e43'),
       ('cde64da0-ad3f-49ab-908e-f55b8b2a676b', 'Princess Fiona','be1dc365-ced3-4cb6-9efc-f673c8dde65c','5655bbd6-24a9-4cff-99ad-d5820dca1662'),
       ('c3e7fb38-0080-4220-9f6f-9b960f12ca90', 'Puss In Boots','be1dc365-ced3-4cb6-9efc-f673c8dde65c','6b654f43-e0f7-45f2-95e1-4b9ffcb1cc77'),
       ('e536d775-cf83-4f47-abf8-9364371b5a96', 'King','be1dc365-ced3-4cb6-9efc-f673c8dde65c','c9a493d6-cc73-40ea-a72f-f332c38f6b1c');
