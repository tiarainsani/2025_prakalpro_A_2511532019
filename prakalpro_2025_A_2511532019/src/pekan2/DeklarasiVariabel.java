package pekan2;

public class DeklarasiVariabel {
	static int umur = 25;
	public static void main(String[] args) {
		int kode;
		boolean isDibawahUmur; /* perhatikan penulisan nama variabel */
		kode=1234;/*pengisian variabel(assigment)*/
		double gaji;/*deklarasi variabel dapat dimana saja*/
		gaji=5500000.23;
		isDibawahUmur= true;
		System.out.println("Status:"+isDibawahUmur);
		System.out.println("kode:"+kode);
		System.out.println("umur:"+umur);
		System.out.println("gaji:"+gaji);
	}

}
