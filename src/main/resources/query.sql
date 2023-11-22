-- create usuario table
create table usuario(
                        id integer not null,
                        username varchar(150) not null ,
                        password varchar(150) not null ,
                        email varchar(150) not null ,
                        creat_at timestamp,
                        primary key (id)
);
-- create a sequence for usuario id
create sequence usuario_sequence as integer increment 1;

-- create rol table
create table rol(
                    id integer not null ,
                    name varchar(100) not null,
                    primary key (id)
);

-- create a sequence for rol id
create sequence rol_sequence as integer increment 1;

--create a usuario_rol
create  table usuario_rol(
                             id integer not null,
                             active boolean not null ,
                             created_at timestamp not null ,
                             usuario_id integer,
                             rol_id integer,
                             primary key (id)
);

alter table usuario_rol add constraint FK_usuario_rol_RefUsuario foreign key (usuario_id)
    references usuario (id) on delete restrict on update restrict ;

alter table usuario_rol add constraint FK_usuario_rol_RefRol foreign key (rol_id)
    references rol (id) on delete restrict on update restrict ;

create sequence usuario_rol_sequence as integer increment 1;

--create the table usuario_detalle

create table usuario_detalle(
                                id integer not null,
                                first_name varchar(100) not null ,
                                last_name varchar(100) not null ,
                                age integer,
                                birth_day date,
                                usuario_id integer,
                                primary key (id)
);

alter table usuario_detalle add constraint FK_usuario_detalle_RefUsuario foreign key (usuario_id)
    references usuario (id) on delete restrict on update restrict ;

create sequence usuario_detalle_sequence as integer increment 1;