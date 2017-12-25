/*driver class to test program
@author Vithia An
 */

public class TestDrink
{
   public static void main(String[] args)
   {
      /*Not in array list: */
      Drink juice = new Juice("Orange Juice","not carbonated","made from oranges.");
      System.out.println(juice.getDescription());
      
      Drink beer = new Beer("Budweiser", "carbonated", 5.0);
      System.out.println(beer.getDescription());
      
      Drink soda = new Soda("Pepsi","carbonated");
      System.out.println(soda.getDescription());
      
      /* In array list: */
      /* polymorphic processing follows */
      /* make new object of CreateEvent */
      CreateEvent ce = new CreateEvent();
      
      ce.addDrink(juice);
      ce.addDrink(beer);
      ce.addDrink(soda);
      
      Drink[] dr = new Drink[3];//create array of 3 elements
      dr[0] = juice;
      dr[1] = beer;
      dr[2] = soda;
      
      /*print statements */
      int i=0;
      for(i = 0; i < dr.length; i++ )
      {
        
         System.out.println( dr[i].getDescription() );
      } 
      
      
   }
   

}