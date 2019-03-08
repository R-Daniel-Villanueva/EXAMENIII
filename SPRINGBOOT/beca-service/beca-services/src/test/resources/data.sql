INSERT INTO login (id,ds_user,ds_pass)
VALUES
(1,'NOMBRE 1','APELLIDO 2'),
(2,'NOMBRE 2','APELLIDO 2'),
(3,'NOMBRE 3','APELLIDO 2'),
(4,'NOMBRE 4','APELLIDO 2'),
(5,'NOMBRE 5','APELLIDO 2'),
(6,'NOMBRE 6','APELLIDO 2'),
(7,'NOMBRE 7','APELLIDO 2'),
(8,'NOMBRE 8','APELLIDO 2');

commit;

select count(*) from login;
alter sequence login_id_seq restart with 10;


