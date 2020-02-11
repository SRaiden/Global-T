package main;

import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import alumnos.*;
import profesores.*;
import tutores.*;
import cursos.*;
import horarios.*;
import directivos.*;
import diplomas.*;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

public class MenuLamina extends JPanel implements ActionListener{

	JPanel panelGuardado;
	
	JMenuItem AgregarAlumno, ModificarAlumno, CambiarEstadoAlumno, RehabilitarAlumno, UnAlumno, TodosLosAlumnos; // GLOBAL ALUMNO
	JMenuItem AgregarProfesor, ModificarProfesor, CambiarEstadoProfesor, UnProfesor, TodosLosProfesores;  // GLOBAL PROFESOR
	JMenuItem AgregarTutor, ModificarTutor, CambiarEstadoTutor, VerUnTutor, VerTutores;  // GLOBAL TUTORES
	JMenuItem AgregarCurso, ModificarCurso, CambiarEstadoCurso, UnCurso, TodosLosCursos; // GLOBAL CURSO
	JMenuItem AgregarHorario, ModificarHorario, VerHorarioUnCurso, VerHorariosTodosCursos; // GLOBAL HORARIO
	JMenuItem AgregarDirectivo, ModificarDirectivo, CambiarEstadoDirectivo, CrearUsuario, VerDirectivo, VerTodosDirectivos; // GLOBAL DIRECTIVO
	JMenuItem AgregarDiploma, ModificarDiploma, VerDiploma, VerTodosDiplomas; // GLOBAL DIPLOMAS
	JMenuItem AgregarCuota, ModificarCuota, EliminarCuota, RehabilitarCuota, VerCuota, VerTodasCuotas; // GLOBAL CUOTAS
	JMenuItem BackupAlumno, BackupProfesores, BackupCursos, BackupDirectivos, BackupTodo; // GLOBAL BACKUP
	
