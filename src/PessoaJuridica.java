public class PessoaJuridica extends PessoaGenerica{
private long cnpj;


public PessoaJuridica(){
	
}
public PessoaJuridica(long cnpj) {
	
	this.cnpj = cnpj;
}

public long getCnpj() {
	return cnpj;
}

public void setCnpj(long cnpj) {
	this.cnpj = cnpj;
}
	
}
