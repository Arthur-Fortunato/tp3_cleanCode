package br.com.infnet.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RegistroAtividade {

    private final Long id;
    private final String descricao;
    private final LocalDateTime dataHora;
    private final TipoAtividade tipo;
    private final BigDecimal valorEstimado;

    public RegistroAtividade(Long id, String descricao, LocalDateTime dataHora, TipoAtividade tipo, BigDecimal valorEstimado) {

        if (id == null)
            throw new IllegalArgumentException("ID não pode ser nulo");

        if (descricao == null || descricao.isBlank())
            throw new IllegalArgumentException("Descrição não pode ser vazia");

        if (dataHora == null)
            throw new IllegalArgumentException("Data e hora não podem ser nulas");

        if (tipo == null)
            throw new IllegalArgumentException("Tipo não pode ser nulo");

        if (valorEstimado == null || valorEstimado.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("O valor estimado deve ser positivo");

        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.valorEstimado = valorEstimado;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public TipoAtividade getTipo() {
        return tipo;
    }

    public BigDecimal getValorEstimado() {
        return valorEstimado;
    }
}
