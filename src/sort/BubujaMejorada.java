package sort;

public interface BubujaMejorada {

	public static void Bubblesort(int matriz[]){
	 int buffer;
	 int i,j;
	 for(i = 0; i < matriz.length; i++){
		 for(j = 0; j < i; j++){
			 if(matriz[i] < matriz[j]){
				 buffer = matriz[j];
				 matriz[j] = matriz[i];
				 matriz[i] = buffer;
			 	}
		 }
	 }
	 }
}
