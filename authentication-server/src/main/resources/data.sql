

TRUNCATE TABLE users RESTART IDENTITY CASCADE ;


INSERT INTO users
(username,password,email,authority,enabled)
VALUES('Gaba','12345','gaba@yandex.ru','ADMIN',true),
('Anna','123456','anna@yandex.ru','USER',true);

