fun main()
{
    try
    {
    print("Введите число: ")
    var n:Int = readln().toInt()
    while (n>9 || n<0)
    {
        println("Число вне диапазона значений")
        print("Введите число: ")
        n = readln().toInt()
    }
    when (n)
    {
        0 -> println("Ноль")
        1 -> println("Один")
        2 -> println("Два")
        3 -> println("Три")
        4 -> println("Четыре")
        5 -> println("Пять")
        6 -> println("Шесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
    }
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}