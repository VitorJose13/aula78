import java.util.LinkedList;

public class LinkedList01 {
    
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<String>();

        names.add("Vitor");
        names.add("Pedro");
        names.add("Maik");
        names.add("Gil");
        names.add("Vitor");
        names.add("Pedro");
        names.add("Maik");
        names.add("Gil");

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.remove(3);
        names.remove("Pedro");

        System.out.println("Com nomes removidos:");
        System.out.println(names);
    }

}
