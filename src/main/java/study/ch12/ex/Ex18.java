package study.ch12.ex;

import java.util.Arrays;
import java.util.logging.Level;

interface Sortable {
    void sort();
    void printResult();
}

class NumberSorter implements Sortable {
    int[] nums;
    NumberSorter(int[] nums) {
        this.nums = Arrays.copyOf(nums, nums.length);
    }

    @Override
    public void sort() {
        Arrays.sort(nums);
    }

    @Override
    public void printResult() {
        System.out.println(nums);
    }
}

class StringSorter implements Sortable {
    String[] strings;

    @Override
    public void sort() {
        Arrays.sort(strings);
    }

    @Override
    public void printResult() {
        System.out.println(strings);
    }
}

public class Ex18 {

}
