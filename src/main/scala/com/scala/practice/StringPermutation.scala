package com.scala.practice

/**
  * Created by skola on 7/20/2017.
  */
object StringPermutation {
  def main(args: Array[String]): Unit = {

    println("Enter String 1 ")

    val input = scala.io.StdIn.readLine().toCharArray

    println("Enter String 2 ")

    val input1 = scala.io.StdIn.readLine().toCharArray

    val result =
    {

      input.length.toChar.isWhitespace != input1.length.toChar.isWhitespace
    }

    if (result == true)
      println("Does not matches")
    else
    println("Matches")

  }
}
