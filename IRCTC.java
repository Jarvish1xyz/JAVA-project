package JavaProject;

import java.util.Scanner;

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

        Train t[] = new Train[3];

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
        
        int s=0;
        for(int i=0; i<t.length; i++) {
            int l = -1;
            for(int j=0; j<t[i].station.length; j++) {
                if(l==-1 && t[i].station[j].equals(startPoint)) {
                    l++;
                }
                if(l!=-1 && t[i].station[j].equals(endPoint)) {
                    l++;
                }
            }
            
            if(l==1) {
                s++;
                for(int k=0; k<t[i].className.length; k++) {
                    if(t[i].className[k].equals(coachName)) {
                        if(t[i].seat[k]>passangerNumber) {
                            System.out.println(s + ".  " + t[i].trainNumber + "  " + t[i].trainName + " (" + passangerNumber + " seat is Availabel in " + coachName + "...)");
                        }
                        else {
                            System.out.println(s + ".  " + t[i].trainNumber + "  " + t[i].trainName + " (" + passangerNumber + " seat is not Availabel in " + coachName + "...)");
                        }
                    }
                }
                
            }
        }

    }
}
