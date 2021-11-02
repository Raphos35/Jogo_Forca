package br.com.softblue.jogoforca.core;

import java.util.HashSet;
import java.util.Set;


public class Word {

	private static final char SECRETE_CHAR = '_';
	
	private String originalWord; /*Objeto que representa a palavra secreta*/
	private Set<Character> foundChars = new HashSet<>(); /*grupo de letras que o usuário já acertou*/
	private Set<Character> wordChars = new HashSet<>(); /*grupo de letras pertencentes a palavra secreta*/

	public Word(String originalWord) { /*Construtor que recebe a palavra secreta*/
		this.originalWord = originalWord.toUpperCase();
		
		char [] chars = this.originalWord.toCharArray();
		for (char c : chars) {
			wordChars.add(c);
		}
	}

	public int size() { /*identifica o tamanho da palavra, quantas letras possui*/
		return originalWord.length();
	}
	
	public boolean hasChar(char c) {/*identifica se a palavra secreta possui a letra escolhida pelo jogador*/
		c = Character.toUpperCase(c);
		if (originalWord.indexOf(c) > -1) {
			foundChars.add(c);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {/*Sobrescreve o objeto, no caso caracteres encontrados ou não*/
		StringBuilder sb = new StringBuilder();/*String são imutáveis, nesse caso o StringBuilder evita de ser criado novos objetos*/
		
		char[] charArray = originalWord.toCharArray();
		
		for (int i= 0; i < charArray.length; i++) {
			char c = charArray[i];
			
			if (foundChars.contains(c)) {
				sb.append(c);
			} else {
				sb.append(SECRETE_CHAR);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public boolean discovered() { /*compara se o grupo de letras descobertas pelo jogador é igual ao grupo de letras constituintes da palavra secreta*/
		return foundChars.equals(wordChars);
	}
	
	public String getOriginalWord() { /*getter que gera a palavra secreta*/ 
		return originalWord;
	}

	
}
