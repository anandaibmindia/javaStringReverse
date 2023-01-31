package com.ust.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.ust.model.Word;
import com.ust.sort.SortByFrequencyDescending;

public class ReadingString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String initialString= sc.nextLine();
		String[] wordsList=initialString.split(" ");
		
		
		HashSet<Word> set =new HashSet<Word>();
		//HashSet<String> setString=new HashSet<String>();
		ArrayList<Word> list=new ArrayList<Word>();
		//Map<Word,Integer> map=new HashMap<Word,Integer>();
		for (int i=0;i<wordsList.length;i++) {
			int count=0;
			Word word=new Word();
			word.setWord(wordsList[i]);
			word.setFrequency(1);
			list.add(word);
			//set.add(word);
			
					
		}
		for (Word w1:list) {
			int count=0;
			for (Word w2:list) {
				if (w1.getWord().equals(w2.getWord().toString())) {
					count++;
				}
				/*if (count>1) {
					set.remove(w2);
				}*/
			}
			w1.setFrequency(count);
			HashSet<String> setString2=new HashSet<String>();
			//if (count>1)
			if (setString2.add(w1.getWord().toString())){
				set.add(w1);
			}
			
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
