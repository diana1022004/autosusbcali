package co.edu.usbcali.autosusbcali.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "usuarios_roles")
@Entity
@IdClass(UsuarioRolId.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioRol {

    @Id
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Id
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}