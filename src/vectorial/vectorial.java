package vectorial;
/**
 * Esta Clase Calcula aplica las operaciones de
 * suma, resta y multiplicacion a 2 o 3 vectores.
 * Ademas, tambien puede hallar el total sumado 
 * los elementos de un vector y finalmente;
 * tambien, puede invertir un vector.
 * @author ALEJANDRO
 *
 */
public class vectorial {
	
	int vector[];
	

	public static void main(String[] args) {
		
		parametros p=new parametros(); 
		vectorial vectorial = new vectorial();
		
		int v1[]=p.v1;
		int v2[]=p.v2;
		int v3[]=p.v3;
		int v5[]=p.v4;
		int v4[];
		
		//vectorial.suma(v1,v2);
		//vectorial.resta(v1,v2);
		//vectorial.multiplicacion(v1,v2);
		
		//vectorial.suma(v1,v2,v3);
		//vectorial.resta(v1,v2,v3);
		//vectorial.multiplicacion(v1,v2,v3);
		//vectorial.inverso(v5);
		
		v4=vectorial.getResultante();
		
		imprimir(v4);

	}
	//------------------------------------------------------
	/**
	 * Metodo que permite imprimir un vector
	 * @param x
	 */
	public static void imprimir(int x[]) {
		try {
			for(int i=0;i<x.length;i++) {
				System.out.print("["+x[i]+"] ");
			}
			System.out.print("\n");
		}catch(NullPointerException ex) {
			System.out.println("Vector inexistente");
		}
		
	}
	
	//------------------------------------------------------
	//SUMA
	/**
	 * Metodo que permite sumar 2 vectores de tipo entero
	 * @param x - vector 1
	 * @param y - vector 2
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void suma(int x[],int y[]) throws ArrayIndexOutOfBoundsException {		//Suma de 2 vectores
		try {
			int n;
			if(x.length > y.length) {
				n=x.length;
			}else {
				n=y.length;
			}
			int sum[]=new int[n];
			
			for(int i=0;i<sum.length;i++) {
				sum[i]=x[i]+y[i];
				
			}
			vector = sum;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Los vectores deben tener la misma longitud");
			throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
		}

	}
	
	/**
	 * Metodo que permite sumar 3 vectores de tipo entero
	 * @param x
	 * @param y
	 * @param z
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void suma(int x[],int y[],int z[]) throws ArrayIndexOutOfBoundsException {		//Suma de 3 vectores
		
		try {
			int n;
			if(x.length>y.length && x.length>z.length) {
				n=x.length;
			}else if(y.length>x.length && y.length>z.length) {
				n=y.length;
			}else {
				n=z.length;
			}
			int sum[]=new int[n];
			
			for(int i=0;i<sum.length;i++) {
					sum[i]=x[i]+y[i]+z[i];
			}
			vector = sum;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Los vectores deben tener la misma longitud");
			throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
		}
	
	}
	
	//-----------------------------------------------------
	//RESTA
	public void resta(int x[],int y[]) throws ArrayIndexOutOfBoundsException {		//Resta de 2 vectores
		try {
			int n;
			if(x.length > y.length) {
				n=x.length;
			}else {
				n=y.length;
			}
			int res[]=new int[n];
			
			for(int i=0;i<res.length;i++) {
				res[i]=x[i]-y[i];
			}
			vector =  res;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Los vectores deben tener la misma longitud");
			throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
		}
		

	}
	
	
	public void resta(int x[],int y[],int z[]) throws ArrayIndexOutOfBoundsException {		//Resta de 3 vectores
		try {
			int n;
			if(x.length>y.length && x.length>z.length) {
				n=x.length;
			}else if(y.length>x.length && y.length>z.length) {
				n=y.length;
			}else {
				n=z.length;
			}
			int res[]=new int[n];
			
			for(int i=0;i<res.length;i++) {
				res[i]=x[i]-y[i]-z[i];
			}
			vector = res;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Los vectores deben tener la misma longitud");
			throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
		}
		

	}
	//---------------------------------------------------------
	//MULTIPLICACION
		public void multiplicacion(int x[],int y[]) throws ArrayIndexOutOfBoundsException {		//multiplicacion de 2 vectores
			try {
				int n;
				if(x.length > y.length) {
					n=x.length;
				}else {
					n=y.length;
				}
				int mul[]=new int[n];
				
				for(int i=0;i<mul.length;i++) {
					mul[i]=x[i]*y[i];
				}
				vector = mul;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Los vectores deben tener la misma longitud");
				throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
			}
			

		}
		
		
		public void multiplicacion(int x[],int y[],int z[]) throws ArrayIndexOutOfBoundsException {		//multiplicacion de 3 vectores
			try {
				int n;
				if(x.length>y.length && x.length>z.length) {
					n=x.length;
				}else if(y.length>x.length && y.length>z.length) {
					n=y.length;
				}else {
					n=z.length;
				}
				int mul[]=new int[n];
				
				for(int i=0;i<mul.length;i++) {
					mul[i]=x[i]*y[i]*z[i];
				}
				vector =  mul;
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Los vectores deben tener la misma longitud");
				throw new ArrayIndexOutOfBoundsException("Los vectores deben tener la misma longitud");
			}
			

		}
	//---------------------------------------------------------
	//INVERSO
		public void inverso(int x[]) {
			int inv[]=new int[x.length];
			for(int i=0;i<inv.length;i++) {
				inv[i]=x[(inv.length-1)-i];
			}
			vector =  inv;
		}
	//---------------------------------------------------------
	// SUMA TOTAL
		public static int total(int x[]) {
			int tot=0;
			for(int i=0;i<x.length;i++) {
				tot+=x[i];
			}
			return tot;
		}
	//----------------------------------------------------------
	//RESULTANTE
		public int[] getResultante() {
			
				return vector;
		}

}