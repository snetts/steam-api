package me.ugurcan.turengapi;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		TurengAPI tureng = new TurengAPI();
		
		ArrayList<Result> results = tureng.translate("t�rk atas�z�");
		
		for(Result result : results)
			System.out.println( result.toString() );

	}

}
