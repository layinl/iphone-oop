package me.dio.iphoneoop;

import me.dio.iphoneoop.app.Browser;
import me.dio.iphoneoop.app.Music;
import me.dio.iphoneoop.app.Phone;

public class IPhone implements Music, Browser, Phone {

  private final String name;

  public IPhone() {
    name = "iphone";
  }

  public IPhone(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("Playing music on " + name);
  }

  @Override
  public void pause() {
    System.out.println("Paused");
  }

  @Override
  public void stop() {
    // ♪ PLEASE DON'T STOP THE MUSIC ♪
    System.out.println("Stopped");
  }

  @Override
  public void next() {
    System.out.println("Next music");
  }

  @Override
  public void previous() {
    System.out.println("Previous music");
  }

  @Override
  public void navigate(String url) {
    System.out.println(STR."Loading \{url}...");
  }

  @Override
  public void call(String number) {
    System.out.println(STR."Calling \{number}...");
  }

  @Override
  public void answer() {

  }

  @Override
  public void run(String app) {
    System.out.println(STR."Running \{app}");
  }
}
