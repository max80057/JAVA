import java.util.ArrayList;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        //遍覽
//        list.stream().forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        System.out.println("");
        //條件遍覽
//        list.stream().filter(s -> s < 7).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s < 7).forEach(System.out::println);
    }

}
