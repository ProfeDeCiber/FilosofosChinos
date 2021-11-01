public class Jugar {
  static int FILOSOFOS = 5;
  
  public static void main (String[] args){
	int indiceMenos = 0;
	int indiceMas = 0;
    Palillo palillos[] = new Palillo[FILOSOFOS];
    Filosofo filosofos[] = new Filosofo[FILOSOFOS];
    for (int i = 0; i <= FILOSOFOS-1; i++){
      palillos[i] = new Palillo(i);
    } 
	for (int i = 0; i <= FILOSOFOS-1; i++){
		if (i==0) {
			indiceMenos = FILOSOFOS-1;
			indiceMas = i+1;
		} else if (i== FILOSOFOS-1) {
			indiceMenos = i-1;
			indiceMas = 0;
		} else {
			indiceMenos = i-1;
			indiceMas = i+1;
		}
		//System.out.println ("Creando filosofo: " + i + ", con palillo: " + indiceMenos + " y palillo " + indiceMas);
		filosofos[i] = new Filosofo(i, palillos[indiceMenos], palillos[indiceMas]);
	}
	while (1== 1) {
		for (int i = 0; i <= FILOSOFOS-1; i++) {
			filosofos[i].Comer();
		}
	}
  }
}
