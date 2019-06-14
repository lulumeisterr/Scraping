package br.com.scraping.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.com.scraping.model.Noticia;

public class RecuperandoInformacaoController {

	private static String URL = "https://noticias.uol.com.br/ultimas/index.htm";
	ArrayList<Noticia> listaNoticias = new ArrayList<Noticia>();

	public List<Noticia> buscarLinks() {
		Noticia noticias = null;
		Document document = null;
		try {
			document = Jsoup.connect(URL).userAgent("Jsoup").get();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro na URL");
			return null;
		}

		Elements e = document.getElementsByClass("thumbnail-standard");

		noticias = new Noticia();

		for(Element es : e) {
			noticias.setCanalAbertura(es.firstElementSibling().select(".thumb-kicker").text());
			noticias.setTitulo(es.firstElementSibling().select(".thumb-title").text().replace(",", " "));
			noticias.setLink(es.firstElementSibling().select("a").attr("href"));
			noticias.setHora(es.firstElementSibling().select("time").first().text());
		}

		listaNoticias.add(noticias);
		return listaNoticias;
	}

}
