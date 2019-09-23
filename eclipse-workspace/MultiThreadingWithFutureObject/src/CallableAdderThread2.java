import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class CallableAdderThread2 implements Callable<Object> {
	int op1, op2;

	public CallableAdderThread2(int op1, int op2) {
		this.op1 = op1;
		this.op2 = op2;
		// System.out.println("called"+op1);
	}

	public Object call() {

		process();
		return null;
	}

	public int[] init() {
		int[] ar = new int[] { op1, op2 };
		return ar;
	}

	public void process() {// System.out.println("calling child");
		List<Future> ar= new ArrayList<>();
		System.out.println("hi");
		System.out.println(ar.get(0));
		// return ar;
	}
}
