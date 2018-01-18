package testThis;

public class TestThis {
	int i = 0;
	TestThis(int i){
		this.i = i;
	}
	TestThis increament() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i = "+i);
	}
	public static void main(String[] args) {
		TestThis var = new TestThis(10);
		var.increament().increament().print();
	}
}
