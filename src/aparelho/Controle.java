package aparelho;

public class Controle {
	private Commando comando;
    private Commando commandoVolume;
	public Controle() {
		
		
	}

	public void setComando(Commando comando) {
		this.comando = comando;
	}
	
	public void setCommandoVolume(Commando commandoVolume) {
		this.commandoVolume = commandoVolume;
	}

	public void buttonChannel(int i){
		comando.executar(i);
	}
	
	public void buttonVolume(String v){
		commandoVolume.pressionarButton(v);
	}

}
