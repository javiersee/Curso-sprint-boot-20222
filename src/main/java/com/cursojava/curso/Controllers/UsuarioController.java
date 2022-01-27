package com.cursojava.curso.Controllers;
import com.cursojava.curso.Controllers.models.Usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("javier");
        usuario.setApellido("cuasapud");
        usuario.setEmail("cuasa@gmail.com");
        usuario.setTelefono("121221");
        usuario.setPassword("ssddsd");
        return  usuario;
    }


}
