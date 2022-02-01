package com.cursojava.curso.Controllers;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List <Usuario> usuarios= new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("javier");
        usuario.setApellido("cuasapud");
        usuario.setEmail("cuasa@gmail.com");
        usuario.setTelefono("121221");
        usuario.setPassword("ssddsd");


        Usuario usuario1 = new Usuario();
        usuario1.setId(2L);
        usuario1.setNombre("samuel");
        usuario1.setApellido("arias");
        usuario1.setEmail("sarias@gmail.com");
        usuario1.setTelefono("3245343");
        usuario1.setPassword("ssddsd");

        Usuario usuario2 = new Usuario();
        usuario2.setId(3L);
        usuario2.setNombre("pepito");
        usuario2.setApellido("cuasquer ");
        usuario2.setEmail("cuasquer@gmail.com");
        usuario2.setTelefono("32334233");
        usuario2.setPassword("ssddsd");
        
        usuarios.add(usuario);  //En esta seccion agregamos los usuarios a la lista de usuarios 
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        return  usuarios;
    }


}
