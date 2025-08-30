import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    Queue<Integer> q;

    public MyQueue() {
        q = new LinkedList<>(); // Queue initialize
    }

    public void push(int x) {
        q.add(x); // Queue मध्ये element add करा
    }

    public int pop() {
        return q.remove(); // Queue चा front element remove करून return करा
    }

    public int peek() {
        return q.peek(); // Queue चा front element return करा, remove करू नका
    }

    public boolean empty() {
        return q.isEmpty(); // Queue रिकामा आहे का तपासा
    }
}

/**
 * Usage Example:
 * MyQueue obj = new MyQueue();
 * obj.push(10);
 * obj.push(20);
 * System.out.println(obj.peek());   // 10
 * System.out.println(obj.pop());    // 10
 * System.out.println(obj.empty());  // false
 */
