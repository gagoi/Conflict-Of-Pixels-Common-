package fr.cop.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level {

	private final String PATH; // Chemin d'acc�s au fichier de la map (d�clar� final car ne sera pas chang�).
	private final int SIZE; // Taille de la map (d�clar� final car ne sera pas chang�).
	private String map; // Contenu de la map (suite de char).
	public int gridSize;
	
	public Level(String path, int size) { // Objet Level ===> map
		SIZE = size; // On instancie la taille.
		PATH = path; // On instancie le chemin d'acc�s au fichier.
		gridSize = SIZE*16*4;
		try { // On essaie de ...
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/fr/cop/resources/maps/" + PATH + ".txt"))); // ... lire le fichier.
			String line = " "; // Notre ligne actuelle vaut " ".
			while ((line = br.readLine()) != null) { // Ligne = ligne pas encore lue. Si cette ligne n'est pas vide :
				if (map == null) map = line; // // Si c'est la premi�re ligne, on instancie notre String map ---> Evite les NPEs.
				else map += line; // Sinon on ajoute la ligne � notre String map. 
			}
			map.trim();
		} catch (IOException e) { // Si une erreur est lev�e ...
			e.printStackTrace(); // ... on �crit le rapport d'erreur dans 
		}
	}

	public char getSpriteCodeAt(int x, int y) { // M�thode pour savoir Sprite se trouve aux coordonnees (x;y)
		return map.charAt(x / 16 + y / 16 * SIZE); // On renvoie le sprite aux coordonn�es x/y du fichier map..
	}

	public int getSize() { // M�thode pour r�cup�rer la taille de la map. ==> Utilis�e essentiellement pour le rendu.
		return SIZE; // Renvoie la taille de la map.
	}
}