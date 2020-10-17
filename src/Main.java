import utils.Importable;
import static java.lang.System.out;

public class Main
{
    private final Importable rand = new Importable();
    private final int[] list = new int[10];
    public static void main(String[] args) {
        Main Main = new Main();
        Main.idk();
        pr(test());
        Main.howToForEach();
    }

    public void idk(){
        int a = this.rand.refreshNum();
        for(int i = 0; i<10; i++){
            int _a = this.rand.refreshNum();
            this.list[i] = _a;
            pr(Integer.toString(this.rand.num));
        }
    }

    public void howToForEach(){
        for(int rand: this.list){
            pr(Integer.toString(rand));
        }
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
