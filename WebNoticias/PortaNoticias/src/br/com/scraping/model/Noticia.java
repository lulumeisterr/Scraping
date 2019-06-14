package br.com.scraping.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public class Noticia implements Serializable{

	private static final long serialVersionUID = 9203790109988278580L;

	private String canalAbertura;
	private String titulo;
	private String link;
	private String hora;
	private List<String> listadeNoticias;

	
	public Noticia() {

	}
	
	public Noticia(final String canalAbertura, String titulo, String link, String hora, List<String> listadeNoticias) {
		super();
		this.canalAbertura = canalAbertura;
		this.titulo = titulo;
		this.link = link;
		this.hora = hora;
		this.listadeNoticias = listadeNoticias;
	}

	public String getCanalAbertura() {
		return canalAbertura;
	}

	public void setCanalAbertura(final String canalAbertura) {
		this.canalAbertura = canalAbertura;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}

	public List<String> getListadeNoticias() {
		return listadeNoticias;
	}

	public void setListadeNoticias(List<String> listadeNoticias) {
		this.listadeNoticias = listadeNoticias;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canalAbertura == null) ? 0 : canalAbertura.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((listadeNoticias == null) ? 0 : listadeNoticias.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Noticia other = (Noticia) obj;
		if (canalAbertura == null) {
			if (other.canalAbertura != null)
				return false;
		} else if (!canalAbertura.equals(other.canalAbertura))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (listadeNoticias == null) {
			if (other.listadeNoticias != null)
				return false;
		} else if (!listadeNoticias.equals(other.listadeNoticias))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Canais de abetura : " + canalAbertura + 
				"\n"+
				"Titulos : " + titulo + 
				"\n"+
				"Links : " + link +
				"\n"+
				"Hora : " + hora;
	}

	public String toJSON() {
		return new Gson().toJson(this);
	}

}