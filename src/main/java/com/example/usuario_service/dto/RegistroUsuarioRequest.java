package com.example.usuario_service.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import com.example.usuario_service.domain.Domicilio;
import com.example.usuario_service.domain.Usuario;

@Getter
@Data
@NoArgsConstructor
public class RegistroUsuarioRequest {
	
	@NotNull
	@Valid
	private Usuario usuario;
	@NotNull
	@Valid
	private Domicilio domicilio;

}
