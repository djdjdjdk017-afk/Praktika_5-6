fun main()
{
    try
    {
        print("Первый конверт:\nВведите длину конверта: ")
        val a:Double = readln().toDouble()
        print("Введите высоту конверта: ")
        val b:Double = readln().toDouble()
        print("\nВторой конверт:\nВведите длину конверта: ")
        val c:Double = readln().toDouble()
        print("Введите высоту конверта: ")
        val d:Double = readln().toDouble()
        when
        {
            (a <= b && b < d || a <= d && b <= c) -> println("Первый конверт можно вложить во второй")
            (c <= a && d <= b || c <= b && d <= a) -> println("Второй конверт можно вложить в первый")
            (a == c && b == d || a == d && b == c) -> println("Конверты одинакового размера")
            else -> println("Конверты нельзя вложить друг в друга")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}