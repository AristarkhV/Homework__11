package mateacademy.homework.homework_11;

import java.util.EmptyStackException;
import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference<T> {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        System.out.println("First set:");
        for (T t : set1) {
            System.out.print(t + " ");
        }
        System.out.println("\nSecond set:");
        for (T t : set2) {
            System.out.print(t + " ");
        }

        System.out.println();
        HashSet temp = new HashSet<>();
        temp.addAll(set1);
        temp.removeAll(set2);

        HashSet result = new HashSet<>();
        result.addAll(set2);
        result.removeAll(set1);

        temp.addAll(result);
        return temp;
    }

    public void print(Set<? extends T> set) {
        if (set.isEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("symmetric difference:");
        for (T t : set) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> second = new HashSet<>();

        first.add(1);
        first.add(2);
        first.add(3);

        second.add(0);
        second.add(1);
        second.add(2);

        SymmetricDifference<Integer> result = new SymmetricDifference();
        result.print(result.symmetricDifference(first, second));
        System.out.println( );
    }
}
