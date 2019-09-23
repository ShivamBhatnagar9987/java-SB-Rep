import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainThread {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new CallableAdder(10, 20));
		// Future<int[]> future = es.submit(new CallableAdder(10, 20));
		// int[] i = future.get();
		// System.out.println(i[0]);
	}

}
