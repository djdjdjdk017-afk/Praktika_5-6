fun main()
{
    try {
        print("Введите трехзначное число: ")
        var n: Int = readln().toInt()
        while (n < 100 || n > 999) {
            println("Введенное значение вне диапазона значений")
            print("Введите трехзначное число: ")
            n = readln().toInt()
        }
        var nach: Int = n / 100
        var kon: Int = n % 10
        when
        {
            (nach == kon) -> println("Число является палиндромом")
            else -> println("Число НЕ является палиндромом")
        }
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}