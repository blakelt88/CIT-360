
/*
** BlakeMapPractice
** Blake Turley
*/

import java.util.*;  
class BlakeMapPractice{  
 public static void main(String args[]){  
  Map<Integer,String> blakeMap=new HashMap<Integer,String>();  
  blakeMap.put(100,"Amit");  
  blakeMap.put(101,"Vijay");  
  blakeMap.put(102,"Rahul");  
  for(Map.Entry bmp:blakeMap.entrySet()){  
   System.out.println(bmp.getKey()+" "+bmp.getValue());  
  }  
 }  
} 