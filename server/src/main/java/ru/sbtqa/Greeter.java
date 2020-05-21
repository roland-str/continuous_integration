package ru.sbtqa;

/**
 * Greeter class
 */
public class Greeter {

  /**
   * Constructor of Greeter class.
   */
  public Greeter() {

  }


  /**
   * method for greaating a preson.
   * @param name - name of a person
   * @return - greeeting
   */
  public final String greet(final String name) {
    return String.format("Hello, %s!", name);
  }
}
