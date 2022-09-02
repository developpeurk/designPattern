package GOF.iterator;


import java.util.Arrays;

public class BrowseHistory {
    private int count;
    //private List<String> urls = new ArrayList<>();

    private String[] urls = new String[10];

    public void push(String url){
        urls[count++] = url;
    }

    public String pop(){
        return urls[--count];
        //  int lastIndex = urls.size()-1;
        //String lastUrl = urls.get(lastIndex);
        // urls.remove(lastUrl);
    }



//    public List<String> getUrls() {
//        return urls;
//    }

    public Iterator createIterator(){
        //return new ListIterator(this);
        return new ArrayIterator(this);
    }

    private class ListIterator implements Iterator{
        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history){
            this.history = history;
        }

    @Override
    public boolean hasNext() {
       // return (index < history.getUrls().size());

        return (index < history.urls.length);
    }

    @Override
    public String current() {
       // return history.urls.get(index);

        return history.urls[index];
    }

    @Override
    public void next() {
        index++;
    }
}

    private class ArrayIterator implements Iterator{
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}


