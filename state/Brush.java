package GOF.state;

public class Brush implements Tool{


    @Override
    public void mouseDown() {
            System.out.println("Draw Line mouse Down Brush");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw Line Mouse Up Brush");
    }
}
