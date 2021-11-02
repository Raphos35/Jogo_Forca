package br.com.softblue.jogoforca.game;

import br.com.softblue.jogoforca.core.Dictionary;
import br.com.softblue.jogoforca.core.Word;

public class Game {

	public void start() {
		
		
		Dictionary d = Dictionary.getInstance();
		
		Word w1 = d.nextWord();
		System.out.println(w1.getOriginalWord());
		
		
	}

}
