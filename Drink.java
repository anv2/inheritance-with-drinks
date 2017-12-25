/*
Drink class as an abstract class
@author Vithia An
*/

public abstract class Drink
{
   public abstract String getName();      //name of drink
   
   public abstract String isCarbonated(); //whether drink is carbonated
  
  /*prints description of drink. 
  @return description of drink */
   public String getDescription()         
   {
  
         return String.format("%s, %s.\n",
         getName(), 
         isCarbonated()
         );
   
   }

}

