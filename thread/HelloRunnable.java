public class HelloRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Hello from " + Thread.currentThread().getName() + " cread by implementing Runnable interface.");
    }
}
