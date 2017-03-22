package aparelho;

public class ControlarVolume implements Commando {
	private Televisao televisao;
	
	public ControlarVolume(Televisao televisao){
		this.televisao = televisao;
	}

	@Override
	public void executar(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pressionarButton(String v) {
		// TODO Auto-generated method stub
		televisao.volume(v);
		
	}

}
