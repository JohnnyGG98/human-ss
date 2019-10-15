package com.shopshopista.humanss.model.persona;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Where;

@Where(clause = "user_activo = true")
@Entity(
        name = "Usuario"
)
@Table(
        name = "\"Usuarios\"",
        schema = "public"
)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "user_nick", length = 50, nullable = false, columnDefinition = "character varying(50) UNIQUE")
    private String user_nick;

    @Column(name = "user_pass", nullable = false)
    private String user_pass;

    @Column(name = "user_tipo", nullable = false, columnDefinition = "character varying(1) DEFAULT 'C'")
    private char user_tipo;

    @Column(name = "user_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean user_activo = true;

    public Usuario() {
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUser_nick() {
        return user_nick;
    }

    public void setUser_nick(String user_nick) {
        this.user_nick = user_nick;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public char getUser_tipo() {
        return user_tipo;
    }

    public void setUser_tipo(char user_tipo) {
        this.user_tipo = user_tipo;
    }

    public Boolean getUser_activo() {
        return user_activo;
    }

    public void setUser_activo(Boolean user_activo) {
        this.user_activo = user_activo;
    }

}
