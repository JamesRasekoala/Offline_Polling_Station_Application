import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ArrayList;
public class HashApp 
{
public ArrayList<LinkedList> Create()
 throws Exception
{   
	     
      Scanner input  = new Scanner(new File("FakeNameGenerator.com_f89d32a4.csv"));

         int fileCount=1;
        HashTable store = new HashTable();
        LinkedList<Voter> voterList = new LinkedList<Voter>();
        ArrayList<LinkedList> voterArray = new ArrayList<LinkedList>();
        store.initiaList(voterList,voterArray );
        Voter voterData = new Voter();
         int loop=0;
         int c = 0; 
         while(input.hasNextLine()) {
         String line = input.nextLine();
         line.trim();
         String[] linearray = line.split(",");
         
         
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
              }

       c++;
      
      }
 
 
   
   


return(voterArray);
      }
      
      
      
      public static String findVoter(String person, ArrayList<LinkedList> array ){
     String i = person;
   String front = i.substring(0,6);
   String back = i.substring(6,13);
   Integer result1 = Integer.valueOf(front)%29;
   Integer result2 = Integer.valueOf(back)%29;
   int result = result1+result2;
   
   LinkedList<Voter> editlist = array.get(result);
   
    for (int j = 0; j < editlist.size(); j++) {
            Voter item = editlist.get(j);
            String newitem= (String) item.getID();
            
            if ((newitem).equals(person)){
			//System.out.println(newitem);
            return(newitem+" "+person);
                         }
            else  {   }
     
                                               }
  
  return("Voter Not Registered") ;                                                                        }  
      
      
      
      
      
      
      
      
      
      }
