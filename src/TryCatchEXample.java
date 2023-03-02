public class TryCatchEXample {

    public static void main(String[] args) {

        try {
            int[] a = {4, 5, 7};
            System.out.println(a[2]);// try with the index--- go by 0,1,2,---

        } catch (Exception e) {

            System.out.println("An exception happened");
        }

    }
}
