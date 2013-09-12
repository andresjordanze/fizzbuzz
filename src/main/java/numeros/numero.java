package numeros;

public class numero {
	private int tam = 100;
	
	public void imprimir(){
		for(int i=1;i<=tam;i++){
			
			if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
		}
	}
}

