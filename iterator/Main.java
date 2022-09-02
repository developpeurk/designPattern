package GOF.iterator;



public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");
        history.push("e");
        history.push("f");
        //System.out.println(history.getUrls());


       Iterator iterator = history.createIterator();
//        System.out.println(iterator.current());
//        iterator.next();
//        System.out.println(iterator.current());
//        iterator.next();
//        System.out.println(iterator.current());


        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
