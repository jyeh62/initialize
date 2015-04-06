public class Initialization{
    final static double PI;
    private String str;    
    static{
        PI = 3.1415;
        int i;
        for(i=0; i<2; i++){
            System.out.println(i + " in class block");
        }
        System.out.println("method getString = " + getString() + " in class block");        
    }
    
    public static String getString(){
        return "return getString";
    }
    
    {
        System.out.println("PI in object block");
        System.out.println("method getString = " + getString() + " in object block");
        str = getString();
        System.out.println("field str = " + str + " in object block");
    }
    
    
    public Initialization(){        
        System.out.println("Initialization initialization");
        str = getString();
    }
    
    public static void main(String args[]){
        System.out.println("test start");
        Initialization init_ = new Initialization();
        Initialization init__ = new Initialization();
    }
}
