package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Disciplina {
	private String nomeDisciplina;
	private int periodo;
	private String livroTexto;
	private Professor professor;
	private ArrayList<Academico> alunos = new ArrayList<>();
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getLivroTexto() {
		return livroTexto;
	}
	public void setLivroTexto(String livroTexto) {
		this.livroTexto = livroTexto;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public ArrayList<Academico> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Academico> alunos) {
		this.alunos = alunos;
	}
	
	public void quantidadeAcademicos() {
		
	}
	public void imprimeDiario() {
		
	}
	
}
