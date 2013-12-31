/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 12/31/13
 * Time: 4:04 PM
 */
public class MyOuter {
    private int x = 7;

    MyInner inner = new MyInner();

    public void seeInner() {
        inner.seeOuter();
    }

    private class MyInner {
        private int i;
        private String string;


        public void seeOuter() {
            System.out.println(x);
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }

    public static void main(String[] args) {

        final MyOuter outer = new MyOuter();
        outer.seeInner();
        MyOuter.MyInner myInner = outer.new MyInner();
        myInner.seeOuter();

        MyOuter.MyInner myInner1 = new MyOuter().new MyInner();
        myInner1.seeOuter();


    }


}
