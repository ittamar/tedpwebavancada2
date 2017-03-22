package aparelho;

import java.util.ArrayList;

public class Televisao {
	private int volume;
	private String canal;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	
	public void mudarCanal(int i){
		ArrayList<String> canais = new ArrayList<>();
		canais.add("canal 00 sem sinal");
		canais.add("canal 01 sem sinal");
		canais.add("canal 02 sem sinal");
		canais.add("canal 03 sem sinal");
		canais.add("canal 04 sem sinal");
		canais.add("canal 05 SBT");
		canais.add("canal 06 sem sinal");
		canais.add("canal 07 Globo");
		canais.add("canal 08 sem sinal");
		canais.add("canal 09 sem sinal");
		canais.add("canal 10 BAND");
		canais.add("canal 11 sem sina");
		canais.add("canal 12 Recor");
		System.out.println(canais.get(i));
		
	}
	 public void volume(String x){
		 ArrayList<String> volume = new ArrayList<>();
		 if(x =="+"){
			 for(int i = 0 ; i<=20; i++){
				setVolume(i);
				 System.out.println(getVolume());
			 }
		 }else if(x == "-"){
			 for(int y = 20;y >= 0; y--){
				 setVolume(y);
				 System.out.println(getVolume());
			 }
		 }
		 
	 }
	 
	/* public static void main(String args[]){
		 Televisao t = new Televisao();
		 t.volume("-");
	 }*/
	
}
