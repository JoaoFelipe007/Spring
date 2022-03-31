/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 *
 * @author Gestão Tech
 */
@Entity//Serve para mapear como uma tabela do banco do Dados
@Table(name = "TB_PRODUTO")// Serve para dar nome a tabela ,
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // Quando criamos o Id junto com o GenerateValue
    @GeneratedValue(strategy = GenerationType.AUTO)// Falamos que queremos  que crie automaticamente nossos Id's
    private long id;

    private String nome;

    private BigDecimal valor;

    private BigDecimal quantidades;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(BigDecimal quantidades) {
        this.quantidades = quantidades;
    }
    
}
