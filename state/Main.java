package GOF.state;

public class Main {
    public static void main(String[] args) {
     Canvas cb = new Canvas();
     cb.setCurrentTool(new Section());
     cb.mouseDown();
     cb.mouseUp();

     cb.setCurrentTool(new Brush());
     cb.mouseUp();
     cb.mouseDown();


    }
    public static void CanvasUI(Tool ui){
       new Section().mouseDown();

    }
}
