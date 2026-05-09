package QueueDSA;

//public class queueImplement {
//}
//



class QueueArray {

    int[] arr = new int[5];
    int front = -1;
    int rear = -1;

    // Enqueue
    void enqueue(int data) {

        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;

        System.out.println(data + " inserted");
    }

    // Dequeue
    void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " removed");
        front++;
    }

    // Peek
    void peek() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Front = " + arr[front]);
    }

    // Display
    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();

        q.peek();
    }
}