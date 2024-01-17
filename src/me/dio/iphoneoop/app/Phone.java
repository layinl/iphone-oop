package me.dio.iphoneoop.app;

/**
 * The Phone interface represents a basic phone app
 * @see App
 */
public interface Phone extends App {

  /**
   * Calls a typed number
   * @param number the phone number
   */
  public void call(String number);

  /**
   * Receives a call
   */
  public void answer();

}
