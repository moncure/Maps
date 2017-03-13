/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy Moncure
 */
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Arrays;

public class PracticeMap {
    
    public Map<String,String> mapBully(Map<String,String> map){
        /**
         * Modify and return the given map as follows: if the key "a" has a 
         * value, set the key "b" to have that value, and set the key "a" 
         * to have the value "". 
         * Basically "b" is a bully, taking the value and replacing it 
         * with the empty string.
         */
       
        for (String k : map.keySet())
            if (k.equals("a")) {
                map.put("b", map.get(k));
                map.put("a","");
                        
            }
        
        return map;
    }//end mapBully
    
    private boolean mapBullyTest(){
        Map<String,String> a1 = new HashMap<String,String>();
        a1.put("a","candy");
        a1.put("b","dirt");
        Map<String,String> a2 = new HashMap<String,String>();
        a2.put("a","");
        a2.put("b","candy");
        
        boolean case1 = mapBully(a1).equals(a2);
       
        
        Map<String,String> b1 = new HashMap<String,String>();
        b1.put("a","candy");
        Map<String,String> b2 = new HashMap<String,String>();
        b2.put("a","");
        b2.put("b","candy");
                                 
        boolean case2 = mapBully(b1).equals(b2);
        
        Map<String,String> c1 = new HashMap<String,String>();
        c1.put("a","candy");
        c1.put("b","carrot");
        c1.put("c","meh");
        Map<String,String> c2 = new HashMap<String,String>();
        c2.put("a","");
        c2.put("b","candy");
        c2.put("c","meh");
        boolean case3 = mapBully(c1).equals(c2);
        
        return (case1 && case2 && case3);
    }
    
   public Map<String,String> topping1(Map<String,String> map){
       
       for (String k : map.keySet())
           if (k.equals("ice cream"))
                   map.put(k,"cherry");
     
       
       map.put("bread","butter");
       return map;
   }
   
   private boolean topping1Test(){
       /**
        * Given a map of food keys and topping values, modify and return the 
        * map as follows: if the key "ice cream" is present, 
        * set its value to "cherry". 
        * In all cases, set the key "bread" to have the value "butter".
        */
       
       Map<String,String> a1 = new TreeMap<String,String>();
       a1.put("ice cream","peanuts");
       Map<String,String> a2 = new TreeMap<String,String>();
       a2.put("bread","butter");
       a2.put("ice cream","cherry");
       
       boolean case1 = a2.equals(topping1(a1));
       
       Map<String,String> b1 = new TreeMap<String,String>();
       b1.put("bread","butter");
       
       boolean case2 = b1.equals(topping1(b1));
       
       Map<String,String> c1 = new TreeMap<String,String>();
       c1.put("pancake","syrup");
       Map<String,String> c2 = new TreeMap<String,String>();
       c2.put("bread","butter");
       c2.put("pancake","syrup");
       
       boolean case3 = c2.equals(topping1(c1));
       
       return (case1 && case2 && case3);    
   }//end topping1Test()
   
   public Map<String,String> mapShare(Map<String,String> map) {
       /**
        * Modify and return the given map as follows: if the key "a" has a value, 
        * set the key "b" to have that same value. 
        * In all cases remove the key "c", leaving the rest of the map unchanged.
        */
       
       
       if (map.containsKey("a"))
           map.put("b", map.get("a"));
       if (map.containsKey("c"))
           map.remove("c");
       
       return map;
           
   }//end mapShare
   
   private boolean mapShareTest(){
       Map<String,String> a1 = new LinkedHashMap<String,String>();
       a1.put("a","aaa");
       a1.put("b","bbb");
       a1.put("c","ccc");
       Map<String,String> a2 = new LinkedHashMap<String,String>();
       a2.put("a","aaa");
       a2.put("b","aaa");
       
       
       boolean case1 = a2.equals(mapShare(a1));
       
       Map<String,String> b1 = new LinkedHashMap<String,String>();
       b1.put("b","xyz");
       b1.put("c","ccc");
       Map<String,String> b2 = new LinkedHashMap<String,String>();
       b2.put("b","xyz");
       
       boolean case2 = b2.equals(mapShare(b1));
       
       Map<String,String> c1 = new LinkedHashMap<String,String>();
       c1.put("a","aaa");
       c1.put("c","meh");
       c1.put("d","hi");
       Map<String,String> c2 = new LinkedHashMap<String,String>();
       c2.put("a","aaa");
       c2.put("b","aaa");
       c2.put("d","hi");
       
       //boolean case3 = c2.equals(mapShare(c1));
       
      
       return( case1 && case2);
       
   }//end mapShareTest

   public Map<String,String> topping2(Map<String,String>map){
       /**
        * Given a map of food keys and their topping values, modify and 
        * return the map as follows: 
        * if the key "ice cream" has a value, 
        * set that as the value for the key "yogurt" also. 
        * If the key "spinach" has a value, change that value to "nuts".
        */
       if (map.containsKey("ice cream"))
           map.put("yogurt",map.get("ice cream"));
       if (map.containsKey("spinach"))
           map.put("spinach", "nuts");
       return map;
   } 
   
