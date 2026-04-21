package ch07.lang.ex4_21;

public class ex10 {
    public static void main(String[] args) {
        String[]arr= {"100","200","hello","300","java","400"};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                count++;
            } catch (NumberFormatException e) {

            }

        }


        System.out.println("count = " + count);
    }
}
