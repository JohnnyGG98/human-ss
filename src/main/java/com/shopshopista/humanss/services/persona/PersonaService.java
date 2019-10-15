package com.shopshopista.humanss.services.persona;

import com.shopshopista.humanss.model.cliente.Cliente;
import com.shopshopista.humanss.model.persona.Persona;
import com.shopshopista.humanss.model.persona.Usuario;
import com.shopshopista.humanss.model.vendedor.Vendedor;
import com.shopshopista.humanss.repository.cliente.IClienteRepository;
import com.shopshopista.humanss.repository.persona.IPersonaRepository;
import com.shopshopista.humanss.repository.persona.IUsuarioRepository;
import com.shopshopista.humanss.repository.vendedor.IVendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Johnny
 */
@Service
public class PersonaService {

    // Para encriptar la pass 
    @Autowired
    private PasswordEncoder bCryptEncoder;

    @Autowired
    private IVendedorRepository iVendedor;

    @Autowired
    private IClienteRepository iCliente;
    
    @Autowired
    private IPersonaRepository iPersona;
    
    @Autowired
    private IUsuarioRepository iUsuario;

    public Vendedor guardarVendedor(Vendedor v) {
        // Encriptamos la pass 
        encriptaPass(v.getUsuario());
        // Tipo de usuario  es vendedor 
        v.getUsuario().setUser_tipo('V');
        return iVendedor.save(v);
    }

    public Cliente guardarCliente(Cliente c) {
        encriptaPass(c.getUsuario());
        // Tipo client e
        c.getUsuario().setUser_tipo('C');
        return iCliente.save(c);
    }
    
    public Usuario guardarUsuario(Usuario u) {
        encriptaPass(u);
        return iUsuario.save(u);
    }
    
    public Persona guardarPersona(Persona p) {
        encriptaPass(p.getUsuario());
        return iPersona.save(p);
    }

    private void encriptaPass(Usuario u) {
        u.setUser_pass(
                bCryptEncoder.encode(
                        u.getUser_pass()
                )
        );
    }

}
