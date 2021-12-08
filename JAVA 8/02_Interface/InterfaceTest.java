public interface InterfaceTest {

    public void do1();

    //可以用default寫一個方法，後面不一定要重寫此方法
    default public void do2(){
        System.out.println("do2");
    }

    default public void do3(){
        System.out.println("test do3");
    }

}
