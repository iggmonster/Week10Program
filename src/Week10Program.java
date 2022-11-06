import java.io.*;
import java.util.Scanner;

/*
@author Keiffer Button
Class: CS1131 Accelerated Intro to Programming
Lab: L01
 */
public class Week10Program {
    private static QueueEmptyException InvalidQueueException;

    public static void main(String[] args) throws InvalidQueueException, IOException, QueueEmptyException {
        new BufferQueue();
        //testWhatever();
        BufferQueue bufferQueue = new BufferQueue();

        Scanner in = new Scanner(System.in);
        System.out.println("Input file name (ex: example.txt): ");
        File file = new File(in.nextLine());
        //System.out.println(file);


        BufferedReader br = new BufferedReader(new FileReader(file));
        Character ch = null;

        //System.out.println(br.read());
        //while ((ch = (char) br.read()) != '\0' ){
        //    System.out.println(ch);
        //}


        int int1 = 0;
        int int2 = 0;
        int i = 0;
        int size = 0;

        try {
            while (br.ready()) {

                //System.out.println((char) br.read());
                if (i < 2) {
                    //System.out.println( Character.getNumericValue((char) br.read()));
                    if (i == 0) {
                        int1 = Character.getNumericValue((char) br.read());
                    } else if (i == 1) {
                        int2 = Character.getNumericValue((char) br.read());

                        String s1 = Integer.toString(int1);
                        String s2 = Integer.toString(int2);
                        String s = s1 + s2;
                        size = Integer.parseInt(s);
                        //System.out.println("Size: " + size);
                        bufferQueue.bufferSize(size);

                        if (size == 0){
                            throw InvalidQueueException;
                        }
                    }
                    i++;
                } else {
                    for (int j = 0; j < size; j++) {
                        bufferQueue.enqueue((char) br.read());
                    }
                    //System.out.println(BufferQueue.bufferToString());
                    for (int j = 0; j < size; j++) {
                        System.out.print(bufferQueue.dequeue());
                    }
                    System.out.println();
                    //bufferQueue.clearQueue();
                }
            }
        }catch (Exception e){
            throw InvalidQueueException;
        }
    }
}
