import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ArrayList;
//import java.util.Enumeration;

public class HashFunction{
   String[] theArray;
   Voter[] voterArray= new Voter[200];
   
  

   int arraySize;
   int itemsInArray=0;
   public static void main(String[] args)
   throws Exception
   {
      Scanner input  = new Scanner(new File("VotersDataFile.csv"));
      HashFunction theFunc = new HashFunction(30);
      HashFunction theVoterFunc = new HashFunction(100);
      
      
      
      // how new code will work
      
      HashTable store = new HashTable();
        
           ArrayList<LinkedList> voterArray = new ArrayList<LinkedList>();
            LinkedList<Voter> voterList = new LinkedList<Voter>();
        store.initiaList(voterList,voterArray);
        Voter the = new Voter();
        the.setVoter("John","Whesliey","4711065990085");
        //voterArray.insertVoter(the);
        System.out.println(voterArray.size());
       int num = store.voterHashFunction(the);
        LinkedList just = voterArray.get(num);
        just.add(the);
        System.out.print(the+"one printed out end");
         voterData.setVoter("John","Whesliey","3610107224084");
      
      
      
      
      
      
      
      
      
      
      
      
      Voter theVoter = new Voter();
      theVoter.setVoter("John","Whesliey","145114");
      //System.out.println(theVoter);
      String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };
       int n =0;
      while(input.hasNextLine()) {
      
     // System.out.println("while");
         String line = input.nextLine();
         line.trim();
         String[] linearray = line.split(";");
         //System.out.println(linearray[0]);
              if (3<=linearray.length ){
              // correct ID format
              String newID = linearray[0];
              newID = newID.substring(0,13);
              theVoter.setVoter(linearray[1],linearray[2],newID);
              System.out.println(getKeyIndex(linearray[1])+" index for "+linearray[1]+" "+linearray[2]+" "+newID);
              int arrayIndex = getKeyIndex(linearray[1]);
             //  voterArray[arrayIndex] = theVoter; 
   }
              // System.out.println("if");
             // System.out.println(theVoter);

              else{
              // System.out.println("else");
              String newID = linearray[0];
              newID = newID.substring(0,13);
              theVoter.setVoter(linearray[1],newID);
              System.out.println(getKeyIndex(linearray[1])+" index for "+linearray[1]+" "+newID);
             int  arrayIndex = getKeyIndex(linearray[1]);
             // voterArray[arrayIndex] = theVoter; 
             // System.out.println(theVoter);
              } 
              Voter[] votersToAdd = {theVoter}; 
            //  voterArray[0]=theVoter;
              //voterhashFunction
               System.out.println("ready to insert"+theVoter);
               n=n+1;
              if(n==1){
                }else{
                  theVoterFunc.voterHashFunction(theVoter);
                  System.out.println("********************************");
               // theVoterFunc.voterHashFunction(votersToAdd, theVoterFunc.voterArray);
                              
                 
             // theVoterFunc.displayTheStack();
         }   
      //theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);
     // theFunc.findKey("660");
       //theFunc.findKey("660");
     // String[] elementsToAdd ={"16","1","5","17","21","26"};
      // Function in main to add to hash table
      //theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
    //  theFunc.displayTheStack();
     //  theVoterFunc.displayTheStack(); 
   }
    //still main

   
   } 
   public void hashFunction2(String[] stringsForArray, String[] theArray ){
      for (int n = 0; n< stringsForArray.length; n++){
         String newElementVal =stringsForArray[n];
         int arrayIndex = Integer.parseInt(newElementVal)%29;
        // System.out.println("Modulus Index = "+ arrayIndex + " for value "+newElementVal);
         while(theArray[arrayIndex]!= "-1"){
            ++arrayIndex;
            //System.out.println("Colloision Try "+arrayIndex+" Instead");
            arrayIndex%= arraySize;       
         }
         theArray[arrayIndex] = newElementVal;
      }}     
       public static Integer getKeyIndex(String key) {
        int hash = 7;
    for (int i = 0; i < key.length(); i++) {
      hash = (hash*31 + key.charAt(i))%100;}
     return hash;} 
     
         
   public void voterHashFunction( Voter newElementVal ){
         int arrayIndex = getKeyIndex(newElementVal.getFirstName());
        // System.out.println("Modulus Index = "+ arrayIndex + " for value "+newElementVal);
         voterArray[arrayIndex] = newElementVal;
      }      
  /* public void voterHashFunction(Voter[] stringsForArray, Voter theArray ){
      for (int n=0; n < stringsForArray.length ; n++){
         Voter newElementVal =stringsForArray[n];
         //String newElementVal = newElement.getFirstName();
         System.out.println("Func");
         theArray[Integer.parseInt(newElementVal.getID())] = newElementVal;
      }
   
   }*/
   
   //underconstruction
     /* public String findVoter(String key){   
      int arrayIndex = getKeyIndex(key);
      while(theArray[arrayIndexHash]!= "-1"){
         if(theArray[arrayIndexHash]== key){
            System.out.println(key+ "was Found in index "+ arrayIndexHash);
         return (theArray[arrayIndexHash]);
         }
         ++arrayIndexHash;
         arrayIndexHash%= arraySize;
      }
      return null;
   
   }*/
   
   
   
   
   public String findKey(String key){   
      int arrayIndexHash = Integer.parseInt(key)%29;
      while(theArray[arrayIndexHash]!= "-1"){
         if(theArray[arrayIndexHash]== key){
            System.out.println(key+ "was Found in index "+ arrayIndexHash);
         return (theArray[arrayIndexHash]);
         }
         ++arrayIndexHash;
         arrayIndexHash%= arraySize;
      }
      return null;
   
   }
   
   
   
   public void hashFunction1(String[] stringsForArray, String[] theArray ){
      for (int n=0; n < stringsForArray.length ; n++){
         String newElementVal =stringsForArray[n];
         theArray[Integer.parseInt(newElementVal)] = newElementVal;
      }
   
   }
   
   
   /* public void*/ HashFunction(int size){
      
      arraySize = size;
      theArray = new String[size];
      Arrays.fill(theArray,"-1");
   
   }

 public void displayTheStack() {
        int increment = 0;
        for (int m = 0; m < 3; m++) {
            increment += 10;
            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                System.out.format("| %3s " + " ", n);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                if (theArray[n].equals(" "))
                    System.out.print("|      ");
                else
                    System.out.print(String.format("| %3s " + " ", voterArray[n]));
 
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
 
        }
 
    }




  /* public void displayTheStack(){
      int increment = 0;
   }*/


  }