import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAdder implements Callable<Object> {
	int op1, op2;

	public CallableAdder(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
		// System.out.println("called 1");
	}

	public Object call() {

		init();
		return null;
	}

	public int[] init() {
		int[] ar = new int[] { op1, op2 };
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.submit(new CallableAdderThread2(op1, op2));
		return ar;
	}

	public int[] process(int[] ar) {
		return ar;
	}
}
