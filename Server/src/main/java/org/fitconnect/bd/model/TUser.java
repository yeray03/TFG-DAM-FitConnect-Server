package org.fitconnect.bd.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "t_users")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Size(max = 100)
    @Column(name = "apellidos", length = 100)
    private String apellidos;

    @ColumnDefault("0")
    @Column(name = "cod_usuario")
    private Integer codUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @ColumnDefault("0")
    @JoinColumn(name = "tipo_usuario", referencedColumnName = "cod_tipo")
    private TTipoUsuario tipoUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public TTipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TTipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}