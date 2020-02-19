package ru.lean.weather.dto;

import java.time.LocalDate;
import java.util.Date;

public class WeatherData {

  private LocalDate date;

  private int temperature;

  //влажность
  private int humidity;

  //Давление
  private int pressure;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public void setHumidity(int humidity) {
    this.humidity = humidity;
  }

  public int getPressure() {
    return pressure;
  }

  public void setPressure(int pressure) {
    this.pressure = pressure;
  }
}
