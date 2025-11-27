package br.com.infnet.entity;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String nome;
    private String descricao;
    private List<Sprint> sprints = new ArrayList<>();

    public Project(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarSprint(Sprint sprint) {
        sprints.add(sprint);
    }

    public void removerSprint(Sprint sprint) {
        sprints.remove(sprint);
    }

    public void listarSprints() {
        System.out.println("Sprints do Projeto: " + nome);
        sprints.forEach(s -> System.out.println("- " + s.toString()));
    }
}

