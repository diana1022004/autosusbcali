package co.edu.usbcali.autosusbcali.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "entidades_financieras")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class EntidadFinanciera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column (name = "nit", length = 20, nullable = false)
    private String nit;

    @Column (name = "endpointApi", length = 500)
    private String endpointApi;

    @Column (name = "Activo", nullable = false)
    private Boolean activo;
}
