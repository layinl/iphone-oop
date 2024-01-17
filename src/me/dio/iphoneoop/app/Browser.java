package me.dio.iphoneoop.app;

/**
 * The Browser interface is the Internet Browser App
 * that simulates a website request using url
 * @see App
 */
public interface Browser extends App {

  /**
   * Sends a site request using the url
   * @param url the site url
   */
  public void navigate(String url);

}
