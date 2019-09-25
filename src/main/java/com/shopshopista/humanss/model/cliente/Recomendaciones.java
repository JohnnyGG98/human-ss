package com.shopshopista.humanss.model.cliente;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import org.hibernate.annotations.Where;

@Where(clause = "reco_activo = true")
@Entity(
        name = "Recomendaciones"
)
@Table(
        name = "\"Recomendaciones\"",
        schema = "human"
)
public class Recomendaciones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recomendacion")
    private Long id_recomendacion;

    @JsonBackReference
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", foreignKey = @ForeignKey(name = "cliente_recomendaciones_fk"))
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Cliente cliente;

    @Column(name = "recomendacion", length = 255, nullable = false)
    private String recomendacion;

    @Column(name = "reco_activo", columnDefinition = "BOOLEAN DEFAULT 'true'", nullable = false)
    private Boolean reco_activo;

    public Recomendaciones() {

    }

    public Recomendaciones(Long id_recomendacion, Cliente cliente, String recomendacion, Boolean reco_activo) {
        this.id_recomendacion = id_recomendacion;
        this.cliente = cliente;
        this.recomendacion = recomendacion;
        this.reco_activo = reco_activo;
    }

    public Long getId_recomendacion() {
        return id_recomendacion;
    }

    public void setId_recomendacion(Long id_recomendacion) {
        this.id_recomendacion = id_recomendacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Boolean getReco_activo() {
        return reco_activo;
    }

    public void setReco_activo(Boolean reco_activo) {
        this.reco_activo = reco_activo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Recomendaciones [id_recomendacion=" + id_recomendacion + ", recomendacion=" + recomendacion
                + ", reco_activo=" + reco_activo + "]";
    }

}
