package com.throower.web.throower.models.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("jpaUserDetailService")
public class JPAUserDetailService implements UserDetailsService{

//	@Autowired
//	private IUsuarioDao usuarioDao;
	
	private Logger logger = LoggerFactory.getLogger(JPAUserDetailService.class);
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
//		Usuario usuario = usuarioDao.findByUsername(username);
//		
//		if(usuario == null) {
//			logger.error("Error login: no existe el usuario '" +username + "'");
//			throw new UsernameNotFoundException("Username " + username + " no existe en el sistema");
//		}
//		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("admin"));
//		for(Role role : usuario.getRoles()) {
//			logger.info("Role: ".concat(role.getAuthority()));
//			authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
//		}
//		
//		if(authorities.isEmpty()) {
//			logger.error("Error login: el usuario '" +username + "' no tiene roles asigandos");
//			throw new UsernameNotFoundException("Error login: el usuario '" +username + "' no tiene roles asigandos");
//		}
		
		//return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
		
		return new User("Santi", "1234", true, true, true, true, authorities);
	}

	
	
}
