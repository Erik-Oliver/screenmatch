package br.com.screenmatch.principal;

import br.com.screenmatch.model.DadosSerie;
import br.com.screenmatch.services.ConsumoApi;
import br.com.screenmatch.services.ConverteDados;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=73b6571c";

    public void menu() {

        System.out.println("Digite o nome da série: ");
        var nomeSerie = leitura.next();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }




}
