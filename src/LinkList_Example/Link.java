package LinkList_Example;

public class Link
{
    public int iData; // data item (key)
    public double dData; // data item
    public Link next; // next link in list
    // -------------------------------------------------------------
    public Link(int id, double dd) // constructor
    {
        iData = id; // initialize data
        dData = dd; // (‘next’ is automatically
    } // set to null)
    // -------------------------------------------------------------
    public void displayLink() // display ourself
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
} // end class Link
////////////////////////////////////////////////////////////////

//    В классе LinkList описаны методы для работы со списком:

//    Основная программа

////////////////////////////////////////////////////////////////

//    Следующий пример программы добавляет методы :
//        •	метод для поиска в связанном списке элемента с  указанным значением ключа ;
//        •	метод удаление элемента с указанным значением ключа.


//Литература
//        Р. Лафоре Структуры данных

