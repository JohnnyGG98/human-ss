package com.shopshopista.humanss.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.tomcat.util.codec.binary.Base64;
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
    private byte[] user_pass;

    @Column(name = "user_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean user_activo = true;

    public Usuario() {

    }

    

    public Usuario(Long id_usuario, String user_nick, byte[] user_pass, Boolean user_activo) {
		super();
		this.id_usuario = id_usuario;
		this.user_nick = user_nick;
		this.user_pass = user_pass;
		this.user_activo = user_activo;
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

    public byte[] getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = Base64.encodeBase64(user_pass.getBytes());
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Boolean getUser_activo() {
        return user_activo;
    }

    public void setUser_activo(Boolean user_activo) {
        this.user_activo = user_activo;
    }

    public void setUser_pass(byte[] user_pass) {
        this.user_pass = user_pass;
    }



	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", user_nick=" + user_nick + ", user_pass="
				+ Arrays.toString(user_pass) + ", user_activo=" + user_activo + "]";
	}

  

}
