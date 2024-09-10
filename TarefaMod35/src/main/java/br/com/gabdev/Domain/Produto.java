package br.com.gabdev.Domain;

import br.com.gabdev.anotacao.ColunaTabela;
import br.com.gabdev.anotacao.Tabela;
import br.com.gabdev.anotacao.TipoChave;
import br.com.gabdev.dao.IPersistente;

import java.math.BigDecimal;

/**
 * @author gabdev
 */
@Tabela("TB_PRODUTO")
public class Produto implements IPersistente {

    @ColunaTabela(dbName = "id", setJavaName = "setId")
    private Long id;

    @TipoChave("getCodigo")
    @ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
    private String codigo;

    @ColunaTabela(dbName = "nome", setJavaName = "setNome")
    private String nome;

    @ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
    private String descricao;

    @ColunaTabela(dbName = "fornecedores", setJavaName = "setFornecedores")
    private String fornecedores;

    @ColunaTabela(dbName = "valor", setJavaName = "setValor")
    private BigDecimal valor;

    public String getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(String fornecedores) {
        this.fornecedores = fornecedores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
