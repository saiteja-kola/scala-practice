package com.scala.practice

/**
  * Created by skola on 7/20/2017.
  */
object CompareString {
  def main(args: Array[String]): Unit = {

    println("Enter a string 1")

    val input = scala.io.StdIn.readLine()

    println("Enter a string 2")

    val input1 = scala.io.StdIn.readLine()

    val result =  input.equalsIgnoreCase(input1)

    if(result== true)
    println("Matches")
    else println("Does not matches")



  }
}
