

public class RuneEff
{


  public static void main(String[] args)
  {
    double big = Integer.parseInt(args[0]);
    double small = Integer.parseInt(args[1]);
    double cd = Integer.parseInt(args[2]);
    
    double efficiency = big/40 + small/30 + cd/35 + 1; 
    double efficiency2 = (efficiency/2.8)*100;   
    System.out.println("Efficiency: " + efficiency2);
    
  }

}