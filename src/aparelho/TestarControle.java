package aparelho;

public class TestarControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Controle controle = new Controle();
           Televisao televisao = new Televisao();
           MudarCanal mudarCanal = new MudarCanal(televisao);
           ControlarVolume volume = new ControlarVolume(televisao);
           controle.setComando(mudarCanal);
           controle.buttonChannel(7);
           
           controle.setCommandoVolume(volume);
           controle.buttonVolume("-");
	}

}
