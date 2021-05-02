package com.qbo.model;

public class LoginForm {
	
	public LoginForm() {
	
	}

	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public LoginForm(String usuario) {
		super();
		this.usuario = usuario;
	}

	
}
