CREATE TABLE users (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE daily_tasks (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(40) NOT NULL,
    description TEXT,
    completed BOOL DEFAULT ('FALSE'),
    id_usuario INTEGER NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES users(id)
);

CREATE TABLE yearly (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(40) NOT NULL,
    description TEXT,
    completed BOOL DEFAULT ('FALSE'),
    id_usuario INTEGER NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES users(id)
);

CREATE TABLE quinquennially (
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(40) NOT NULL,
    description TEXT,
    completed BOOL DEFAULT ('FALSE'),
    id_usuario INTEGER NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES users(id)
);