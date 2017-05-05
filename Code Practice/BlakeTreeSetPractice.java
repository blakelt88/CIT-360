
/*
** BlakeTreeSetPractice
** Blake Turley
*/

import java.util.*;
class BlakeTreesetPractice {
 public static void main(String args[]){
 
  TreeSet<String> blakeTest=new TreeSet<String>();
  blakeTest.add("Ravi");
  blakeTest.add("Vijay");
  blakeTest.add("Ravi");
  blakeTest.add("Ajay");

  Iterator<String> imaTree=blakeTest.iterator();
  while(imaTree.hasNext()){
   System.out.println(imaTree.next());
  }
 }
}