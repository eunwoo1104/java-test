package utils;

import java.util.Random;

public class Importable {
    Random rand = new Random();
    public int num = 1;

    public int refreshNum() {
        this.num = this.rand.nextInt();
        return this.num;
    }
}
