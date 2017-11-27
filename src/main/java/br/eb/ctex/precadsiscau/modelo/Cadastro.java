/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eb.ctex.precadsiscau.modelo;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ralfh
 */

@Entity
public class Cadastro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String nomeGuerra;
    private String email;
    private String postoGraduacao;
    private String identidade;
    private String cpf;
    private Short perfilInternet;
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    private Boolean processado;
    
    public Cadastro() {
        dataCadastro = Date.from(Instant.now());
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the nomeGuerra
     */
    public String getNomeGuerra() {
        return nomeGuerra;
    }

    /**
     * @param nomeGuerra the nomeGuerra to set
     */
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the postoGraduacao
     */
    public String getPostoGraduacao() {
        return postoGraduacao;
    }

    /**
     * @param postoGraduacao the postoGraduacao to set
     */
    public void setPostoGraduacao(String postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }

    /**
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the perfilInternet
     */
    public Short getPerfilInternet() {
        return perfilInternet;
    }

    /**
     * @param perfilInternet the perfilInternet to set
     */
    public void setPerfilInternet(Short perfilInternet) {
        this.perfilInternet = perfilInternet;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the processado
     */
    public Boolean getProcessado() {
        return processado;
    }

    /**
     * @param processado the processado to set
     */
    public void setProcessado(Boolean processado) {
        this.processado = processado;
    }
    
    
    
}
