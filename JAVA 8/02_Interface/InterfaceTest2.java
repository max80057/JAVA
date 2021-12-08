public interface InterfaceTest2 {

    public void doThing();

    default public void do3(){
        System.out.println("test2 do3");
    }
}
