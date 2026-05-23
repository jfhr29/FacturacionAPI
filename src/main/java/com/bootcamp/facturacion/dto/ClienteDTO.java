package com.bootcamp.facturacion.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {
    private int id;
    private int tipoDocumento; // 13 DUI 36 NIT 37 OTRO
    private String numDocumento;// sin guiones
    private String nrc;//sin guiones
    private String nombre;
    private String apellidos;
    private String nombreComercial;
    private String telefono;
    private String correo;
    private boolean granContribuyente;
    private String complementoDireccion;
    private boolean activo; // soft delete
    private int municipio_id;
    private int actividadEconomica_id;
    // DATOS PARA ACTIVIDAD ECONOMICA NUEVA.
    private String Codigo;
    private String Descripcion;
}
