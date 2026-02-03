fun main()
{
    try {
        print("Введите х: ")
        var x: Double = readln().toDouble()
        var result:Double
        if (x < 7)
        {
            result = -3 * x +9
            println("Ответ: $result")
        }
        else
        {
            if (x == 7.0)
            {
                println("Ошибка, деление на 0")
            }
            else
            {
                result = 1 / (x-7)
                println("Ответ: $result)")
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}