package ch14.lamda.lamda01;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = new SamInterface() {
            @Override
            public void run() {
                System.out.println("SAM");
            }
        };
        SamInterface samInterface02 = () -> {
            System.out.println("SAM02");
        };



        samInterface.run();
        samInterface02.run();
    }
}
