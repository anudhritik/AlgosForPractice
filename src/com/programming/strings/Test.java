package com.programming.strings;

public class Test {
	public static int isPrefixOfWord(String sentence, String searchWord) {
        String words[] = sentence.split(" ");
        for(int i =0;i<words.length;i++){
            String word = words[i];
           // System.out.println(words.length);
            if(word.startsWith(searchWord)){
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args) {
	String s = "hellohello hellohellohello";
	String s1 = "ell";
	
System.out.println(isPrefixOfWord(s, s1));
}
}
