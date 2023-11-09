package com.ppai.ppai3.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "clientes", table = "sqlite_sequence",
            pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "cliente_id")
    private int dni;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "nro_celular")
    private int nroCelular;
}
