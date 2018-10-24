package outputan;
import java.util.Scanner;

public class aisa_amelia_t_316 {
    public static void main(String[] args){
            int pil;
            
	Scanner s= new Scanner (System.in);
	
	do
            {
		System.out.println("1. Masukkan data");
		System.out.println("2. Tampilkan data");
		System.out.println("3. Keluar");
		
                System.out.print("Pilih : ");
                    pil=s.nextInt();
            }
	while(pil != 3);
    }
}
