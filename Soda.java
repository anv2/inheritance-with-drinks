/*Soda class inherits from Drink class 
@author Vithia An
*/

public class Soda extends Drink
{
   private final String name;          //name of drink
   private final String isCarbonated;  //whether drink is carbonated
   
   /*constructor
   @param name the name of the drink, 
   @param isCarbonated whether drink is carbonated
   */
   public Soda(String name, String isCarbonated)     
   {
      this.name = name;
      this.isCarbonated = isCarbonated;
   }
   /*getter method for name
   @return name of drink */
   @Override
   public String getName()
   {
      return name;
   }
   /*getter method for whether drink is carbonated 
   @return isCarbonated to show if drink is carbonated */
   
   @Override
   public String isCarbonated()
   {
      return isCarbonated;
   }
   
}