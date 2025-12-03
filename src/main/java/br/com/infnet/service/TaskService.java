package br.com.infnet.service;

import br.com.infnet.entity.Task;
import br.com.infnet.repository.ITaskRepository;

public class TaskService {

    private final ITaskRepository repository;

    public TaskService(ITaskRepository repository) {
        this.repository = repository;
    }

    public Task criarTask(Task task) {
        return repository.salvar_task(task);
    }
}
