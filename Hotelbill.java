public class Hotelbill {

    
    public static int Billwerter(int Last_Meter,int  Current_Meter ) {
        
        if (Last_Meter < Current_Meter){
            return (Current_Meter - Last_Meter)  * 5;
        }
        if (Last_Meter == Current_Meter){
            return 0;
        }
        

        return (Integer) null;
            
        

    }

    public static int BillElect(int Last_Meter,int  Current_Meter ) {
        
        if (Last_Meter < Current_Meter){
            return (Current_Meter - Last_Meter)  * 6;
        }
        if (Last_Meter == Current_Meter){
            return 0;
        }

        return (Integer) null;
        

    }

    public static int sumbill(int water,int elect){
        
        return water + elect ;
    }

    
    



    

    public static int Totalbill(int billAmount,String bedtype){
        if (bedtype.equals("Single Bed")){
            return billAmount +1500;

        }

        if (bedtype.equals("Double Bed")){
            return billAmount +2000;

        }

        return (Integer) null ;
    }

    public static void main(String[] args) {
        Integer a = BillElect(150, 100);
        Integer b = Billwerter(150, 100);
        int sum = sumbill(a, b);
        int total = Totalbill(sum, "Double Bed");
        System.out.println(sum);
        System.out.println(total);
        
    }
}