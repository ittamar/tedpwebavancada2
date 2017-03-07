//package exerc02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaGenerica {
private String nome;
private String telefone;
private Date diaCadastro;


public PessoaGenerica(){
	
}
public PessoaGenerica(String nome, String telefone, String diaCadastro) {
	SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
	
	try {
	 this.diaCadastro = format.parse(diaCadastro);
		this.nome = nome;
		this.telefone = telefone;
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public Date getDiaCadastro() {
	return diaCadastro;
}

public void setDiaCadastro(Date diaCadastro) {
	
		
		this.diaCadastro = diaCadastro;
	
	
}


public void inseriDados(){
	System.out.println();
}

@Override
public String toString() {
	return " nome=" + nome + ", telefone=" + telefone + ", diaCadastro=" + diaCadastro ;
}


}
