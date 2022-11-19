object task_a extends App {

  val my_str: String = "Hello, Scala!"

  println(my_str.reverse)
  println(my_str.toLowerCase())

  val new_str: String = my_str.replace("!", "")

  println {
    new_str
  }
  println(new_str + " and goodbye python!")

}