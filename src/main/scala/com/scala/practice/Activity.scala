/**
  * Created by skola on 7/20/2017.
  */
package com.scala.practice

object Activity {

  def main(args: Array[String]): Unit = {

    println("Please enter number of calories to burn between (0-1000) : ")

    val calories = scala.io.StdIn.readDouble()

    if(calories <=230)
      println("Please do run activity")

    else if(calories<= 500)
  println("Please do swimming activity")
    else if (calories<= 700)
         println("Please do biking activity")
  }

}
