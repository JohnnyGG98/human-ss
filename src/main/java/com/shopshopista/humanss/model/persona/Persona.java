package com.shopshopista.humanss.model.persona;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

@Entity(name = "Personas")
@Table(
        name = "\"Personas\"",
        schema = "human"
)
@Inheritance(strategy = InheritanceType.JOINED)
@Where(clause = "per_activo = true")
@FilterDef(name = "buscarPorUsuario", parameters = @ParamDef(name="id", type = "long"))
@Filters(@Filter(name = "buscarPorUsuario" , condition = ":id=id_usuario"))
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id_persona;

    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_persona_usuario", foreignKeyDefinition = "FOREIGN KEY (id_usuario) REFERENCES public.\"Usuarios\" ON UPDATE CASCADE ON DELETE CASCADE"), nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Usuario usuario;

    @JoinColumn(name = "id_tipo_identificacion", foreignKey = @ForeignKey(name = "fk_persona_tipo_identificacion", foreignKeyDefinition = "FOREIGN KEY (id_tipo_identificacion) REFERENCES human.\"TiposIdentificacion\" ON UPDATE CASCADE ON DELETE CASCADE"), nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoIdentificacion tipoIdentificacion;

    @Column(name = "per_identificacion", length = 15, nullable = false)
    private String per_identificacion;

    @Column(name = "per_primer_nombre", length = 75, nullable = false)
    private String per_primer_nombre;

    @Column(name = "per_segundo_nombre", length = 75, columnDefinition = "character varying(75) DEFAULT ''")
    private String per_segundo_nombre = "";

    @Column(name = "per_primer_apellido", length = 75, nullable = false)
    private String per_primer_apellido;

    @Column(name = "per_segundo_apellido", length = 75, columnDefinition = "character varying(75) DEFAULT ''")
    private String per_segundo_apellido = "";

    @Column(name = "per_direccion", length = 200, columnDefinition = "character varying(200) DEFAULT ''")
    private String per_direccion;

    @Column(name = "per_telefono", length = 20, columnDefinition = "character varying(20) DEFAULT ''")
    private String per_telefono;

    @Column(name = "per_correo", length = 50, nullable = false)
    private String per_correo;

    @Column(name = "per_sexo", length = 50, nullable = false)
    private String per_sexo;

    @Column(name = "per_fecha_registro", columnDefinition = "timestamp DEFAULT 'now()'")
    private LocalDateTime per_fecha_registro = ZonedDateTime.now(ZoneId.of("America/Guayaquil")).toLocalDateTime();

    @Column(name = "per_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean per_activo = true;

    public Persona() {

    }

    public Persona(Long id_persona, Usuario usuario, TipoIdentificacion tipoIdentificacion, String per_identificacion,
            String per_primer_nombre, String per_segundo_nombre, String per_primer_apellido,
            String per_segundo_apellido, String per_correo, String per_sexo, LocalDateTime per_fecha_registro,
            Boolean per_activo) {

        this.id_persona = id_persona;
        this.usuario = usuario;
        this.tipoIdentificacion = tipoIdentificacion;
        this.per_identificacion = per_identificacion;
        this.per_primer_nombre = per_primer_nombre;
        this.per_segundo_nombre = per_segundo_nombre;
        this.per_primer_apellido = per_primer_apellido;
        this.per_segundo_apellido = per_segundo_apellido;
        this.per_correo = per_correo;
        this.per_sexo = per_sexo;
        this.per_fecha_registro = per_fecha_registro;
        this.per_activo = per_activo;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getPer_identificacion() {
        return per_identificacion;
    }

    public void setPer_identificacion(String per_identificacion) {
        this.per_identificacion = per_identificacion;
    }

    public String getPer_primer_nombre() {
        return per_primer_nombre;
    }

    public void setPer_primer_nombre(String per_primer_nombre) {
        this.per_primer_nombre = per_primer_nombre;
    }

    public String getPer_segundo_nombre() {
        return per_segundo_nombre;
    }

    public void setPer_segundo_nombre(String per_segundo_nombre) {
        this.per_segundo_nombre = per_segundo_nombre;
    }

    public String getPer_primer_apellido() {
        return per_primer_apellido;
    }

    public void setPer_primer_apellido(String per_primer_apellido) {
        this.per_primer_apellido = per_primer_apellido;
    }

    public String getPer_segundo_apellido() {
        return per_segundo_apellido;
    }

    public void setPer_segundo_apellido(String per_segundo_apellido) {
        this.per_segundo_apellido = per_segundo_apellido;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }

    public String getPer_sexo() {
        return per_sexo;
    }

    public void setPer_sexo(String per_sexo) {
        this.per_sexo = per_sexo;
    }

    public LocalDateTime getPer_fecha_registro() {
        return per_fecha_registro;
    }

    public void setPer_fecha_registro(LocalDateTime per_fecha_registro) {
        this.per_fecha_registro = per_fecha_registro;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Boolean getPer_activo() {
        return per_activo;
    }

    public void setPer_activo(Boolean per_activo) {
        this.per_activo = per_activo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    @Override
    public String toString() {
        return "Persona [id_persona=" + id_persona + ", usuario=" + usuario + ", tipoIdentificacion="
                + tipoIdentificacion + ", per_identificacion=" + per_identificacion + ", per_primer_nombre="
                + per_primer_nombre + ", per_segundo_nombre=" + per_segundo_nombre + ", per_primer_apellido="
                + per_primer_apellido + ", per_segundo_apellido=" + per_segundo_apellido + ", per_correo=" + per_correo
                + ", per_sexo=" + per_sexo + ", per_fecha_registro=" + per_fecha_registro + ", per_activo=" + per_activo
                + "]";
    }

}
