

TRUNCATE TABLE authorities RESTART IDENTITY;
TRUNCATE TABLE users RESTART IDENTITY;

INSERT INTO users
(username,password,enabled)
VALUES('Gaba','12345',gaba@yandex.ru,true),
('Anna','123456',anna@yandex.ru,true);

INSERT INTO authorities
(username,authority)
VALUES('Gaba','ADMIN'),
('Anna','USER');