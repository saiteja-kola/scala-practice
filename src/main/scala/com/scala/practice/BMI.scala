/**
  * Created by skola on 7/20/2017.
  */


package com.scala.practice


object BMI{


  def main(args: Array[String]): Unit = {

    println("Please Enter Your Weight: ")

    val lbs = scala.io.StdIn.readDouble()
    println("Please Enter Your Height In Inches: ")

    val height = scala.io.StdIn.readDouble()


    val bmi = lbs/(height*height) * 703

    if(bmi<18.5)
      println("Under Weight")
    else if(bmi< 25)

      println("Normal Weight")
    else println("Over Weight")
  }
}