	public MenuLamina() {
		this.setLayout(new BorderLayout());
		JMenuBar menuBar = new JMenuBar();
		
		// ALUMNOS
		JMenu MenuAlumnos = new JMenu("Alumnos");
		MenuAlumnos.setIcon(new ImageIcon("foto/alumno.png"));
		AgregarAlumno = new JMenuItem("Agregar Alumno");
		AgregarAlumno.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarAlumno.addActionListener(this);
		ModificarAlumno = new JMenuItem("Modificar Alumno");
		ModificarAlumno.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarAlumno.addActionListener(this);
		CambiarEstadoAlumno = new JMenuItem("Cambiar Estado del Alumno");
		CambiarEstadoAlumno.setIcon(new ImageIcon("foto/eliminar.png"));
		CambiarEstadoAlumno.addActionListener(this);
		/*RehabilitarAlumno = new JMenuItem("Rehabiltar Alumno");
		RehabilitarAlumno.setIcon(new ImageIcon("foto/rehabilitar.png"));
		RehabilitarAlumno.addActionListener(this);*/
		JMenu Ver = new JMenu("Ver");
		Ver.setIcon(new ImageIcon("foto/ver.png"));
		UnAlumno = new JMenuItem("Un Alumno");
		UnAlumno.setIcon(new ImageIcon("foto/uno.png"));
		UnAlumno.addActionListener(this);
		TodosLosAlumnos = new JMenuItem("Todos los Alumnos");
		TodosLosAlumnos.setIcon(new ImageIcon("foto/todos.png"));
		TodosLosAlumnos.addActionListener(this);
		
		// PROFESORES
		JMenu Profesores = new JMenu("Profesores");
		Profesores.setIcon(new ImageIcon("foto/profesor.png"));
		AgregarProfesor = new JMenuItem("Agregar Profesor");
		AgregarProfesor.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarProfesor.addActionListener(this);
		ModificarProfesor = new JMenuItem("Modificar Profesor");
		ModificarProfesor.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarProfesor.addActionListener(this);
		CambiarEstadoProfesor = new JMenuItem("Cambiar Estado del Profesor");
		CambiarEstadoProfesor.setIcon(new ImageIcon("foto/eliminar.png"));
		CambiarEstadoProfesor.addActionListener(this);
		JMenu Ver_1 = new JMenu("Ver");
		Ver_1.setIcon(new ImageIcon("foto/ver.png"));
		UnProfesor = new JMenuItem("Un Profesor");
		UnProfesor.setIcon(new ImageIcon("foto/uno.png"));
		UnProfesor.addActionListener(this);
		TodosLosProfesores = new JMenuItem("Todos los Profesores");
		TodosLosProfesores.setIcon(new ImageIcon("foto/todos.png"));
		TodosLosProfesores.addActionListener(this);
		
		
		// TUTORES
		JMenu Tutores = new JMenu("Tutores");
		Tutores.setIcon(new ImageIcon("foto/tutor.png"));
		AgregarTutor = new JMenuItem("Agregar Tutor");
		AgregarTutor.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarTutor.addActionListener(this);
		ModificarTutor = new JMenuItem("Modificar Tutor");
		ModificarTutor.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarTutor.addActionListener(this);
		CambiarEstadoTutor = new JMenuItem("Cambiar Estado de un Tutor");
		CambiarEstadoTutor.setIcon(new ImageIcon("foto/eliminar.png"));
		CambiarEstadoTutor.addActionListener(this);
		JMenu Ver_2 = new JMenu("Tutores");
		Ver_2.setIcon(new ImageIcon("foto/tutor.png"));
		JMenu Ver_10 = new JMenu("Ver");
		Ver_10.setIcon(new ImageIcon("foto/ver.png"));
		VerUnTutor = new JMenuItem("Ver un Tutor");
		VerUnTutor.setIcon(new ImageIcon("foto/uno.png"));
		VerUnTutor.addActionListener(this);
		VerTutores = new JMenuItem("Tutor/es de un Alumno");
		VerTutores.setIcon(new ImageIcon("foto/todos.png"));
		VerTutores.addActionListener(this);
		
		
		// CURSOS
		JMenu Curso = new JMenu("Curso");
		Curso.setIcon(new ImageIcon("foto/aula.png"));
		AgregarCurso = new JMenuItem("Agregar Curso");
		AgregarCurso.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarCurso.addActionListener(this);
		ModificarCurso = new JMenuItem("Modificar Curso");
		ModificarCurso.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarCurso.addActionListener(this);
		CambiarEstadoCurso = new JMenuItem("Cambiar Estado Curso");
		CambiarEstadoCurso.setIcon(new ImageIcon("foto/eliminar.png"));
		CambiarEstadoCurso.addActionListener(this);
		JMenu Ver_3 = new JMenu("Ver");
		Ver_3.setIcon(new ImageIcon("foto/ver.png"));
		UnCurso = new JMenuItem("Un Curso");
		UnCurso.setIcon(new ImageIcon("foto/curso.png"));
		UnCurso.addActionListener(this);
		TodosLosCursos = new JMenuItem("Todos los Cursos");
		TodosLosCursos.setIcon(new ImageIcon("foto/cursos.png"));
		TodosLosCursos.addActionListener(this);
		JMenu Ver_4 = new JMenu("Establecer Horario");
		Ver_4.setIcon(new ImageIcon("foto/horario.png"));
		
		// HORARIOS
		AgregarHorario = new JMenuItem("Agregar Horario");
		AgregarHorario.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarHorario.addActionListener(this);
		ModificarHorario = new JMenuItem("Modificar Horario");
		ModificarHorario.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarHorario.addActionListener(this);
		JMenu Ver_5 = new JMenu("Ver");
		Ver_5.setIcon(new ImageIcon("foto/ver.png"));
		VerHorarioUnCurso = new JMenuItem("Ver los Horarios de un Curso");
		VerHorarioUnCurso.setIcon(new ImageIcon("foto/reloj.png"));
		VerHorarioUnCurso.addActionListener(this);
		VerHorariosTodosCursos = new JMenuItem("Todos los Horarios de Todos los Cursos");
		VerHorariosTodosCursos.setIcon(new ImageIcon("foto/relojes.png"));
		VerHorariosTodosCursos.addActionListener(this);
		
		// DIRECTIVOS
		JMenu Directivos = new JMenu("Directivos");
		Directivos.setIcon(new ImageIcon("foto/directivo.png"));
		AgregarDirectivo = new JMenuItem("Agregar Directivo");
		AgregarDirectivo.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarDirectivo.addActionListener(this);
		ModificarDirectivo = new JMenuItem("Modificar Directivo");
		ModificarDirectivo.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarDirectivo.addActionListener(this);
		CambiarEstadoDirectivo = new JMenuItem("Cambiar Estado del Directivo");
		CambiarEstadoDirectivo.setIcon(new ImageIcon("foto/eliminar.png"));
		CambiarEstadoDirectivo.addActionListener(this);
		CrearUsuario = new JMenuItem("Crear Usuario");
		CrearUsuario.setIcon(new ImageIcon("foto/usuario.png"));
		CrearUsuario.addActionListener(this);
		JMenu Ver_6 = new JMenu("Ver");
		Ver_6.setIcon(new ImageIcon("foto/ver.png"));
		VerDirectivo = new JMenuItem("Ver Directivo");
		VerDirectivo.setIcon(new ImageIcon("foto/uno.png"));
		VerDirectivo.addActionListener(this);
		VerTodosDirectivos = new JMenuItem("Todos los Directivo");
		VerTodosDirectivos.setIcon(new ImageIcon("foto/todos.png"));
		VerTodosDirectivos.addActionListener(this);
		
		// CUOTAS
		JMenu Cuota = new JMenu("Cuotas");
		Cuota.setIcon(new ImageIcon("foto/pago.png"));
		AgregarCuota = new JMenuItem("Agregar Pago");
		AgregarCuota.setIcon(new ImageIcon("foto/agregar.png"));
		AgregarCuota.addActionListener(this);
		ModificarCuota = new JMenuItem("Modificar Pago");
		ModificarCuota.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarCuota.addActionListener(this);
		EliminarCuota = new JMenuItem("Eliminar Pago");
		EliminarCuota.setIcon(new ImageIcon("foto/eliminar.png"));
		EliminarCuota.addActionListener(this);
		RehabilitarCuota = new JMenuItem("Rehabiltiar Pago");
		RehabilitarCuota.setIcon(new ImageIcon("foto/rehabilitar.png"));
		RehabilitarCuota.addActionListener(this);
		JMenu Ver_8 = new JMenu("Ver");
		Ver_8.setIcon(new ImageIcon("foto/ver.png"));
		VerCuota = new JMenuItem("Ver Pago de un Alumno");
		VerCuota.setIcon(new ImageIcon("foto/cuota.png"));
		VerCuota.addActionListener(this);
		VerTodasCuotas = new JMenuItem("Todos los Pagos de los Alumnos");
		VerTodasCuotas.setIcon(new ImageIcon("foto/cuotas.png"));
		VerTodasCuotas.addActionListener(this);
		
		
		// DIPLOMAS
		JMenu Diplomas = new JMenu("Diplomas");
		Diplomas.setIcon(new ImageIcon("foto/diploma.png"));
		AgregarDiploma = new JMenuItem("Agregar Egresado");
		AgregarDiploma.setIcon(new ImageIcon("foto/egresado.png"));
		AgregarDiploma.addActionListener(this);
		ModificarDiploma = new JMenuItem("Modificar Egresado");
		ModificarDiploma.setIcon(new ImageIcon("foto/modificar.png"));
		ModificarDiploma.addActionListener(this);
		JMenu Ver_7 = new JMenu("Ver");
		Ver_7.setIcon(new ImageIcon("foto/ver.png"));
		VerDiploma = new JMenuItem("Ver Diplomas de un Egresado");
		VerDiploma.setIcon(new ImageIcon("foto/egresado.png"));
		VerDiploma.addActionListener(this);
		VerTodosDiplomas = new JMenuItem("Ver Diplomas de Egresados de un Curso");
		VerTodosDiplomas.setIcon(new ImageIcon("foto/egresados.png"));
		VerTodosDiplomas.addActionListener(this);
		
		
		// BACKUP
		JMenu Backup = new JMenu("Backup");
		Backup.setIcon(new ImageIcon("foto/Backup.png"));
		BackupAlumno = new JMenuItem("Crear Backup Alumnos");
		BackupAlumno.setIcon(new ImageIcon("foto/backupalumno.png"));
		BackupAlumno.addActionListener(this);
		BackupProfesores = new JMenuItem("Crear Backup Profesores");
		BackupProfesores.setIcon(new ImageIcon("foto/backupprofesor.png"));
		BackupProfesores.addActionListener(this);
		BackupDirectivos = new JMenuItem("Crear Backup Directivos");
		BackupDirectivos.setIcon(new ImageIcon("foto/backupdirectivo.png"));
		BackupDirectivos.addActionListener(this);
		BackupCursos = new JMenuItem("Crear Backup Cursos");
		BackupCursos.setIcon(new ImageIcon("foto/backupcurso.png"));
		BackupCursos.addActionListener(this);
		BackupTodo = new JMenuItem("Crear Backup de Todo");
		BackupTodo.setIcon(new ImageIcon("foto/backuptodo.png"));
		BackupTodo.addActionListener(this);
		
		// CERRAR SESION
		JMenu CerrarSesion = new JMenu("Cerrar Sesion");
		CerrarSesion.setIcon(new ImageIcon("foto/cerrar.png"));
		
		add(menuBar);
	
		// AGREGAR AL MENU ALUMNOS
		menuBar.add(MenuAlumnos);
		MenuAlumnos.add(AgregarAlumno);
		MenuAlumnos.add(ModificarAlumno);
		MenuAlumnos.add(CambiarEstadoAlumno);
		//MenuAlumnos.addSeparator();
		//MenuAlumnos.add(RehabilitarAlumno);
		MenuAlumnos.addSeparator();
		MenuAlumnos.add(Ver);
		Ver.add(UnAlumno);
		Ver.add(TodosLosAlumnos);

		
		// AGREGAR AL MENU TUTORES
		MenuAlumnos.add(Ver_2);
		Ver_2.add(AgregarTutor);
		Ver_2.add(ModificarTutor);
		Ver_2.add(CambiarEstadoTutor);
		Ver_2.addSeparator();
		Ver_2.add(Ver_10);
		Ver_10.add(VerUnTutor);
		Ver_10.add(VerTutores);
		
		
		// AGREGAR AL MENU PROFESORES
		menuBar.add(Profesores);
		Profesores.add(AgregarProfesor);
		Profesores.add(ModificarProfesor);
		Profesores.add(CambiarEstadoProfesor);
		Profesores.addSeparator();
		Profesores.add(Ver_1);
		Ver_1.add(UnProfesor);
		Ver_1.add(TodosLosProfesores);
		
		
		// AGREGAR AL MENU CURSO
		menuBar.add(Curso);
		Curso.add(AgregarCurso);
		Curso.add(ModificarCurso);
		Curso.add(CambiarEstadoCurso);
		Curso.addSeparator();
		Curso.add(Ver_3);
		Ver_3.add(UnCurso);
		Ver_3.add(TodosLosCursos);
		
		// AGREGAR AL MENU HORARIO
		Curso.addSeparator();
		Curso.add(Ver_4);
		Ver_4.add(AgregarHorario);
		Ver_4.add(ModificarHorario);
		Ver_4.addSeparator();
		Ver_4.add(Ver_5);
		Ver_5.add(VerHorarioUnCurso);
		Ver_5.add(VerHorariosTodosCursos);
		
		// AGREGAR AL MENU DIRECTIVOS
		menuBar.add(Directivos);
		Directivos.add(AgregarDirectivo);
		Directivos.add(ModificarDirectivo);
		Directivos.add(CambiarEstadoDirectivo);
		Directivos.addSeparator();
		Directivos.add(CrearUsuario);
		Directivos.addSeparator();
		Directivos.add(Ver_6);
		Ver_6.add(VerDirectivo);
		Ver_6.add(VerTodosDirectivos);
		
		// AGREGAR AL MENU CUOTAS
		menuBar.add(Cuota);
		Cuota.add(AgregarCuota);
		Cuota.add(ModificarCuota);
		Cuota.add(EliminarCuota);
		Cuota.addSeparator();
		Cuota.add(RehabilitarCuota);
		Cuota.addSeparator();
		Cuota.add(Ver_8);
		Ver_8.add(VerCuota);
		Ver_8.add(VerTodasCuotas);
		
		// AGREGAR AL MENU DIPLOMAS
		menuBar.add(Diplomas);
		Diplomas.add(AgregarDiploma);
		Diplomas.add(ModificarDiploma);
		Diplomas.addSeparator();
		Diplomas.add(Ver_7);
		Ver_7.add(VerDiploma);
		Ver_7.add(VerTodosDiplomas);
		
		// AGREGAR AL MENU BACKUP
		menuBar.add(Backup);
		Backup.add(BackupAlumno);
		Backup.add(BackupProfesores);
		Backup.add(BackupCursos);
		Backup.add(BackupDirectivos);
		Backup.addSeparator();
		Backup.add(BackupTodo);
		
		// AGREGAR AL MENU CERRAR SESION
		menuBar.add(CerrarSesion);
		
		this.add(menuBar, BorderLayout.NORTH);
		
		panelGuardado = new JPanel();
		this.add(panelGuardado, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonpulsado= e.getSource();
		
		// ALUMNOS
		if(botonpulsado==AgregarAlumno){
			panelGuardado.removeAll();
			AgregarAlumno agregar = new AgregarAlumno();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarAlumno){
			panelGuardado.removeAll();
			ModificarAlumnos modif = new ModificarAlumnos();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CambiarEstadoAlumno){
			panelGuardado.removeAll();
			CambiarEstadoAlumno eli = new CambiarEstadoAlumno();
			panelGuardado.add(eli);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==UnAlumno){
			panelGuardado.removeAll();
			UnAlumno unalum = new UnAlumno();
			panelGuardado.add(unalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==TodosLosAlumnos){
			panelGuardado.removeAll();
			TodosLosAlumnos todalum = new TodosLosAlumnos();
			panelGuardado.add(todalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		

		// TUTORES
		if(botonpulsado==AgregarTutor){
			panelGuardado.removeAll();
			AgregarTutor agregar = new AgregarTutor();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarTutor){
			panelGuardado.removeAll();
			ModificarTutor modif = new ModificarTutor();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CambiarEstadoTutor){
			panelGuardado.removeAll();
			CambiarEstadoTutor eli = new CambiarEstadoTutor();
			panelGuardado.add(eli);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerUnTutor){
			panelGuardado.removeAll();
			VerUnTutor unalum = new VerUnTutor();
			panelGuardado.add(unalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerTutores){
			panelGuardado.removeAll();
			VerTutores todalum = new VerTutores();
			panelGuardado.add(todalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		
		
		// PROFESORES
		if(botonpulsado==AgregarProfesor){
			panelGuardado.removeAll();
			AgregarProfesor agregar = new AgregarProfesor();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarProfesor){
			panelGuardado.removeAll();
			ModificarProfesor modif = new ModificarProfesor();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CambiarEstadoProfesor){
			panelGuardado.removeAll();
			CambiarEstadoProfesor eli = new CambiarEstadoProfesor();
			panelGuardado.add(eli);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==UnProfesor){
			panelGuardado.removeAll();
			UnProfesor unalum = new UnProfesor();
			panelGuardado.add(unalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==TodosLosProfesores){
			panelGuardado.removeAll();
			TodosLosProfesores todalum = new TodosLosProfesores();
			panelGuardado.add(todalum);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		
		
		//CURSOS
		if(botonpulsado==AgregarCurso){
			panelGuardado.removeAll();
			AgregarCurso agregar = new AgregarCurso();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarCurso){
			panelGuardado.removeAll();
			ModificarCurso modif = new ModificarCurso();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CambiarEstadoCurso){
			panelGuardado.removeAll();
			CambiarEstadoCurso reha = new CambiarEstadoCurso();
			panelGuardado.add(reha);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==UnCurso){
			panelGuardado.removeAll();
			UnCurso uncur = new UnCurso();
			panelGuardado.add(uncur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==TodosLosCursos){
			panelGuardado.removeAll();
			TodosLosCursos todcur = new TodosLosCursos();
			panelGuardado.add(todcur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		
		
		//HORARIOS
		if(botonpulsado==AgregarHorario){
			panelGuardado.removeAll();
			AgregarHorario agregar = new AgregarHorario();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarHorario){
			panelGuardado.removeAll();
			ModificarHorario modif = new ModificarHorario();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerHorarioUnCurso){
			panelGuardado.removeAll();
			VerHorarioUnCurso uncur = new VerHorarioUnCurso();
			panelGuardado.add(uncur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerHorariosTodosCursos){
			panelGuardado.removeAll();
			VerHorariosTodosCursos todcur = new VerHorariosTodosCursos();
			panelGuardado.add(todcur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		
		
		//DIRECTIVOS
		if(botonpulsado==AgregarDirectivo){
			panelGuardado.removeAll();
			AgregarDirectivo agregar = new AgregarDirectivo();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarDirectivo){
			panelGuardado.removeAll();
			ModificarDirectivo modif = new ModificarDirectivo();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CambiarEstadoDirectivo){
			panelGuardado.removeAll();
			CambiarEstadoDirectivo reha = new CambiarEstadoDirectivo();
			panelGuardado.add(reha);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==CrearUsuario){
			panelGuardado.removeAll();
			CrearUsuario uncur = new CrearUsuario();
			panelGuardado.add(uncur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerDirectivo){
			panelGuardado.removeAll();
			VerDirectivo todcur = new VerDirectivo();
			panelGuardado.add(todcur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerTodosDirectivos){
			panelGuardado.removeAll();
			VerTodosDirectivos todcur = new VerTodosDirectivos();
			panelGuardado.add(todcur);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		
		
		//DIPLOMAS
		if(botonpulsado==AgregarDiploma){
			panelGuardado.removeAll();
			AgregarDiploma agregar = new AgregarDiploma();
			panelGuardado.add(agregar);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==ModificarDiploma){
			panelGuardado.removeAll();
			ModificarDiploma modif = new ModificarDiploma();
			panelGuardado.add(modif);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerDiploma){
			panelGuardado.removeAll();
			VerDiploma ver = new VerDiploma();
			panelGuardado.add(ver);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
		if(botonpulsado==VerTodosDiplomas){
			panelGuardado.removeAll();
			VerTodosDiplomas todo = new VerTodosDiplomas();
			panelGuardado.add(todo);
			panelGuardado.repaint();
			panelGuardado.revalidate();
		}
	}

}
