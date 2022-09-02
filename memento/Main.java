package GOF.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History ht = new History();

        editor.setContent("a");
        ht.push(editor.createState());

        editor.setContent("b");
        ht.push(editor.createState());

        editor.setContent("c");
        editor.restore(ht.pop());
        editor.restore(ht.pop());



        System.out.println(editor.getContent());


    }
}
