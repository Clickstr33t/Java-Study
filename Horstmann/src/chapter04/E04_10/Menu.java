package chapter04.E04_10;
import java.util.Scanner;

/**
   A menu that is displayed on a console.
*/
public class Menu
{
   private String menuText;
   private int optionCount;
   private String index = "ABCDEFGHILMNOPQRSTUVZ";

   /**
      Constructs a menu with no options.
   */
   public Menu()
   {
      menuText = "";
      optionCount = 0;
   }

   /**
      Adds an option to the end of this menu.
      @param option the option to add
   */
   public void addOption(String option)
   {
      menuText = menuText + index.substring(optionCount, optionCount+1) + ") " + option + "\n";
      optionCount = optionCount + 1;
   }
   
   /**
      Displays the menu on the console.
   */
   public void display()
   {
      System.out.println(menuText);
   }
}

