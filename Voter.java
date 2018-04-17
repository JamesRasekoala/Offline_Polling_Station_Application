public class Voter{
   
   String firstName;
   String secondName;
   String ID; 
   int count=0; 
   
   
   
   public int getCount(){
   return count;
   
   } 
   
   
   public void Voter(){
   firstName = "Null";
   secondName = "NuLL";
   ID="100000000";
   }
   
   public void setVoter(String firstNameC , String secondNameC, String IDC ){
   firstName = firstNameC;
   secondName = secondNameC;
   ID=IDC;
   }
   
   
   public void setVoter(String firstNameC , String IDC ){
   firstName = firstNameC;
   secondName = "Null";
   ID=IDC;
   }
   
   public String getFirstName(){
   return firstName;
   }

 
   public String getSecondName(){
   return secondName;
   }
  
   public String getID(){
   return ID;
   }
   
   public String toString()
   {
   if (this.getSecondName()=="Null"){
   return (ID+" "+firstName);
   }else{
    return (ID+" "+firstName+" "+secondName);}
   }
   
   
   
   
   
public boolean compareTo(Object othernode) {
      String node = (String) othernode;
    if (this.compareTo(node)) {
        return true;
    }else{
    return false;}
}   
   






}
