import java.time.Year
import java.util.StringJoiner

/*fun main() //Вывод информации
{
    println("Ivan")
    println(35)
    println(true)
}*/
/*fun main() // Работа с переменными
{
    var number: Int = 5;
    var char: Char = 'F';
    var str: String = "Hello";
    var double: Double = 90.2;
    val read: Int = 67;
    print(str)
}*/
/*fun main() // Разделение числа на символы
{
    val number: String = readLine().toString()
    val result = number.toCharArray().joinToString (",")
    print(result)
}*/
/*fun main() // Работа с числами
{
    val number = 2642
    var year: Int = number/365
    var weak: Int = (number - year*365)/7
    var day: Int = (number - weak*7 - year*365)

    println("Лет: $year Недель: $weak Дней: $day")
}*/
/*fun main() // Нахождение числа
{
    var num: Int = readLine()!!.toInt()
    print("$num${num*2}")
}*/
fun main() // Работа с переменными
{
    val name: String = readLine().toString();
    val age: Int = readLine()!!.toInt();
    print("Привет, $name! Тебе уже $age")
}
