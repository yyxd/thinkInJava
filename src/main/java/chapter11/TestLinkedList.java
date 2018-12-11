package chapter11;

import org.junit.Test;

import java.io.FileReader;
import java.util.LinkedList;

/**
 * Created by HinTi on 2018/11/29.
 * Goal:
 */
public class TestLinkedList {
    @Test
    public void testLL() {
        LinkedList<Integer> testList = new LinkedList<>();
        //        testList.element();//抛出NoSuchElement的异常
//        testList.getFirst();//抛出NoSuchElement的异常
        Integer p =  testList.peek();// 返回null

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : nums)
            testList.add(i);

        System.out.println(testList.pop());
        System.out.println(testList.remove());

//        testList.addFirst(10);
//        testList.addLast(11);
//        System.out.println(testList.element());
//        System.out.println(testList.getFirst());
//        System.out.println(testList.peek());
        System.out.println(testList.getLast());
        System.out.println(testList.remove());
        testList.removeFirst();
        testList.removeLast();
        testList.peekFirst();
        testList.offer(3);

        System.out.println(testList.poll());
        System.out.println(testList.pop());
//        System.out.println();
    }

}
