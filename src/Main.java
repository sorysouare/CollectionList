import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList al= new ArrayList<>();
        al.add(12);
        al.add("My school is horizon");
        al.add(123.4f);
        al.add('d');
        System.out.println(al.lastIndexOf('d'));
        System.out.println(al.isEmpty());
        System.out.println(al.contains(12));
        for (int i = 0; i < al.size() ; i++) {
            System.out.println("Index :"+i+" = "+al.get(i));
        }
    }
}