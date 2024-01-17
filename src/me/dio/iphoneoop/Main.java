package me.dio.iphoneoop;

/**
 * This program simulates the iPhone functionalities
 */
public class Main {

  public static void main(String[] args) {
    IPhone iPhoneX = new IPhone("layin");
    iPhoneX.run("browser");
    iPhoneX.navigate("https://x.com");
  }

}