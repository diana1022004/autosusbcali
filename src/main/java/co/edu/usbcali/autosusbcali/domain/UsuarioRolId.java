package co.edu.usbcali.autosusbcali.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRolId implements Serializable {

    private Long usuario;
    private Long rol;
}