package com.bootcamp.facturacion.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComercioDTO {
    private Long id;
    private String nit;
    private String nrc;// no nulo
    private String nombre; // no nulo
    private String nombreComercial;//no nulo
    private int tipoEstablecimiento;//2 casa matriz 1 sucursal (ENUM)
    private String telefono;// sin guiones 8 caracteres
    private String codEstableMH;// M001 / S00X  codigo de sucursales
    private String codPuntoVentaMH; // P00X
    private String correo;// email valido
    private boolean granContribuyente;
    private String complementoDireccion;
    private Long municipio_id;
    private Long actividadEconomica_id;
}
/*
{
	"id": 1,
	"tipoDocumento": 13,
	"numDocumento": "038780392",
	"nrc": "3214545",
	"nombre": "Josue",
	"apellidos": "Guardado",
	"nombreComercial": "Devs El Salvador",
	"telefono": "70000000",
	"correo": "correo@gmail.com",
	"granContribuyente": false,
	"complementoDireccion": "Col. Las Brisas",
	"activo": true,
	"municipio_id":1,
	"actividadEconomica_id":1
}
* */