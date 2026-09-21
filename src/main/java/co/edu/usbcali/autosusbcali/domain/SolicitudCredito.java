package co.edu.usbcali.autosusbcali.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Table(name = "solicitudes_credito")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data


public class SolicitudCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "entidad_financiera_id", nullable = false)
    private EntidadFinanciera entidadfinanciera;

    @Column (name = "monto_solicitado", nullable = false, precision = 15, scale = 2)
    private BigDecimal monSolicitud;

    @Column (name = "cuota_inicial", precision = 15, scale = 2)
    private BigDecimal cuotaInicial;

    @Column (name = "estado", length = 20, nullable = false)
    private String estado;

    @Column (name = "observaciones")
    private String observaciones;

    @Column (name = "fecha_envio", nullable = false)
    private LocalDateTime fechaEnvio;

    @Column (name = "fecha_respuesta")
    private LocalDateTime fechaRespuesta;

}