   private boolean topping2Test(){
       Map<String,String> a1 = new HashMap<String,String>();
       a1.put("ice cream","cherry");
       Map<String,String> a2 = new HashMap<String,String>();
       a2.put("yogurt","cherry");
       a2.put("ice cream","cherry");
       
       boolean case1 = a2.equals(topping2(a1));
       
       Map<String,String> b1 = new HashMap<String,String>();
       b1.put("spinach","dirt");
       b1.put("ice cream","cherry");
       Map<String,String> b2  = new HashMap<String,String>();
       b2.put("yogurt","cherry");
       b2.put("spinach","nuts");
       b2.put("ice cream","cherry");
       
       boolean case2 = b2.equals(topping2(b1));
       
       Map<String,String> c1 = new HashMap<String,String>();
       c1.put("yogurt","salt");
       Map<String,String> c2 = new HashMap<String,String>();
       c2.put("yogurt","salt");
       
       boolean case3 = c2.equals(topping2(c1));
       
       return (case1 && case2 && case3);
       
       
   }
   
   public Map<String,String> mapAB(Map<String,String> map){
       /**
        * Modify and return the given map as follows: 
        * for this problem the map may or may not contain the "a" and "b" keys. 
        * If both keys are present, append their 2 string values together 
        * and store the result under the key "ab".
        */
       if(map.containsKey("a") && map.containsKey("b"))
           map.put("ab",map.get("a") + map.get("b"));
           
       
       return map;
   }
   
   private boolean mapABTest(){
       Map<String,String> a1 = new HashMap<String,String>();
       a1.put("a","Hi");
       a1.put("b","There");
       Map<String,String> a2 = new HashMap<String,String>();
       a2.put("a","Hi");
       a2.put("ab","HiThere");
       a2.put("b","There");
       
       boolean case1 = a2.equals(mapAB(a1));
       
       Map<String,String> b1 = new HashMap<String,String>();
       b1.put("a","Hi");
        Map<String,String> b2 = new HashMap<String,String>();
       b2.put("a","Hi");
       
       boolean case2 = b2.equals(mapAB(b1));
       
       Map<String,String> c1 = new HashMap<String,String>();
       c1.put("b","There"); 
       Map<String,String> c2 = new HashMap<String,String>();
       c2.put("b","There"); 
       
       boolean case3 = c2.equals(mapAB(c1));
       
       return (case1 && case2 && case3);
       
       
   }//end mapABTest
   
   
   public Map<String,Integer> word0(String[] strArray){
       /**
        * Given an array of strings, return a Map<String, Integer> containing a key 
        * for every different string in the array, always with the value 0. 
        * For example the string "hello" makes the pair "hello":0. 
        * We'll do more complicated counting later, 
        * but for this problem the value is simply 0.
        */
       
       int length = strArray.length;
       
       Map<String,Integer> map = new HashMap<String,Integer>();
       
       for(int i=0; i<length;i++);
            map.put(strArray[i],0);
       
       return map;
       
   }
   
   private boolean word0Test(){
   
      String[] strA = {"a","b","a","b"};
      Map<String,Integer> mapA = new HashMap<String,Integer>();
      mapA.put("a",0);
      mapA.put("b",0);
      
      boolean case1 = mapA.equals(word0(strA));
      
      String[] strB = {"a","b","a","c","b"};
      mapA.put("c",0);
      
      boolean case2 = mapA.equals(word0(strB));
      
      String[] strC = {"c","b","a"};
      
      boolean case3 = mapA.equals(word0(strC));
      
      return (case1 && case2 && case3);
      
   
              
   }
   
   
   public Map<String,Integer> wordCount(String[] strArray){
       
       /**
        * The classic word-count algorithm: 
        * given an array of strings, 
        * return a Map<String, Integer> with a key for each different string, 
        * with the value the number of times that string appears in the array.
        */
       
       int length = strArray.length;
       Map<String,Integer> map = new HashMap<String,Integer>();
       
       for (int i = 0; i<length; i++){
           if(map.containsKey(strArray[i]))
               map.put(strArray[i],(map.get(strArray[i])) + 1);
            
           else map.put(strArray[i],1);
           
       }
       return map;
   }
   
   private boolean wordCountTest(){
       String[] strA = {"a","b","a","c","b"};
       Map<String,Integer> mapA = new HashMap<String,Integer>();
       mapA.put("a",2);
       mapA.put("b",2);
       mapA.put("c",1);
       
       boolean case1 = mapA.equals(wordCount(strA));
       
       String[] strB = {"c","b","a"};
       mapA.put("a",1);
       mapA.put("b",1);
       mapA.put("c",1);
       
       boolean case2 = mapA.equals(wordCount(strB));
       
       String[] strC = {"c","c","c","c"};
       mapA.put("c",4);
       mapA.remove("a");
       mapA.remove("b");
       
       boolean case3 = mapA.equals(wordCount(strC));
      
       
       return (case1 && case2 && case3);    
       
   }
   
