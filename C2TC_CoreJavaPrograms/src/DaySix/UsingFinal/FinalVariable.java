package DaySix.UsingFinal;

public class FinalVariable {
    final int x = 100;
    final static int Y;    final static int Z = 10;

    void change() {
        System.out.println("Cannot modify final variables.");
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + "]";
    }

    static {
        Y = 20; 
       System.out.println("Value of Y: " + Y);
    }


    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        System.out.println(fv);
        fv.change();
    }
}