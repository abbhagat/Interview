package morganstanley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class GenericComparator<T> implements Comparator<T> {

    private String property;

    public GenericComparator(String property) {
        this.property = property;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("david"));
        list.add(new Student("adam"));
        System.out.println(list);
        Collections.sort(list, new GenericComparator<>("getName"));
        System.out.println(list);
    }

    @Override
    public int compare(T t1, T t2) {
        return getComparable(t1).compareTo(getComparable(t2));
    }

    private Comparable getComparable(Object o) {
        try {
            Object invoke = o.getClass().getMethod(property, new Class[]{}).invoke(o, new Class[]{});
            return ((Comparable) invoke);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

}
