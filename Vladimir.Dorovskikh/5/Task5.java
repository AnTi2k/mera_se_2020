import com.mera.training.dorovskikh.joy.PersonJoy;
import com.mera.training.dorovskikh.suprematism.Suprematism;

/**
 * Перечисления, интерфейсы и исключения
 * 1. Абстрактный супрематизм
 * Создать абстрактный класс Figure, описывающий фигуру на двумерной плоскости с декартовыми координатами центра x,y.
 * В классе объявить абстрактный метод square, который вычисляет площадь фигуры.
 * В классе объявить и реализовать метод getQuadrant(), который возвращает четверть на координатной плоскости, в которой лежит центр фигуры.
 * Для описания четверти используйте Enum с четырьями значениями: I,II,III,IV
 *
 * Создать классы-наследники:
 * Circle - дополнительный параметр радиус, от 0 до 10
 * Rectangle - дополнительные параметры ширина и высота, от 0 до 20.
 * В каждом классе определить метод square, чтобы он правильно считал площадь.
 * в main'e создать массив на 5 элементов типа Figure, заполните любыми фигурами (не обязательно случайными), выведите все фигуры в формате
 * "Название фигуры - площадь"
 * 
 * 2. Сезонные радости
 * Создайте enum Season с 4 временами года.
 * Создайте enum Games с 4 играми.
 * В каждое время года можно играть ровно в одну игру:
 * Зима - снежки
 * Весна - запуск корабликов по ручьям
 * Лето - собирание и поедание ягод
 * Осень - измерение глубины луж методом "сапога"
 * Создайте класс Person. У него есть имя и любимый сезон.
 * Создайте массив на 10 элементов с людьми со случайными именами и любимыми сезонами.
 * Для каждого человека выведите любимую игру.
 * Рекомендации:
 * в Season определите дополнительное поле - игра для сезона.
 */
public class Task5 {
    public static void main(String[] args) {
        Suprematism.main();
        PersonJoy.main();
    }
}
