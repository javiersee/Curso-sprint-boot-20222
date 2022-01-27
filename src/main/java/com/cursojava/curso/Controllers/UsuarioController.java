package com.cursojava.curso.Controllers;
import com.cursojava.curso.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("javier");
        usuario.setApellido("cuasapud");
        usuario.setEmail("cuasa@gmail.com");
        usuario.setTelefono("121221");
        usuario.setPassword("ssddsd");
        return  usuario;
    }


}
