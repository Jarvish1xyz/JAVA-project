package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

class Train {
    String trainName;
    int trainNumber;
    String[] station;
    int[] kms;
    String[] className;
    int[] seat={72, 72, 72, 7, 24};

    public void Train(String trainName, int trainNumber,String[] className,int[] seat, String[] station, int[] kms) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.station = station;
        this.kms = kms;
        this.className = className;
    }

}



public class IRCTC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Train t[] = new Train[10];

        t[0] = new Train();
        t[0].station = new String[]{"Jamnagar","Rajkot","Ahmedabad","Surat","Panvel","Ratnagiri","Alleppey"};
        t[0].kms = new int[]{0,85,332,561,843,1205,2446};
        t[0].className = new String[]{"S1","S2","B1","A1","H1"};
        t[0].Train("JAM TEN EXPRESS", 19578,t[0].className,t[0].seat, t[0].station, t[0].kms);
        
        t[1] = new Train();
        t[1].station = new String[]{"Hapa","Rajkot","Viramgam","Ratlam","Kota","New Delhi"};
        t[1].kms = new int[]{0,77,258,673,940,1404};
        t[1].className = new String[]{"S1","S2","B1","A1","H1"};
        t[1].Train("HAPA SVDK EXP", 12475,t[1].className, t[1].seat, t[1].station, t[1].kms);
        
        t[2] = new Train();
        t[2].station = new String[]{"Okha","Dwarka","Jamnagar","Rajkot","Junagadh","Veraval"};
        t[2].kms = new int[]{0,29,168,253,356,437};
        t[2].className = new String[]{"S1","S2","B1","A1","H1"};
        t[2].Train("OKHA SOMNATH EXP", 19252,t[2].className, t[2].seat, t[2].station, t[2].kms);
        
        t[3] = new Train();
        t[3].station = new String[]{"Okha","Rajkot","Ahemdabad","Surat","Tirupati","Madurai","Rameswaram"};
        t[3].kms = new int[]{0,253,499,728,2460,2993,3154};
        t[3].className = new String[]{"S1","S2","B1","A1","H1"};
        t[3].Train("RAMESWARAM EXP", 16734,t[3].className,t[3].seat, t[3].station, t[3].kms);
        
        t[4] = new Train();
        t[4].station = new String[]{"Anand Vihar","Etawah","Prayagraj","Mansi","Jalpaiguri","Kamakhya"};
        t[4].kms = new int[]{0,289,623,1156,1488,1856};
        t[4].className = new String[]{"S1","S2","B1","A1","H1"};
        t[4].Train("NORTH EAST EXP", 12506,t[4].className, t[4].seat, t[4].station, t[4].kms);
        
        t[5] = new Train();
        t[5].station = new String[]{"Okha","Rajkot","Ahemdabad","Kota","Agra","Varanasi","Kamakhya"};
        t[5].kms = new int[]{0,253,499,1116,1449,2099,3218};
        t[5].className = new String[]{"S1","S2","B1","A1","H1"};
        t[5].Train("GUWAHATI EXPRES", 15635,t[5].className, t[5].seat, t[5].station, t[5].kms);
        
        t[6] = new Train();
        t[6].station = new String[]{"Okha","Dwarka","Hapa","Rajkot","Ahemdabad","Ratlam","Ujjain"};
        t[6].kms = new int[]{0,29,177,253,499,849,946};
        t[6].className = new String[]{"S1","S2","B1","A1","H1"};
        t[6].Train("GORAKHPUR EXP", 15046,t[6].className,t[6].seat, t[6].station, t[6].kms);
        
        t[7] = new Train();
        t[7].station = new String[]{"Banaras","Prayagraj","Kota","Ratlam","Ahemdabad","Junagadh","Veraval"};
        t[7].kms = new int[]{0,121,900,1167,1517,1896,1977};
        t[7].className = new String[]{"S1","S2","B1","A1","H1"};
        t[7].Train("BSBS VRL SF EXP", 12946,t[7].className, t[7].seat, t[7].station, t[7].kms);
        
        t[8] = new Train();
        t[8].station = new String[]{"Bikaner","Jaipur","Durgapura","Kota","Ujjain","Bhopal"};
        t[8].kms = new int[]{0,382,389,621,901,1084};
        t[8].className = new String[]{"S1","S2","B1","A1","H1"};
        t[8].Train("BKN BSP EXP", 20846,t[8].className, t[8].seat, t[8].station, t[8].kms);
        
        t[9] = new Train();
        t[9].station = new String[]{"Daund","Pune","Kalyan","Surat","Vadodara","Ratlam","Ujjain"};
        t[9].kms = new int[]{0,76,214,482,611,872,969};
        t[9].className = new String[]{"S1","S2","B1","A1","H1"};
        t[9].Train("PUNE INDORE EXP", 22943,t[9].className,t[9].seat, t[9].station, t[9].kms);
        
        System.out.println("Enter Starting point : ");
        String startPoint = sc.nextLine();
        System.out.println("Enter Ending Point : ");
        String endPoint = sc.nextLine();
        System.out.println("Enter Coach name : ");
        System.out.println("S1 - Sleeper 1 (SL1)\r\n" + //
                        "S2 - Sleeper 2 (SL2)\r\n" + //
                        "B1 - 3 Tier AC (3A)\r\n" + //
                        "A1 - 2 Tier AC (2A)\r\n" + //
                        "H1 - 1st class AC (1A)");
        String coachName = sc.nextLine();
        System.out.println("Enter Passanger Number : ");
        int passangerNumber = sc.nextInt();
        System.out.println("=========================");
        
        int s=0,distance=0,o=0,xy=0;
        int finalPrice=0,mn=0;

        ArrayList<Consumer<Integer>> trainNo = new ArrayList<>();
        trainNo.add(ArrayListGotoWithInt::taskOne);

        for(int i=0; i<t.length; i++) {
            int l = -1;
            for(int j=0; j<t[i].station.length; j++) {
                if(l==-1 && t[i].station[j].equals(startPoint)) {
                    distance+=t[i].kms[j];
                    l++;
                }
                if(l!=-1 && t[i].station[j].equals(endPoint)) {
                    l++;
                    distance-=t[i].kms[j];
                    break;        
                }
            }
            
            distance*=(-1);
            if(l==1) {
                s++;o=0;
                for(int k=0; k<t[i].className.length; k++) {
                    if(t[i].className[k].equals(coachName)) {
                        if(t[i].seat[k]>=passangerNumber) {
                            xy*=10;
                            System.out.print(s + ".  " + t[i].trainNumber + "  " + t[i].trainName + "  ");
                            System.out.print("S1-" + t[i].seat[0] + ", S2-" + t[i].seat[1] + ", B1-" + t[i].seat[2] + ", A1-" + t[i].seat[3] + ", H1-" + t[i].seat[4]);
                            System.out.println(" (" + passangerNumber + " seat is Availabel in " + coachName + "...)");
                            xy += i+1;
                            o++;
                            jumpTable.get(jumpToIndex).accept(valueToPass);
                        }
                        else {
                            System.out.print(s + ".  " + t[i].trainNumber + "  " + t[i].trainName + "  ");
                            System.out.print("S1-" + t[i].seat[0] + ", S2-" + t[i].seat[1] + ", B1-" + t[i].seat[2] + ", A1-" + t[i].seat[3] + ", H1-" + t[i].seat[4]);
                            System.out.println(" (" + passangerNumber + " seat is not Availabel in " + coachName + "...)");
                        }
                    }
                    
                }
                System.out.println("distance = " + distance);
            }
            distance=0;
        }
        System.out.println(xy);
        
        System.out.println("Enter Train number to book Ticket : ");
        int numberOfTrain = sc.nextInt();

        for(int i=1; i<=o; i++) {
            if(numberOfTrain == (xy%10)) {

            }
        }
    }
}
