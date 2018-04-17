import java.util.LinkedList;
import java.util.ArrayList;
import java.util.*; 


public class HashTable{
  /***
    This class is for implementing and puting togethere two different 
    data structres to put togethere a Hash Table
          
  
  ***/

   ArrayList<LinkedList> voterArray = new ArrayList<LinkedList>();
   LinkedList<Voter> voterList = new LinkedList<Voter>();
   /****
        Helps to add a null linked list in each slot
   ****/
public ArrayList<LinkedList> initiaList(LinkedList<Voter> list,ArrayList<LinkedList> array ) {
   for (int i=0;i<100;i++) {
	   list=null;
      array.add(list); 
                     }
               
    return ( array ); 
    }
    
    /***
      There four methods are to help acceces information of there two data structures
    ****/
  public ArrayList getArrayList(){
   return voterArray;
   }
   
    public void setArrayList(ArrayList<LinkedList> arraylist){
   voterArray = arraylist;
   }
   
     public LinkedList getLinkedList(){
   return voterList;
   }
   
    public void setLinkedList(LinkedList<Voter> list){
   voterList = list;
   }
   
   
   
public static int voterHashFunction(Voter person){
   String i = person.getID();
   String front = i.substring(0,6);
   String back = i.substring(6,13);
   Integer result1 = Integer.valueOf(front)%29;
   Integer result2 = Integer.valueOf(back)%29;
   int result = result1+result2;
   return(result);   }



public void insertVoter(Voter person, ArrayList<LinkedList> array ){
	 int key = this.voterHashFunction(person);
	 if( array.get(key) == null ){
		 
		
		 LinkedList<Voter> addList = new LinkedList<Voter>();
		 addList.add(0,person);		 
		 array.add(key,addList);
		
		 }else{
			LinkedList<Voter> linked = array.get(key);
			linked.add(person);
			array.add(key,linked);
			
			                                 
			 }
		
System.out.println(array);

	 }
	 
	 
	
	
	 
	 

/*

public static boolean findVote(String person, ArrayList<LinkedList> array ){
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
            if ((newitem).compareTo(person)>0){
            return(true);              }
            else  {   }
     
                                               }
  
  return(false) ;                                                                        }  */ 
 
   
   
}
