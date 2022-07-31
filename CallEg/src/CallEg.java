class CallEg
{
    public void methodA() throws Exception
    {
//        System.out.println("I'm in MethodA()");
        try {
            methodB();
        } catch (Exception oops) {
            System.out.println("in method A()");
            oops.printStackTrace();
        }
    }

    public void methodB() throws Exception
    {
//        try {
            methodC();
//        } catch (Exception oops) {
//            System.out.println("in method B()");
//            oops.printStackTrace();
//        }
    }

    public void methodC() throws Exception
    {
        throw new Exception();
    }
}

