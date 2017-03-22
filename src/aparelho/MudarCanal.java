package aparelho;

public class MudarCanal implements Commando{
	private Televisao televisao;
	
	public MudarCanal(Televisao televisao){
		this.televisao = televisao;
	}

	@Override
	public void executar(int i) {
		// TODO Auto-generated method stub
		televisao.mudarCanal(i);
		
	}

	@Override
	public void pressionarButton(String v) {
		// TODO Auto-generated method stub
		
	}

}
