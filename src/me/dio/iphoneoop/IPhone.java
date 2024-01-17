package me.dio.iphoneoop;

import me.dio.iphoneoop.app.Browser;
import me.dio.iphoneoop.app.Music;
import me.dio.iphoneoop.app.Phone;

/**
 * The IPhone class simulates an iPhone and all of
 * its apps
 */
public class IPhone implements Music, Browser, Phone {

  private final String name;
  private boolean isPhoneRunning;
  private boolean isMusicRunning;
  private boolean isBrowserRunning;

  /**
   * Checks if the specified app is running
   * @param app the app to be checked
   * @return true if app is running, false
   * otherwise
   * @throws IllegalStateException if the
   * specified app does not exist
   */
  private boolean checkIfRunning(String app) {
    return switch(app) {
      case "phone" -> isPhoneRunning;
      case "music" -> isMusicRunning;
      case "browser" -> isBrowserRunning;
      default -> throw new IllegalStateException("Unexpected value: " + app);
    };
  }

  public IPhone() {
    name = "iphone";
    isPhoneRunning = false;
    isMusicRunning = false;
    isBrowserRunning = false;
  }

  public IPhone(String name) {
    this.name = name;
    isPhoneRunning = false;
    isMusicRunning = false;
    isBrowserRunning = false;
  }

  @Override
  public void play() {
    if(checkIfRunning("music"))
      System.out.println("Playing music on " + name);
    else System.out.println("Music not running");
  }

  @Override
  public void pause() {
    if(checkIfRunning("music"))
      System.out.println("Paused");
    else System.out.println("Music not running");
  }

  @Override
  public void stop() {
    // ♪ PLEASE DON'T STOP THE MUSIC ♪ //
    if(checkIfRunning("music"))
      System.out.println("Stopped");
    else System.out.println("Music not running");
  }

  @Override
  public void next() {
    if(checkIfRunning("music"))
      System.out.println("Next music");
    else System.out.println("Music not running");
  }

  @Override
  public void previous() {
    if(checkIfRunning("music"))
      System.out.println("Previous music");
    else System.out.println("Music not running");
  }

  @Override
  public void navigate(String url) {
    if(checkIfRunning("browser"))
      System.out.println(STR."Loading \{url}...");
    else System.out.println("Browser not running");
  }

  @Override
  public void call(String number) {
    if(checkIfRunning("phone"))
      System.out.println(STR."Calling \{number}...");
    else System.out.println("Phone not running");
  }

  @Override
  public void answer() {
    if(checkIfRunning("phone"))
      System.out.println("Answering call...");
    else System.out.println("Phone not running");
  }

  @Override
  public void run(String app) {
    System.out.println(STR."Running \{app}");
    switch(app.toLowerCase()) {
      case "phone" -> isPhoneRunning = true;
      case "music" -> isMusicRunning = true;
      case "browser" -> isBrowserRunning = true;
      default -> System.out.println(STR."\{app} not installed");
    }
  }

  @Override
  public String toString() {
    return STR."IPhone{name: '\{name}\{'\''}\{'}'}";
  }
}
