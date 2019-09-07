
class Operaciones {

	int a[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
	int b[] = { 1, 2, 5, 7, 10, 14, 25, 35, 50, 70, 175, 350 };
	String a1;
	String b1;

	public void union() {
		int u = 0;
		String v = "";
		String b2 = "";

		for (int i = 1; i < b.length; i++) {
			b2 = b2 + b[i] + ",";
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

				} else {
					u = u + 1;
				}
			}
			if (u == b.length) {
				v = v + a[i] + ",";
			}
			u = 0;
		}
		v = v + b2;
		System.out.println(v);

	}

	public void interseccion() {
		int u = 0;
		String v = "";

		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

				} else {
					u = u + 1;
				}
			}
			if (u < b.length) {
				v = v + a[i] + ",";
			}
			u = 0;
		}

		System.out.println(v);

	}

	public void diferencia() {
		int u = 0;
		String v = "";

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

				} else {
					u = u + 1;
				}
			}
			if (u == b.length) {
				v = v + a[i] + ",";
			}
			u = 0;
		}
		System.out.println(v);
	}
}

public class Conjuntos {

	public static void main(String[] args) {

		Operaciones op = new Operaciones();
		System.out.print("Union: ");
		op.union();
		System.out.print("interseccion: ");
		op.interseccion();
		System.out.print("Diferencia: ");
		op.diferencia();

	}

}
