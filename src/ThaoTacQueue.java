import java.util.LinkedList;
import java.util.Queue;

public class ThaoTacQueue<a> {
    void enqueue(int a[], int index, int x) {
        a[index] = x;
        index++;
    }

     int dequeue(int a[], int index) {
        if (index == 0) {
            return -1;
        } else {
            int x = a[0];
//            lap phan tu a[0]
            for (int i = 0; i < index - 1; i++) {
                a[i] = a[i + 1];
            }
            return x;
        }
    }

    void dequeueAll(int a[], int index) {
        while (index > 0) {
            int x = dequeue(a, index);
            System.out.printf("%d\n",x);

        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(3);
        queue.add(6);
        queue.add(9);

        for (int s : queue) {
            System.out.println(s);
        }
        queue.remove(6);
        System.out.println("sau khi xoa");
        for (int s : queue) {
            System.out.println(s);
        }
    }
}
