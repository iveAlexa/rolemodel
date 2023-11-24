-- Insert data into usuario table using usuario_sequence
insert into usuario (id, username, password, email, creat_at) values
    (nextval('usuario_sequence'), 'john_doe', 'password123', 'john.doe@email.com', current_timestamp),
    (nextval('usuario_sequence'), 'jane_smith', 'pass456', 'jane.smith@email.com', current_timestamp),
    (nextval('usuario_sequence'), 'bob_jackson', 'secret789', 'bob.jackson@email.com', current_timestamp);

-- Insert data into rol table using rol_sequence
insert into rol (id, name) values
 (nextval('rol_sequence'), 'Admin'),
 (nextval('rol_sequence'), 'User'),
 (nextval('rol_sequence'), 'Guest');

-- Insert data into usuario_rol table using usuario_rol_sequence
insert into usuario_rol (id, active, created_at, usuario_id, rol_id) values
  (nextval('usuario_rol_sequence'), true, current_timestamp, 1, 1),
  (nextval('usuario_rol_sequence'), true, current_timestamp, 2, 2),
  (nextval('usuario_rol_sequence'), true, current_timestamp, 3, 3);

-- Insert data into usuario_detalle table using usuario_detalle_sequence
insert into usuario_detalle (id, first_name, last_name, age, birth_day, usuario_id) values
    (nextval('usuario_detalle_sequence'), 'John', 'Doe', 30, '1993-05-15', 1),
    (nextval('usuario_detalle_sequence'), 'Jane', 'Smith', 25, '1998-12-10', 2),
    (nextval('usuario_detalle_sequence'), 'Bob', 'Jackson', 35, '1987-07-20', 3);

