package com.shopshopista.humanss.model;

import java.io.Serializable;

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

@Entity
@Table(
        name = "\"Locales\"",
        schema = "human"
)
public class Local implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_local")
    private Long id_local;

    @JsonBackReference
    @JoinColumn(name = "id_vendedor", nullable = false, foreignKey = @ForeignKey(name = "fk_local_vendedor", foreignKeyDefinition = "FOREIGN KEY (id_vendedor) REFERENCES \"Vendedores\" ON UPDATE CASCADE ON DELETE CASCADE"))
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Vendedor vendedor;

    @Column(name = "loc_correo", length = 50, nullable = false)
    private String loc_correo;

    @Column(name = "loc_calle_principal", length = 150, nullable = false)
    private String loc_calle_principal;

    @Column(name = "loc_calle_secundaria", length = 150, nullable = false)
    private String loc_calle_secundaria;

    @Column(name = "loc_activo", nullable = false, columnDefinition = "boolean DEFAULT 'true'")
    private Boolean loc_activo = true;

    public Local() {

    }

    public Local(Long id_local, Vendedor vendedor, String loc_correo, String loc_calle_principal,
            String loc_calle_secundaria, Boolean loc_activo) {
        super();
        this.id_local = id_local;
        this.vendedor = vendedor;
        this.loc_correo = loc_correo;
        this.loc_calle_principal = loc_calle_principal;
        this.loc_calle_secundaria = loc_calle_secundaria;
        this.loc_activo = loc_activo;
    }

    public Long getId_local() {
        return id_local;
    }

    public void setId_local(Long id_local) {
        this.id_local = id_local;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getLoc_correo() {
        return loc_correo;
    }

    public void setLoc_correo(String loc_correo) {
        this.loc_correo = loc_correo;
    }

    public String getLoc_calle_principal() {
        return loc_calle_principal;
    }

    public void setLoc_calle_principal(String loc_calle_principal) {
        this.loc_calle_principal = loc_calle_principal;
    }

    public String getLoc_calle_secundaria() {
        return loc_calle_secundaria;
    }

    public void setLoc_calle_secundaria(String loc_calle_secundaria) {
        this.loc_calle_secundaria = loc_calle_secundaria;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Boolean getLoc_activo() {
        return loc_activo;
    }

    public void setLoc_activo(Boolean loc_activo) {
        this.loc_activo = loc_activo;
    }

    @Override
    public String toString() {
        return "Local [id_local=" + id_local + ", vendedor=" + vendedor + ", loc_correo=" + loc_correo
                + ", loc_calle_principal=" + loc_calle_principal + ", loc_calle_secundaria=" + loc_calle_secundaria
                + ", loc_activo=" + loc_activo + "]";
    }

}
