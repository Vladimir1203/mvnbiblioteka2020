package rs.ac.bg.fon.nprog.mvnbiblioteka.biblioteka.interfejs;

import java.util.List;

import rs.ac.bg.fon.nprog.mvnbiblioteka.biblioteka.Autor;
import rs.ac.bg.fon.nprog.mvnbiblioteka.biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	public void dodajKnjigu(Knjiga knjiga);

	public void obrisiKnjigu(Knjiga knjiga);

	public List<Knjiga> vratiSveKnjige();

	public List<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac);

}
