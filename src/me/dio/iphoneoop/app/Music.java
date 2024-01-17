package me.dio.iphoneoop.app;

/**
 * The Music interface represents a basic music app
 */
public interface Music extends App {

  /**
   * Plays the music
   */
  public void play();

  /**
   * Pauses the music
   */
  public void pause();

  /**
   * Stops the music
   */
  public void stop();

  /**
   * Advance to the next music
   */
  public void next();

  /**
   * Returns to the previous music
   */
  public void previous();

}
