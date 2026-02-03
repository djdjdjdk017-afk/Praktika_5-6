fun main()
{
    try
    {
        print("Введите количество пятерок: ")
        var P:Int = readln().toInt()
        while (P < 1)
        {
            println("Ошибка, количество оценок не может быть равно нулю или быть отрицательным")
            print("Введите количество пятерок: ")
            P = readln().toInt()
        }
        print("Введите количество четверок: ")
        var CH:Int = readln().toInt()
        while (CH < 1)
        {
            println("Ошибка, количество оценок не может быть равно нулю или быть отрицательным")
            print("Введите количество пятерок: ")
            CH = readln().toInt()
        }
        print("Введите количество троек: ")
        var TR:Int = readln().toInt()
        while (TR < 1)
        {
            println("Ошибка, количество оценок не может быть равно нулю или быть отрицательным")
            print("Введите количество пятерок: ")
            TR = readln().toInt()
        }
        print("Введите количество двоек: ")
        var DV:Int = readln().toInt()
        while (DV < 1)
        {
            println("Ошибка, количество оценок не может быть равно нулю или быть отрицательным")
            print("Введите количество пятерок: ")
            DV = readln().toInt()
        }
        var result:Int = P + CH + TR + DV
        println("Пятерок: $P\nЧетверок: $CH\nТроек: $TR\nДвоек: $DV\nВсего учеников в классе: $result")
    }
    catch (e:NumberFormatException)
    {
        println("Ошибка, неверный формат данных")
    }
}