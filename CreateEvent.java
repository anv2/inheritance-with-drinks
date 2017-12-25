/*
CreateEvent class makes array list  
@author Vithia An
*/

import java.util.ArrayList; //needed for ArrayList class
import java.util.List;

public class CreateEvent
{
   private String newDrink;       //name of drink
   private ArrayList<Drink> list ; //container
   
   /*constructor to make array*/
   public CreateEvent()   
   {  
      list = new ArrayList<Drink>();
   }
   /*@param drink to be added to list */
   public CreateEvent(String newDrink)   
   {  
      this.newDrink = newDrink;
      list = new ArrayList<Drink>();
   }

   /* Add drink to container
   @param drink to be added to list*/
   public boolean addDrink(Drink newDrink)     
   {
      list.add(newDrink);
      return true;
   }
}