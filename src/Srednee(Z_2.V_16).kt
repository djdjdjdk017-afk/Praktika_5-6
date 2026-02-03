fun main()
{
    try
    {
    print("Введите первое число: ")
    val a:Int = readln().toInt()
    print("Введите второе число: ")
    val b:Int = readln().toInt()
    print("Введите третье число: ")
    val c:Int = readln().toInt()
    var result:Int
    result = when
    {
        (a >= b && a <= c) || (a >= c && a <= b) ->  a
        (b >= a && b <= c) || (b >= c && b <= a) ->  b
        else ->  c
    }
    println("Среднее число: $result")
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}