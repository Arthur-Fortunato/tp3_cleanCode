package br.com.infnet.entity;

public final class SubTask {

    private final Long id;
    private final String descricao;
    private final double horasEstimadas;

    public SubTask(Long id, String descricao, double horasEstimadas) {
        if (id == null)
            throw new IllegalArgumentException("ID não pode ser nulo");

        if (descricao == null || descricao.isBlank())
            throw new IllegalArgumentException("Descrição não pode ser vazia");

        if (horasEstimadas < 0)
            throw new IllegalArgumentException("Horas estimadas não podem ser negativas");

        this.id = id;
        this.descricao = descricao;
        this.horasEstimadas = horasEstimadas;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public SubTask atualizarHorasEstimadas(double novasHoras) {
        return new SubTask(this.id, this.descricao, novasHoras);
    }
}
