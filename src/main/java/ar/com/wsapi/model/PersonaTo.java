package ar.com.wsapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonaTo {
	private String idPersona;
	private String tipoClave;
	private String estadoClave;
	private String nombre;
	private String direccion;
	private String localidad;
	private String codPostal;
	private String nombreProvincia;

}
