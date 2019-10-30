package com.example;

  /**
    javadoc comment
    **/
public class Greeter {

  /**constructeur**/
  public Greeter() {
  

  }
/**methode bonjour
@return message coucou

**/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
