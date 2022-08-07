public class FactoryMain {
    public static void main(String[] args) {

        LaptopFactory Lf = new LaptopFactory();
        Laptop Alaptop = Lf.getNewLaptop("Used");
        Alaptop.LaptopSpec();
    }
}
