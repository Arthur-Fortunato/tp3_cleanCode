package br.com.infnet.entity;

import br.com.infnet.TaskStatus;

public final class Task {

    private final String titulo;
    private final String descricao;
    private final TaskStatus status;
    private final User responsavel;

    public Task(String titulo, String descricao, TaskStatus status, User responsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public User getResponsavel() {
        return responsavel;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Status: " + status);
        System.out.println("Responsavel pela tarefa: " + responsavel);
    }

    public Task alterarStatus(TaskStatus novoStatus) {
        return new Task(this.titulo, this.descricao, novoStatus, this.responsavel);
    }

    public Task atribuirResponsavel(User novoResponsavel) {
        return new Task(this.titulo, this.descricao, this.status, novoResponsavel);
    }
}

