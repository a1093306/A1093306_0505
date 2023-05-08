import java.util.*;
public class A1093306_0505_1 {
    public static void main(String[] args) {
        int[] lotto={48,16,10,21,19,13};
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入樂透號碼(六個整數並用逗號隔開):");
        String num=input.nextLine();
        String[] Snumber=new String[6];
        int[] Inumber=new int[6];
        Snumber=num.split(",");
        for(int i=0;i<6;i++){
            Inumber[i]=Integer.parseInt(Snumber[i]);
        }
        try{
            for(int i:Inumber){
                if (i<1 || i>49) {
                    throw new IllegalArgumentException("輸入的數字必須介於1到49之間");
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        int count=0;
        for(int i=0;i<lotto.length;i++){
            for(int j=0;j<Inumber.length;j++){
                if(lotto[i]==Inumber[j]){
                    count=count+1;
                    break;
                }
            }
        }
        System.out.printf("%s%d%s","您中了",count,"個號碼。");
    }
    
}