   public Map<String,Boolean> wordMultiple(String[] strArray){
       /**
        * Given an array of strings, 
        * return a Map<String, Boolean> where each different string is a key and 
        * its value is true if that string appears 2 or more times in the array.
        */
       
       int length = strArray.length;
       Map<String,Boolean> map = new HashMap<String,Boolean>();
       
       for(int i= 0; i<length; i++)
           //if the item is already i the map, it appears 2 or more times ->TRUE
           if (map.containsKey(strArray[i]))
                    map.put(strArray[i],true);
           //else first time in the map, initialize to FALSE;
           else map.put(strArray[i],false);
       
       return map;
       
   }
   
   private boolean wordMultipleTest(){
       String[] strA = {"a","b","a","c","b"};
       Map<String,Boolean> mapA = new HashMap<String,Boolean>();
       
       mapA.put("a", true);
       mapA.put("b",true);
       mapA.put("c",false);
       
       
       
       boolean case1 = mapA.equals(wordMultiple(strA));
       
       String[] strB = {"c","b","a"};
       mapA.put("a", false);
       mapA.put("b",false);
       mapA.put("c",false);
       
       boolean case2 = mapA.equals(wordMultiple(strB));
       
       String[] strC = {"c","c","c","c"};
       mapA.remove("a");
       mapA.remove("b");
       mapA.put("c",true);
       
       boolean case3 = mapA.equals(wordMultiple(strC));
       
       return (case1 && case2 && case3);
       
           
   }
   
   public String[] allSwap(String[] strArray){
       /**
        * We'll say that 2 strings "match" if they are non-empty and their first chars 
        * are the same. 
        * Loop over and then return the given array of non-empty strings as follows: 
        * if a string matches an earlier string in the array, 
        * swap the 2 strings in the array. 
        * When a position in the array has been swapped, 
        * it no longer matches anything. Using a map, 
        * this can be solved making just one pass over the array. 
        * More difficult than it looks.
        */
       
       int length = strArray.length;
       
       //The key is the string; The value is the index of the array to swap with
       Map<String,Integer> map = new HashMap<String,Integer>();
       
       for (int i = 0; i<length; i++){
         
           String firstLetter = strArray[i].substring(0,1);
           
           if(map.containsKey(firstLetter)) {
               //swap the current array value with thString temp1 = map.key(strArray[i]);
            
              int index = map.get(firstLetter);
             
              
              String temp1 = strArray[index];
              String temp2 = strArray[i];
              
              
              strArray[i] = temp1;
              strArray[index] = temp2;
              
             
               //remove the map entry because it cannot be swapped again.
               map.remove(firstLetter);
           }
           else map.put(firstLetter, i);
       }//end for
       
       return strArray;
       
   }
   
   private boolean allSwapTest(){
       String[] str1 = {"ab","ac"};
       String[] str2 = {"ac","ab"};
       
       String[] str3 = {"ax","bx","cx","cy","by","ay","aaa","azz"};
       String[] str4 = {"ay","by","cy","cx","bx","ax","azz","aaa"};
       
       String[] str5 = {"ax","bx","ay","by","ai","aj","bx","by"};
       String[] str6 = {"ay","by","ax","bx","aj","ai","by","bx"};
       
       boolean case1 = Arrays.equals(allSwap(str1),str2);
       boolean case2 = Arrays.equals(allSwap(str3),str4);
       boolean case3 = Arrays.equals(allSwap(str5),str6);
       
       return (case1 && case2 && case3);
               
   }
   
    public boolean practiceMapUnitTest(){
        
        if (!mapBullyTest()){
            System.out.println("mapBullyTest() is broken");
            return false;
        }
        
        if (!topping1Test()){
            System.out.println("topping1Test() is broken");
            return false;
        }
        
        if (!mapShareTest()){
            System.out.println("mapShareTest() is broken");
            return false;
        }
        
        if (!topping2Test()){
            System.out.println("topping2Test() is broken");
            return false;
        }
        
        if (!mapABTest()){
            System.out.println("mapABTest() is broken");
            return false;
        }
        
         if (!mapABTest()){
            System.out.println("mapABTest() is broken");
            return false;
        }
        
          if (!wordCountTest()){
            System.out.println("wordCountTest() is broken");
            return false;
        }
        if (!wordMultipleTest()){
            System.out.println("wordMultipleTest() is broken");
            return false;
        }
          
        if (!allSwapTest()){
            System.out.println("allSwapTest() is broken");
            return false;
        }
        
        return true;
    }
    
    
    public static void main(String args[]){
        PracticeMap m = new PracticeMap();
        if(m.practiceMapUnitTest())
            System.out.println("All is well");
        else System.out.println("errors");
    }
    
    
}
