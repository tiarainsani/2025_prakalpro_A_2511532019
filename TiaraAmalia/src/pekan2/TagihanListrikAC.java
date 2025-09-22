package pekan2;

public class TagihanListrikAC{
	public static void main (String[] args) {
	
	//Data pemakaian AC 
	int jamPemakaian=8;//jam per hari
	float dayaAC=0.85f;//kwh per jam
	int jumlahHari=30;//hari dalam sebulan
	char tipeAC='A'; //Tipe AC

	//Hitung total pemakaian listrik 
	float totalKwhAC=jamPemakaian*dayaAC*jumlahHari;
	//Data tagihan listrik
	float tarifPerKwh=1500.5f;//tarif listrik (Rp/kwh)
	boolean sudahBayar=false;//status pembayaran
	//Hitung total tagihan
	float totalTagihan=totalKwhAC*tarifPerKwh; 
	
	
	//output data AC
	System.out.println("===Data Pemakaian AC===");
	System.out.println("Jam Pemakaian:"+jamPemakaian+"jam/hari");
	System.out.println("Daya AC:"+dayaAC+"kwh/jam");
	System.out.println("Jumlah Hari:"+jumlahHari);
	System.out.println ("Tipe AC:"+tipeAC);
	System.out.println("Total pemakaian:"+totalKwhAC+"kwh/bulan");
	
	
	//output tagihan
	System.out.println("\n===TagihanListrik Bulanan===");
	System.out.println("Tarif per Kwh:Rp"+tarifPerKwh);
	
	if(sudahBayar) {
		System.out.println("Status Tagihan Lunas");
		System.out.println("Total Tagihan:Rp0");
	} else {
		System.out.println("Status Tagihan Belum Dibayar");
		System.out.println("Total Tagihan:Rp"+totalTagihan);
	}
	}
}

	
	
	
	
