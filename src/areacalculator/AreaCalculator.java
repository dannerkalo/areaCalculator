package areacalculator;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//playing with method overload
		
		//test the methods:
		//System.out.println(area(5.0));
		//System.out.println(area(-1));
		//System.out.println(area(5.0,4.0));
		//System.out.println(area(-1.0,4.0));
	}
	

		public static double area(double radius){
		    
		    if(radius < 0){
		      return -1.0;    
		    }
		    
		    double theCircle = (radius * radius)*Math.PI;
		    return theCircle;
		}

		public static double area(double x, double y){

		    if( (x < 0) || (y <0) ){
		        return -1.0;
		    }
		    
		    double theRectagle = (x*y);
		    return theRectagle;
		    
		}
		    

}
