\с robots

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers(
    id  SERIAL PRIMARY KEY,
    model_name VARCHAR(30) NOT NULL,
    mark       VARCHAR(15) NOT NULL,
    height     NUMERIC(4, 2) NOT NULL,
    weight     NUMERIC(4, 2) NOT NULL,
    status     VARCHAR(15) NOT NULL,
    origin     VARCHAR(15) NOT NULL,
    launch     DATE NOT NULL,
    kaiju_kill INTEGER NOT NULL DEFAULT 0);

\ir populate.sql

\ir queries.sql
