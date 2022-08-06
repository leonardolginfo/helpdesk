package br.com.lginfo.helpdesk.domains.enums;

public enum Status {

	AMDIN(0,"ROLE_ADMIN") , CLIENTE(1,"ROLE_CLIENT"), TECNICO(2,"ROLE_TECNICO");
	
	private Integer codigo;
	private String descricao;
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (Status x : Status.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Perfil inválido!");
		
	}
	
	
}
