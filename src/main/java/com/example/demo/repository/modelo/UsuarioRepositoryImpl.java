package com.example.demo.repository.modelo;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class UsuarioRepositoryImpl implements IUsuarioRepository {

	private EntityManager entityManager;


	public Usuario ConsultarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> myQuery = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.nombre=: nombre",
				Usuario.class);
		myQuery.setParameter("nombre", nombre);
		return myQuery.getSingleResult();
	}

}
