public abstract class Creator {
    public void someOperation() {
        Product p = this.createProduct();
        p.doSomething();
    }
    public abstract Product createProduct();
}
