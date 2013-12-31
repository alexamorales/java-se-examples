/**
 * Created with IntelliJ IDEA.
 * User: Oleksii.Lisun
 * Date: 10/23/13
 * Time: 6:05 PM
 */
public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends  Number> void inspect(U u){
        System.out.println("T:" + t.getClass().getName());
        System.out.println("U:" + u.getClass().getName());
    }


}
