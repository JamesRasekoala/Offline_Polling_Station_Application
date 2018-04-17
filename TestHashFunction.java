import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ArrayList;
public class TestHashFunction{
public static void main(String[] args)
         throws Exception
                                       {
      Scanner input  = new Scanner(new File("FakeNameGenerator.com_f89d32a4.csv"));


        HashTable store = new HashTable();
        LinkedList<Voter> voterList = new LinkedList<Voter>();
        ArrayList<LinkedList> voterArray = new ArrayList<LinkedList>();
        store.initiaList(voterList,voterArray );
        Voter voterData = new Voter();
         int loop=0;
         while(input.hasNextLine()) {
         String line = input.nextLine();
         line.trim();
         String[] linearray = line.split(",");
         
         if(loop>0){
              if (3<=linearray.length ){
              String newID = linearray[0];
              voterData.setVoter(linearray[1],linearray[2],newID);
              store.insertVoter(voterData, voterArray ); 
              loop++;  
   }
              else{
              String newID = linearray[0];
              voterData.setVoter(linearray[1],newID);
              store.insertVoter(voterData, voterArray );
              loop++;
              }}else{loop++;}
              
              
              // end of while loop below
      }

   }

      }
