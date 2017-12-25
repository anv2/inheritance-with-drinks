/*Beer class inherits from Drink class
@author Vithia An
 */

public class Beer extends Drink
{
   private final String name;          //name of drink
   private final String isCarbonated;  //whether drink is carbonated
   private final double content;       //alcohol content
   
   /*constructor
   @param name the name of the drink, 
   @param isCarbonated whether drink is carbonated
   @param content the alcohol content of the drink
   */
   public Beer(String name, String isCarbonated, double content)
   {
      this.name = name;
      this.isCarbonated = isCarbonated;
      this.content = content;
   }
   /*@return description of drink */
   @Override
   public String getDescription()
   {
      return String.format("%s, %s, %.2f %%.",
         getName(),
         isCarbonated(),
         getContent()
      );
   }
   /*@return name of drink */
   @Override
   public String getName()
   {
      return name;
   }
   /*@return whether drink is carbonated*/
   @Override
   public String isCarbonated()
   {
      return isCarbonated;
   }
   /*@return alcohol content of drink */
   public double getContent()
   {
      return content;
   }
   

}