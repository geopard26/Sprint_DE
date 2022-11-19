object task_b extends App {
  import scala.io.StdIn.readLine

  println("Введите размер заработанной платы за год (руб.):")
  val my_salary: Int = readLine().toInt

  println("Введите размер премии за год (%):")
  val bonus: Float = readLine().toFloat

  println("Введите размер компенсации за питание за год (руб.):")
  val eat: Int = readLine().toInt

  println("Размер подаходного налога на ЗП в РФ - 13%.")

  println("Размер заработанной платы в месяц после вычета налога:")
  println(((my_salary * (1 + bonus / 100) + eat) / 12) * 0.87)

}