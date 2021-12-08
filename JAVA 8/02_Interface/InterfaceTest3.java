public class InterfaceTest3 implements InterfaceTest,InterfaceTest2{


    @Override
    public void do1() {
        System.out.println("override do1");
    }

    @Override
    public void doThing() {
        System.out.println("override doThing");
    }

    //也可以Override default的方法
    @Override
    public void do2(){
        System.out.println("override do2");
    }

    //多重繼承有同方法強制重寫，但可以用super去call
    @Override
    public void do3() {
        InterfaceTest.super.do3();
        InterfaceTest2.super.do3();
    }

}
