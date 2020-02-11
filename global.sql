/* CREACION DE BASE DE DATOS*/
SET sql_mode='PIPES_AS_CONCAT';
DROP DATABASE IF EXISTS `Global`;
CREATE DATABASE `Global`;
USE `Global`;

/* TABLA ALUMNOS*/
create table TBL_Alumnos(
	Legajo_Alumno1 					int 			not null,
    Legajo_Alumno2 					int 			not null,
    Legajo_Alumno 					varchar(50) 	not null,
    Nombre_Alumno	 				varchar(50) 	not null,
    Apellido_Alumno 				varchar(50) 	not null,
    Domicilio_Alumno				varchar(50)		not null,
    Numero_Domicilio_Alumno			int				not null,
	Piso_Alumno						int				null,
    Departamento_Alumno				varchar(50)		null,
    Calle_Alumno_Uno				varchar(100)	not null,
    Calle_Alumno_dos				varchar(100)	not null,
    Localidad_Alumno				varchar(50)		not null,
    CP_Alumno						int				not null,
    Telefono_Alumno					varchar(50)		null,
    Tipo_Documento_Alumno			varchar(50)		not null,
    Num_Documento_Alumno			varchar(50)		not null,
    Fecha_Nacimiento_Alumno			varchar(50)		not null,
    Edad_Alumno						int				not null,
	Nacionalidad_Alumno				varchar(70)		not null,
    Meses_Alumno					int				not null,
    Enfermedad_Alumno				bit				null,
    Descripcion_Enfermedad_Alumno	varchar(150) 	null,
    Medicina_Alumno					bit				null,
    Descripcion_Medicina_Alumno		varchar(150) 	null,
    Telefono_Emergencia_Alumno		varchar(50)		null,
    Persona_Emergencia_Alumno		varchar(70)		null,
	Fecha_Inicio_Alumno				varchar(50)		not null,
	Fecha_Final_Alumno				varchar(50)		not null,
    Tipo_Estado						varchar(50)		not null,
    primary key(Legajo_Alumno),
    unique (Num_Documento_Alumno)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_EstadosCurso(
	tipoEstado			INT				AUTO_INCREMENT,
    Descripcion			VARCHAR(40)		NOT NULL,
    PRIMARY KEY (tipoEstado)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8; /* MOTOR DE MYSQL = INNODB // INCREMENTO DE A 1 // ACEPTAR CARACTERES COMO ñ O á*/ 
INSERT INTO TBL_EstadosCurso (Descripcion) VALUES ('ACTIVO'), ('INACTIVO'); /* INSERTAR LOS VALORES DE BAJA Y ALTA POR DEFECTO*/ 

create table TBL_Cursos(
	Cod_Curso				int				not null,
    Nombre_Curso	 		varchar(60) 	not null,
    Computadoras			bit				not null,
    Cantidad_PC				int				null,
    Modulo_uno				varchar(50)		not null,
    Modulo_dos				varchar(50)		null,
    Modulo_tres				varchar(50)		null,
    Modulo_cuatro			varchar(50)		null,
    Modulo_cinco			varchar(50)		null,
    Modulo_seis				varchar(50)		null,
    Modulo_siete			varchar(50)		null,
    Modulo_ocho				varchar(50)		null,
    Modulo_nueve			varchar(50)		null,
    Modulo_diez				varchar(50)		null,
    Tipo_Estado				varchar(50)		not null,
    primary key(Cod_Curso)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_AlumnosxCurso(
	Cod_Curso				int				not null,
    Legajo_Alumno 			varchar(50) 	not null,
    constraint PK_AXC primary key (Cod_Curso,Legajo_Alumno),
    constraint FK_Alumno foreign key (Legajo_Alumno) references TBL_Alumnos(Legajo_Alumno),
    constraint FK_Curso foreign key (Cod_Curso) references TBL_Cursos(Cod_Curso)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Profesores(
	Codigo_Profesor					int 			not null,
    Nombre_Profesor	 				varchar(50) 	not null,
    Apellido_Profesor 				varchar(50) 	not null,
    Domicilio_Profesor				varchar(50)		not null,
    Numero_Domicilio_Profesor		int				not null,
	Piso_Profesor					int				null,
    Departamento_Profesor			int				null,
    Calle_Profesor_uno				varchar(100)	not null,
    Calle_Profesor_dos				varchar(100)	not null,
    Localidad_Profesor				varchar(50)		not null,
    CP_Profesor						int				not null,
    Telefono_Profesor				varchar(50)		null,
    Tipo_Documento_Profesor			varchar(50)		not null,
    Num_Documento_Profesor			varchar(50)		not null,
    Fecha_Nacimiento_Profesor		varchar(50)		not null,
	Nacionalidad_Profesor			varchar(50)		not null,
    Num_CUIT_Profesor				varchar(50)		null,
    Fecha_Inicio_Profesor			varchar(50)		not null,
    Tipo_Estado						varchar(50)		not null,
    primary key(Codigo_Profesor),
    unique (Num_Documento_Profesor)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Tutores(
	Cod_Tutor					int				AUTO_INCREMENT,
    Legajo_Alumno 				varchar(50) 	not null,
	Nombre_Tutor	 			varchar(50) 	not null,
    Apellido_Tutor 				varchar(50) 	not null,
    Domicilio_Tutor				varchar(50)		not null,
    Numero_Domicilio_Tutor		varchar(50)		not null,
    Piso_Tutor					int				null,
    Departamento_Tutor			int				null,
	Localidad_Tutor				varchar(50)		not null,
    CP_Tutor					int				not null,
    Telefono_Tutor				varchar(50)		null,
    Tipo_Documento_Tutor		varchar(50)		not null,
    Num_Documento_Tutor			varchar(50)		not null,
    Fecha_Nacimiento_Tutor		varchar(50)		not null,
    Tipo_Estado					varchar(50)		not null,
    constraint PK_CodLeg primary key(Cod_Tutor,Legajo_Alumno),
	constraint FK_AlumnoTutor foreign key (Legajo_Alumno) references TBL_Alumnos(Legajo_Alumno)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Horarios(
	Cod_Horario				int				AUTO_INCREMENT,
    Cod_Curso	 			int 			not null,
    Horario_uno				varchar(50)		not null,
    Horario_dos				varchar(50)		null,
    Horario_tres			varchar(50)		null,
    Horario_cuatro			varchar(50)		null,
    Horario_cinco			varchar(50)		null,
    Horario_seis			varchar(50)		null,
    Horario_siete			varchar(50)		null,
    Horario_ocho			varchar(50)		null,
    Horario_nueve			varchar(50)		null,
    Horario_diez			varchar(50)		null,
	Dia_uno					varchar(50)		not null,
    Dia_dos					varchar(50)		null,
    Dia_tres				varchar(50)		null,
    Dia_cuatro				varchar(50)		null,
    Dia_cinco				varchar(50)		null,
    Dia_seis				varchar(50)		null,
    Dia_siete				varchar(50)		null,
    Dia_ocho				varchar(50)		null,
    Dia_nueve				varchar(50)		null,
    Dia_diez				varchar(50)		null,
    Descripcion_uno			varchar(50)		not null,
    Descripcion_dos			varchar(50)		null,
    Descripcion_tres		varchar(50)		null,
    Descripcion_cuatro		varchar(50)		null,
    Descripcion_cinco		varchar(50)		null,
    Descripcion_seis		varchar(50)		null,
    Descripcion_siete		varchar(50)		null,
    Descripcion_ocho		varchar(50)		null,
    Descripcion_nueve		varchar(50)		null,
    Descripcion_diez		varchar(50)		null,
    primary key(Cod_Horario),
    unique (Cod_Curso),
    constraint FK_CodigoCursoHorario foreign key (Cod_Curso) references TBL_Cursos(Cod_Curso)
)Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Diplomas(
	Cod_Diploma				int				AUTO_INCREMENT,
	Legajo_Alumno 			varchar(50) 	not null,
    Cod_Curso	 			int 			not null,
    Nota_uno				Double			null,
    Nota_dos				Double			null,
    Nota_tres				Double			null,
    Nota_cuatro				Double			null,
    Nota_cinco				Double			null,
    Nota_seis				Double			null,
    Nota_siete				Double			null,
	Nota_ocho				Double			null,
	Nota_nueve				Double			null,
	Nota_diez				Double			null,
    Modulo_uno				varchar(50)		not null,
    Modulo_dos				varchar(50)		null,
    Modulo_tres				varchar(50)		null,
    Modulo_cuatro			varchar(50)		null,
    Modulo_cinco			varchar(50)		null,
    Modulo_seis				varchar(50)		null,
    Modulo_siete			varchar(50)		null,
    Modulo_ocho				varchar(50)		null,
    Modulo_nueve			varchar(50)		null,
    Modulo_diez				varchar(50)		null,
    Promedio				varchar(50)		not null,
    primary key(Cod_Diploma),
    unique(Legajo_Alumno),
    constraint FK_CodigoCursoDiploma foreign key (Cod_Curso) references TBL_Cursos(Cod_Curso)
)Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Directivos(
	Cod_Directivo					INT				AUTO_INCREMENT,
	Nombre_Directivo	 			varchar(50) 	not null,
    Apellido_Directivo 				varchar(50) 	not null,
    Domicilio_Directivo				varchar(50)		not null,
    Numero_Domicilio_Directivo		varchar(50)		not null,
    Piso_Directivo					int				null,
    Departamento_Directivo			int				null,
	Localidad_Directivo				varchar(50)		not null,
    CP_Directivo					int				not null,
    Telefono_Directivo				varchar(50)		null,
    Tipo_Documento_Directivo		varchar(50)		not null,
    Num_Documento_Directivo			varchar(50)		not null,
    Nacimiento_Directivo			varchar(50)		not null,
    Nacionalidad					varchar(50)     not null,
    Tipo_Estado						varchar(50)		not null,
    primary key(Cod_Directivo),
    unique (Num_Documento_Directivo)
)Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

create table TBL_Usuarios(
	Login				VARCHAR(24)		NOT NULL,
    password			VARCHAR(24) 	NOT NULL,
    Cod_Directivo		INT				NULL,
    Tipo				VARCHAR(24)		NOT NULL,
    primary key(Login),
    CONSTRAINT FK_UsuarioDirectivo FOREIGN KEY (Cod_Directivo) REFERENCES TBL_Directivos (Cod_Directivo)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;