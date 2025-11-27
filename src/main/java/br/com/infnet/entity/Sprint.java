package br.com.infnet.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {

    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Task> tarefas = new ArrayList<>();

    public Sprint(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Task tarefa) {
        tarefas.remove(tarefa);
    }

    public void listarTarefas() {
        System.out.println("Tarefas da Sprint: " + nome);
        tarefas.forEach(Task::exibirDetalhes);
    }

    @Override
    public String toString() {
        return nome + " (" + dataInicio + " até " + dataFim + ")";
    }
}
