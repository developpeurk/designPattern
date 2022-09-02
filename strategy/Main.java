package GOF.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("f",new PngCompressor(),new BlackAndWhiteFilter() );
        imageStorage.store("f",new JpegCompressor(),new BlackAndWhiteFilter() );
    }
}
