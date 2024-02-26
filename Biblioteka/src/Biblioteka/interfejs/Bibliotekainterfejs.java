package Biblioteka.interfejs;

import java.util.List;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface Bibliotekainterfejs {

	public void dodajKnjigu(Knjiga k);
	
	public void obrisiKnjigu(Knjiga k);
	
	public List<Knjiga> vratiSveKnjige();
	
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
	
	
	
}
