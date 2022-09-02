package GOF.state;


public  class Section implements Tool{

    @Override
    public void mouseDown() {
            System.out.println("Draw Dashed Rectangle Section Mouse Down");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw Dashed Reactangle Section Mouse UP");
    }
}
