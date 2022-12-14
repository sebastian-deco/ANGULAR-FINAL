package com.example.microserv.service;

import com.example.microserv.entity.EntidadUsuario;
import com.example.microserv.interfaz.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private RepositorioUsuario repoUsuario;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EntidadUsuario usuario = repoUsuario.findByaUserUsuario(username);
        if (usuario ==null)
        {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return usuario;
    }
}
