package designpattern;

/*
 *
 */

import java.util.Arrays;
import java.util.List;

interface Iterator {
    boolean hasNext();
    Object next();
}

@FunctionalInterface
interface Container {
    Iterator iterator();
}

class NameRepository {

    private List<String> names = Arrays.asList("V705417", "W987622", "V987678", "Q123121");

    Container container = () -> new NameIterator();

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.size() ? true : false;
        }

        @Override
        public Object next() {
            return names.get(index++);
        }
    }
}

public class IteratorDesignPattern {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.container.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
