package com.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String[] args) {

        /*ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("def");

        Iterator itr = names.iterator();
        names.add("ghi");

        while (itr.hasNext())
            System.out.println(itr.next());*/

        // itr.next() in the above code throws concurrentModificationException because it looks for any change in the list.
        // Because we are adding "ghi" to names after assigning the iterator, it will through concurrentModificationException

        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("abc");
        copyOnWriteArrayList.add("def");

        Iterator itr2 = copyOnWriteArrayList.iterator();
        copyOnWriteArrayList.add("ghi");
     //   copyOnWriteArrayList.listIterator().add("hef"); CopyOnWriteArrayList iterator doesn't allow add, remove. set gives unspoortedOperationException
        while (itr2.hasNext())
            System.out.println(itr2.next());

        System.out.println("Iterate after adding new element...");
        // Iterate after adding the new element
        itr2 = copyOnWriteArrayList.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());
    }
}
