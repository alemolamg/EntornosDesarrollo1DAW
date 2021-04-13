SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Imparten;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;
DROP TABLE IF EXISTS Profesores;




/* Create Tables */

CREATE TABLE Alumnos
(
	Num_Alumno int NOT NULL,
	Nombre varchar(50),
	Grupo varchar(1),
	PRIMARY KEY (Num_Alumno)
);


CREATE TABLE Asignaturas
(
	Num_Asi int NOT NULL,
	Nombre varchar(50),
	PRIMARY KEY (Num_Asi)
);


CREATE TABLE Cursan
(
	Num_Alumno int NOT NULL,
	Num_Asi int NOT NULL,
	Trimestre int(1)
);


CREATE TABLE Elaboran
(
	Cod_Practica int NOT NULL,
	Num_Prof int NOT NULL
);


CREATE TABLE Examenes
(
	Num_Exa int NOT NULL,
	Npreguntas int,
	Fecha date,
	PRIMARY KEY (Num_Exa)
);


CREATE TABLE Hacen
(
	Num_Alumno int NOT NULL,
	Num_Exa int NOT NULL,
	Nota int(2)
);


CREATE TABLE Imparten
(
	Num_Asi int NOT NULL,
	Num_Prof int NOT NULL
);


CREATE TABLE Practicas
(
	Titulo varchar(50),
	Cod_Practica int NOT NULL,
	Nivel varchar(50),
	PRIMARY KEY (Cod_Practica)
);


CREATE TABLE Profesores
(
	Num_Prof int NOT NULL,
	Nombre varchar(50),
	PRIMARY KEY (Num_Prof)
);


CREATE TABLE Realizan
(
	Num_Alumno int NOT NULL,
	Cod_Practica int NOT NULL,
	Nota int(2) NOT NULL,
	Fecha date
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Alumno)
	REFERENCES Alumnos (Num_Alumno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Alumno)
	REFERENCES Alumnos (Num_Alumno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_Alumno)
	REFERENCES Alumnos (Num_Alumno)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Asi)
	REFERENCES Asignaturas (Num_Asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Asi)
	REFERENCES Asignaturas (Num_Asi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Exa)
	REFERENCES Examenes (Num_Exa)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practicas (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practicas (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



