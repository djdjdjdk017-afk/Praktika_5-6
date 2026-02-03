fun main()
{
    try
    {
    print("Введите свой возраст: ")
    var age:Int = readln().toInt()
    while (age < 0)
    {
        println("Возраст не может быть меньше 0")
        print("Введите свой возраст: ")
        age = readln().toInt()
    }
    when (age)
    {
        in 0..10 -> println("Ваша стадия жизни: Детство")
        in 11..17 -> println("Ваша стадия жизни: Отрочество")
        in 18..24 -> println("Ваша стадия жизни: Юность")
        in 25..39 -> println("Ваша стадия жизни: Взрослость")
        in 40..54 -> println("Ваша стадия жизни: Зрелость")
        in 55..100 -> println("Ваша стадия жизни: Старость")
        else -> println("Неопределенное значение")
    }
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}