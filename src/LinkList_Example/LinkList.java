package LinkList_Example;

public class LinkList
{//указатель на 1 элемент
    private Link first; // ref to first link on list
    // -------------------------------------------------------------
    public LinkList() // constructor
    {
        first = null; // no items on list yet
    }
    // -------------------------------------------------------------
//проверка. Является ли список  пустым
    public boolean isEmpty() // true if list is empty
    {
        return (first==null);
    }
    // -------------------------------------------------------------
// insert at start of list
// вставить в начало списка
    public void insertFirst(int id, double dd)
    { // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old first
        first = newLink; // first --> newLink
    }
    // -------------------------------------------------------------
    public Link deleteFirst() // delete first item
    { // (assumes list not empty)
        Link temp = first; // save reference to link
        first = first.next; // delete it: first-->old next
        return temp; // return deleted link
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while(current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }

    public Link find(int i) {
        return null;
    }

    public Link delete(int i) {
    return null;
    }

// -------------------------------------------------------------
} // end class LinkList
////////////////////////////////////////////////////////////////