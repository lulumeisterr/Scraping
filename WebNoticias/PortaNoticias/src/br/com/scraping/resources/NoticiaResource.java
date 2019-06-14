package br.com.scraping.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import br.com.scraping.controller.RecuperandoInformacaoController;
import br.com.scraping.model.Noticia;

@Path("noticias")
public class NoticiaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String buscar() {
		List<Noticia> noticia = new RecuperandoInformacaoController().buscarLinks();
		return new Gson().toJson(noticia);
	}
}
