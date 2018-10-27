public class ArrayList implements List {

	protected Object[] arr;
	protected int size;

	public ArrayList() {
		arr = new Object[10];
		size = 0;
	}

	public void grow() {
		Object[] b = new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			b[i] = arr[i];
		}
		arr = b;
	}

	public void add(Object obj) {
		if (size == arr.length)
			grow();
		arr[size++] = obj;
	}

	public void add(int pos, Object obj) {
		if (size == arr.length)
			grow();
		for (int i = size - 1; i > pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = obj;
		size++;
	}

	public Object get(int pos) {
		return arr[pos];
	}

	public Object remove(int pos) {
		Object temp = arr[pos];
		for (int i = pos; i < size - 1; i++)
			arr[i] = arr[i + 1];
		size--;
		return temp;

	}
	public int size() {
		return size;
	}
}