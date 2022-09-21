package Teste.teste1;
import java.util.ArrayList;

public class Valores implements ValoresITF{

	ArrayList <Integer> valores = new ArrayList<Integer>();
	
	public boolean ins(int v) {
		if (v > 0 && valores.size() < 10) {
			valores.add(v);
			return true;	
		}
		else {
			return false;	
		}
	}

	public int del(int i) {
		valores.remove(i);
		return -1;
		
	}

	public int size() {
		
		return valores.size();
	}

	public double mean() {
		double mediaValores = 0.0;
		for (int i = 0; i < valores.size(); i++) {
			mediaValores += valores.get(i);
		}
		return mediaValores / valores.size();
	}

	public int greater() {
		int maiorNumero = 0;
		for (int i = 0; i < valores.size(); i++) {
			if (maiorNumero == 0) {
				maiorNumero = valores.get(i);
			}
			else if (valores.get(i) > valores.get(i - 1))
				maiorNumero = valores.get(i);
		}
		return maiorNumero;
	}

	public int lower() {
		int menorNumero = 0;
		for (int i = 0; i < valores.size(); i++) {
			if (menorNumero == 0) {
				menorNumero = valores.get(i);
			}
			else if (valores.get(i) < valores.get(i - 1))
				menorNumero = valores.get(i);
		}
		return menorNumero;
	}
	

}
