package test;

import com.sun.deploy.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description LinkedList集合所有方法的演示
 * @Author WuYiLong
 * @Date 2021/12/7 9:34
 */
public class TLinkedList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三", "李四", "王五");
        LinkedList<String> arrList = new LinkedList<>(list);
        System.out.println("集合元素->"+arrList);

        // removeFirstOccurrence
//        boolean a = arrList.removeFirstOccurrence("张");
//        System.out.println("删除后的数组->"+arrList);
//        String firstItem = arrList.getFirst();
//        System.out.println("获取集合第一个元素->"+firstItem);
//        String lastItem = arrList.getLast();
//        System.out.println("获取集合最后一个元素->"+lastItem);
//        String removeFirst = arrList.removeFirst();
//        System.out.println("删除第一个元素->"+removeFirst+"\t删除后的集合->"+arrList);
//        String removeLast = arrList.removeLast();
//        System.out.println("删除最后一个元素->"+removeLast+"\t删除后的集合->"+arrList);
//        arrList.addFirst("张三");
//        System.out.println("添加后的集合->"+arrList);
//        arrList.addLast("王五");
//        System.out.println("添加后的集合->"+arrList);
//        String s = arrList.set(0, "老六");
//        System.out.println("被替换的元素->"+s+"\t替换后的集合->"+arrList);
//        String peek = arrList.peek();
//        System.out.println("返回第一个元素->"+peek);
//        String element = arrList.element();
//        System.out.println("返回第一个元素->"+element);
//        boolean isTrue = arrList.contains("张三");
//        System.out.println("返回真假->"+isTrue);
//        int size = arrList.size();
//        System.out.println("列表的长度->"+size);
//        arrList.add("张三");
//        System.out.println("添加元素后的列表->"+arrList);
//        String removeItem = arrList.remove();
//        System.out.println("删除第一个元素->"+removeItem+"\t删除后的集合->"+arrList);
//        arrList.remove("李四");
//        System.out.println("删除元素后的集合->"+arrList);
//        String removeItem2 = arrList.remove(0);
//        System.out.println("返回删除的元素->"+removeItem2+"\t删除后的集合->"+arrList);
//        arrList.addAll(Arrays.asList("李四","王五"));
//        System.out.println("添加后的集合->"+arrList);
//        arrList.addAll(1, Stream.of("老六").collect(Collectors.toList()));
//        System.out.println("添加后的集合->"+arrList);
//        String item = arrList.get(0);
//        System.out.println("获取索引位置的元素->"+item);
//        arrList.add(0,"老五");
//        System.out.println("在索引位置添加元素后的集合->"+arrList);
//        int index = arrList.indexOf("李四");
//        System.out.println("返回元素第一次索引位置->"+index);
//        arrList.add("王五");
//        System.out.println("添加元素的后的集合->"+arrList);
//        int lastIndex = arrList.lastIndexOf("王五");
//        System.out.println("返回元素最后出现的索引位置->"+lastIndex);
//        String deleteFirst = arrList.poll();
//        System.out.println("删除第一个元素->"+deleteFirst+"\t删除后的集合->"+arrList);
//        arrList.offer("老七");
//        System.out.println("在尾部插入一个元素->"+arrList);
        // 数组倒序排
//        Iterator<String> stringIterator = arrList.descendingIterator();
//        stringIterator.forEachRemaining(v-> System.out.print("["+v+"]"));
        Spliterator<String> spliterator = arrList.spliterator();


        long exactSizeIfKnown = spliterator.getExactSizeIfKnown();
        System.out.println("确切大小:"+exactSizeIfKnown);
        long l = spliterator.estimateSize();
        System.out.println("估计大小："+l);
        int characteristics = spliterator.characteristics();
//        System.out.println("特征表示："+characteristics);
//        boolean b = spliterator.hasCharacteristics(16464);
//        System.out.println("检测特征："+b);
//        spliterator.forEachRemaining(v-> System.out.println(v));
        Spliterator<String> stringSpliterator = spliterator.trySplit();
        stringSpliterator.forEachRemaining(v-> System.out.println(v));

        boolean b1 = spliterator.tryAdvance(v -> {
            System.out.print("剩下元素:");
            System.out.println(v);
        });
        System.out.println("是否存在剩余元素:"+b1);
        spliterator.forEachRemaining(v-> System.out.println(v));


    }
}

