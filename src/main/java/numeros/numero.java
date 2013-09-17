package numeros;

public class numero {
	private int tam = 100;
	
	public void imprimir(){
		for(int i=1;i<=tam;i++){
			
			if(esMultiplo3(i)&&esMultiplo5(i)){
				System.out.println("FizzBuzz");
			}else if(esMultiplo5(i)){
					System.out.println("Buzz");
				}else if(esMultiplo3(i)){
						System.out.println("Fizz");
					}else{
						System.out.println(i);
					}
		}
	}
	
	public boolean esMultiplo3(int num){
		if (num%3==0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean esMultiplo5(int num){
		if (num%5==0){
			return true;
		}else{
			return false;
		}
	}
	
}

