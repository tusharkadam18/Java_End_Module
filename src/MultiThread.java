import java.io.*;
import java.util.*;
public class MultiThread extends Thread{

    static ArrayList<Integer> arr1 = new ArrayList<>();
    static ArrayList<Integer> arr2 = new ArrayList<>();

    @Override
    public void run() {
        if (currentThread().getName().equals("Seven")){
            try {
                System.out.println("The multiples of " + 7 + "till 100 are: ");
                for (int i = 1; i < 101; i++) {
                    int num = i * 7;
                    arr1.add(num);
                    Thread.sleep(100);
                    System.out.print(num + " ");
                }
                System.out.println();
            } catch (Exception ignored) {}
        } else if (currentThread().getName().equals("Five")) {
            try{
                System.out.println("The multiples of " + 5 + "till 100 are: ");
                for (int i = 1; i < 101; i++) {
                    int num = i * 5;
                    arr2.add(num);
                    Thread.sleep(100);
                    System.out.print(num + " ");
                }
                System.out.println();
            }catch (Exception ignored){}
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader source = new BufferedReader(new FileReader("E:\\JAVA_PROG\\Java End Module\\src\\MultiThread.java"));
        PrintWriter dest = new PrintWriter(new FileWriter("Question_1_Solution.txt"));

        String line = source.readLine();
        while (line != null){
            dest.println(line);
            line = source.readLine();
        }
        source.close();
        dest.close();

        Thread t1 = new MultiThread();
        t1.setName("Seven");
        Thread t2 = new MultiThread();
        t2.setName("Five");

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        arr1.retainAll(arr2);
        System.out.println("The common numbers are: ");
        for (Integer integer : arr1) {
            Thread.sleep(500);
            System.out.print(integer + " ");
        }
    }
}