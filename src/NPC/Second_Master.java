package NPC;

public class Second_Master implements Runnable{

	@Override
	public void run() {	
		System.out.print("[2�� ������] : ");
		
	String[] m2 = {"��","��","��","��","��"," ","��","��","��"," ","��","��","ã","��","��","��","��",".",".",".\n\n\t\t"
						,"��","��","��"," ","��","��"," ","��","��","��","�� "," ","��","��","��",".",".",".",".\n\n\t\t"
						,"��","��","��","��"," ","��","��"," ","'�� '","��"," ","��","��","��","��","��",".",".",".",".\n\n\t\t"
						,"��","��","��"," ","��","��"," ","��","��","��","��"," ","��","��","��"," ","��","��","��","��","��\n\n\t\t"
						};
	
	
		for(int i = 0; i<m2.length;i++) {
			System.out.print(m2[i]);
		

	
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {}
	}
	}		
}