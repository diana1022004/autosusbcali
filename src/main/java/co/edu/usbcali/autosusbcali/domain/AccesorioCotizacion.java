package co.edu.usbcali.autosusbcali.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "accesorios_cotizacion")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccesorioCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cotizacion_id", nullable = false)
    private Cotizacion cotizacion;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "precio", precision = 12, scale = 2, nullable = false)
    private BigDecimal precio;
}
