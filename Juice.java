/*Juice class inherits from Drink
@author Vithia An
 */

public class Juice extends Drink
{
   private final String name;          //name of drink
   private final String isCarbonated;  //whether drink is carbonated
   private final String made;          //made from what
   
   /*constructor
   @param name the name of the drink, 
   @param isCarbonated whether drink is carbonated
   @param made - what the drink is made from
   */
   public Juice(String name, String isCarbonated, String made)
   {  this.name = name;
      this.isCarbonated = isCarbonated;
      this.made = made;
   
   }
   /*@return name of drink */
   @Override
   public String getName()
   {
      return name;
   }
   /*@return whether drink is carbonated */
   @Override
   public String isCarbonated()
   {
      return isCarbonated;
   }
   /*@return what drink is made from */
   public String getMade()
   {
      return made;
   }
   /*@return description of drink */
   @Override 
   public String getDescription()
   {
      return String.format("%s, %s, %s ",
         getName(),
         isCarbonated(),
         getMade()
      
      );
   
   }
   


}