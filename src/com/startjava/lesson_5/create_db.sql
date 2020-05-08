-- create database
CREATE TABLE Jaeger (
	id			SERIAL PRIMARY KEY,
	modelName	TEXT,
	mark		TEXT,
	height 		DOUBLE PRECISION,
	weight 		DOUBLE PRECISION,
	status 		TEXT,
	origin 		TEXT,
	launch 		INTEGER,
	kajiuKill 	INTEGER
);