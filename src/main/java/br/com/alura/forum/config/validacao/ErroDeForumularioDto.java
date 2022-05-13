package br.com.alura.forum.config.validacao;

public class ErroDeForumularioDto {
	
	private String campo;
	private String erro;
	
	
	public ErroDeForumularioDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}


	public String getCampo() {
		return campo;
	}


	public String getErro() {
		return erro;
	}

	
	
	
	
}
