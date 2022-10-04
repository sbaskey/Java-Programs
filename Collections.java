import java.util.*;

public class Collections {
    public static void main(String[] args) {

//        Arraylist implementation.Adding elements and retrieving
        ArrayList<Integer> arrlist=new ArrayList<>();

        for(int i=0;i<5;i++)
        {
            arrlist.add(i);
        }
        Iterator<Integer> it=arrlist.iterator();
        System.out.println("Arraylist elements");
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");

        }


//        Linked List


        LinkedList<Integer> linklist=new LinkedList<>();
        linklist.add(1);
        linklist.add(2);
        linklist.add(3);

        Iterator<Integer> it1=linklist.iterator();
        System.out.println();
        System.out.println("Linked list elements");

        System.out.print(linklist.get(0)+" " + linklist.get(1)+" "+ linklist.get(2));


//        Hashset

        HashSet<String> HS=new HashSet<>();
        HS.add("BBS");
        HS.add("KOL");
        HS.add("HYD");

        Iterator<String> Hit=HS.iterator();
        System.out.println();
        System.out.println("HashSet elements");
        while (Hit.hasNext())
        {
            System.out.print(Hit.next() + " ");

        }

//        Hashmap

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(1,"a");

        System.out.println();
        System.out.println("Hashmap elements");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }


//        Linked Hashset
        LinkedHashSet<String> LHS=new LinkedHashSet<>();
        LHS.add("BBS");
        LHS.add("KOL");
        LHS.add("HYD");
        Iterator<String> LHit=HS.iterator();
        System.out.println();
        System.out.println(" LinkedHashSet elements");
        while (LHit.hasNext())
        {
            System.out.print(LHit.next() + " ");

        }


    }
}
