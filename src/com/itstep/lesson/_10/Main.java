package com.itstep.lesson._10;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      CharList c1=new CharList();
      CharList c2=new CharList("World");

        ArrayList<Character> chars=new ArrayList<>();
        Collections.addAll(chars,'h','e','l','l','o');
        CharList c3 = new CharList(chars);
        CharList cutCharList=c2.subString(1,4);
        System.out.println("Substring: "+cutCharList.internalList);

        ArrayList<Character> charsD =new ArrayList<>();
        Collections.addAll(charsD,'N','i','c','o','l','l','i');
        CharList c4=new CharList(charsD);
        CharList remDup= c4.removeDuplicates();
        System.out.println("Remove duplicates: "+remDup.internalList);

        ArrayList<Character> charsF=new ArrayList<>();
        Collections.addAll(charsF,'C','a','l','l','d','a','r','e');
        CharList c5=new CharList(charsF);

        CharList remFirst=c5.removeFirst('l');
        System.out.println("Remove first: "+remFirst.internalList);

        CharList remAll=c4.removeAll('a');
        System.out.println("Remove all: "+remAll.internalList);


        System.out.println("Check if is empty- "+c5.isEmpty());
        System.out.println("Check if contains this characters: "+c4.contains('i'));
        System.out.println("List clear: "+c4.clearList());


        ArrayList<Character> charsS=new ArrayList<>();
        Collections.addAll(charsS,'c','a','l','d','a');
        CharList c6=new CharList(charsF);
        CharList sortL=c5.sortList();

        System.out.println("Sort list: "+sortL.internalList);
        System.out.println("Reverse list: "+c5.reverseList());
        System.out.println("Mix list: "+c5.mixedList());
        System.out.println("Ca string: "+c5.toString());













    }
}
