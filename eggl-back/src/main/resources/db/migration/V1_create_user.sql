create table User {
           id uuid not null,
            email varchar(250),
            password varchar(250),
            id_usuario uuid,
            Constraint user_pk Primary Key(id),
            Constraint user_fk Foreign Key
    }