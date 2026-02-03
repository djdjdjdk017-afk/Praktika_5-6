    fun main()
    {
        try
        {
            var n1:Double = readln().toDouble()
            var n2:Double = readln().toDouble()
            when
            {
                (n1 > n2) -> n1+=1
                (n2 > n1) -> n2+=1
                else -> n1 *= n1 * n1
            }
            println("Первое число: $n1\nВторое число: $n2")
        }
        catch (e:NumberFormatException)
        {
            println("Ошибка, неверный формат данных")
        }
    }