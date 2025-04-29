package br.com.screenmatch;

import br.com.screenmatch.model.DadosTemporadas;
import br.com.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

// The class that contains the Main method
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.menu();

		List<DadosTemporadas> temporadas = new ArrayList<>();

//		for(int i = 1;i <= dados.totaltemporadas();i++){
//
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=Peaky+Blinders&season=" + i + "&apikey=73b6571c");
//			DadosTemporadas dadosTemporadas = conversor.obterDados(json, DadosTemporadas.class);
////			temporadas.add(dadosTemporadas);
//
//		}
//		temporadas.forEach(System.out::println);
	}
}
