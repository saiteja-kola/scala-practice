package com.scala.practice

/**
  * Created by skola on 7/20/2017.
  */
object F2C {

  def main(args: Array[String]): Unit = {

    println("Enter Temperature In Fahrenheit: ")

    val fah = scala.io.StdIn.readDouble()


    val cal = (fah - 32) * 5/9

    println("Temperature In Celsius:" +cal)
  }

}
