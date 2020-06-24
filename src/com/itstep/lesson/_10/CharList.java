package com.itstep.lesson._10;

import java.util.*;

public class CharList {
    public ArrayList<Character> internalList;

    //prima medalitate de constructie

    public CharList(ArrayList<Character> charList) {
        this.internalList = charList;
    }
//a doua modalitate de constructie

    public CharList() {
        internalList = new ArrayList<>();
    }
//a treia modalitate de constructie
    
    public CharList(String string) {
        this.internalList = new ArrayList<>();

        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            internalList.add(string.charAt(i));
        }
    }

    public char charAt(int index) {
        return internalList.get(index);
    }

    public CharList subString(int start, int end) {
        ArrayList<Character> collected = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            collected.add(internalList.get(i));
        }
        return new CharList(collected);
    }

     public CharList removeDuplicates() {
         Set<Character>remDuplic = new LinkedHashSet<>(internalList);
         return new CharList(new ArrayList<>(remDuplic));
     }

     public CharList removeFirst(Character c){
        internalList.remove(c);
        return this;
     }

     public CharList removeAll(Character c){
        internalList.removeAll(Collections.singletonList(c));
        return this;
     }

     public Boolean isEmpty(){
         return   internalList.isEmpty();
     }

      public Boolean contains(Character c){
       return internalList.contains(c);
      }

      public CharList clearList(){
        internalList.clear();
        return this;
    }

    public CharList sortList(){
        Collections.sort(internalList);
        return this;
    }

    public CharList reverseList(){
        Collections.reverse(internalList);
        return this;
    }

    public CharList mixedList(){
        Collections.shuffle(internalList);
        return this;
    }
    public String toString() {
        String result = "";
        for (Character n : internalList) {
            result += n; //result=result+n;
        }
        return result;
    }
















}


