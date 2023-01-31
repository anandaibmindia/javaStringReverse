package com.ust.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ust.model.Word;
import com.ust.sort.SortByFrequencyDescending;

public class ReadingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String initialString= sc.nextLine();
		String[] wordsList=initialString.split(" ");
		
		
		HashSet<Word> set =new HashSet<Word>();
		HashSet<String> setString=new HashSet<String>();
		//ArrayList<Word> list=new ArrayList<Word>();
		//Map<Word,Integer> map=new HashMap<Word,Integer>();
		for (int i=0;i<wordsList.length;i++) {
			int count=0;
			Word word=new Word();
			word.setWord(wordsList[i]);
			//list.add(word);
			
			if (setString.add(wordsList[i].toString())) {
				word.setFrequency(1);
				//map.put(word, 1);
			}else {
				//Word key=map.get(word);
				
				for (Word w:set) {
					
					if (w.getWord().equals(wordsList[i])) {
						word.setFrequency(w.getFrequency()+1);
						
					}
				}
				
				//map.put(word, map.get(word)+1);
			}
			//int found=0;
			for (Word w:set) {
				
			if (w.getWord().equals(wordsList[i])) {
				set.remove(w);
				
			}
			
			}
			set.add(word);
			
		}
		
		showWordList(set);
		showReverseOrder(set);		
		showFrequentWords(set);
		
		

	}
	
	/*public static void showWordList(Map map) {
		Set<Word> keyset=map.keySet();
		for (Word w:keyset) {
			System.out.println(w.toString()+":::Frequency="+map.get(w));		
			
		}
		
	}*/
	
	public static void showWordList(Set<Word> set) {
		for (Word o:set) {
			System.out.println(o.toString());		
			
		}
		
	}
	
	public static void showReverseOrder(Set<Word> set) {
		List<Word> list=new ArrayList(set);
		Collections.sort(list);
		Collections.reverse(list);
		
		for (Word o:list) {
			System.out.println(o.toString());		
			
		}
		
	}
	
	public static void showFrequentWords(Set<Word> set) {
		List<Word> list=new ArrayList(set);
		Collections.sort(list,new SortByFrequencyDescending());
		//Collections.reverse(list);
		
		for (Word o:list) {
			System.out.println(o.toString());		
			
		}
		
	}

}
