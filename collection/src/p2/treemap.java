package p2;

import java.util.TreeMap;

// Student class
class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

// Key class (standalone)
class Key implements Comparable<Key> {
    int key;

    Key(int key) {
        this.key = key;
    }

    @Override
    public int compareTo(Key o) {
        return this.key - o.key;
    }

    @Override
    public String toString() {
        return "key"+this.key;
    }
}

 class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Key, Student> s1 = new TreeMap<>();

        s1.put(new Key(11), new Student(1, "Prashant", 80));
        s1.put(new Key(2), new Student(2, "Janhavi", 82));
        s1.put(new Key(7), new Student(7, "Parth", 90));

        System.out.println(s1);
    }
}
