public class view1 {
    public static void main(String[] args) {
        dog dg=new dog("fst=",500);
       // dg.dog("gooog",4);
        //dg.outloc();
        System.out.println(dg.getName());
        System.out.println(dg.getCount());

        //dog dp= new dog();

        dg.setName("second");
        dg.setCount(10000);
        System.out.println(dg.getName());
        System.out.println(dg.getCount());

    }
}
