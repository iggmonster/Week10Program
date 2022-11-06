import java.util.LinkedList;

public class BufferQueue implements QueueInterface{

    //public int last;

    //private static Character[] queue;
    private static LinkedList<Character> queuell;
    public int limit;

//constructor
    public void bufferSize(int sizeLimit ){

        //queue = new Character[sizeLimit];
        limit = sizeLimit;
    }

    public BufferQueue(){
        queuell = new LinkedList<>();
        //last = 0;
    }


    @Override
    public void enqueue(Object element) throws QueueFullException {
        //queue[last] = (Character) element;
        //last++;
        //System.out.println("Before: " + queuell.toString());
        queuell.addLast((Character) element);
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        return queuell.poll();
    }

    @Override
    public Object peek() throws QueueEmptyException {
        return queuell.peek();
    }

    @Override
    public boolean isEmpty() {
        if (queuell.peekFirst() == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (queuell.size() == limit){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public int size() {
        return queuell.size();
    }

    public int getSizeLimit(){
        //return queue.length;
        return queuell.size();
    }

    public static String bufferToString(){
        //return Arrays.toString(queue);
        return queuell.toString();
    }

    public void clearQueue(){
        queuell.clear();
    }
}
