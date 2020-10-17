import utils.Importable;
import static java.lang.System.out;

public class Main
{
    private final Importable rand = new Importable();
    public static void main(String[] args) {
        Main Main = new Main();
        Main.idk();
    }

    public void idk(){
        int a = this.rand.refreshNum();
        for(int i = 0; i<10; i++){
            pr(Integer.toString(this.rand.num));
            this.rand.refreshNum();
        }
        pr(Integer.toString(a));
    }

    public static String test()
    {
        return "gulag";
    }

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static void pr(String a)
    {
        out.println(a);
    }
}
