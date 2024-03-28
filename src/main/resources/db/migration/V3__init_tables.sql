create table if not exists alabar_backend.movie (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(32) not null,
    image varchar,
    description varchar(5012) not null,
    release_date DATE not null ,
    age_restriction varchar(24) not null ,
    format_movie varchar(64) not null
);

create table if not exists alabar_backend.genre (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(32) not null
);

create table if not exists alabar_backend.user (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    name varchar(32) not null,
    login_image varchar
);

create table if not exists alabar_backend.rating (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    value int check ( value between 1 and 10 ) not null,
    user_id BIGINT references alabar_backend.user (id) on delete cascade not null,
    movie_id BIGINT references alabar_backend.movie (id) on delete cascade not null
);

/*МЕСТО ДЛЯ COMMENT*/
/*МЕСТО ДЛЯ PLAYER*/