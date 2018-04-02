import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<person> per = new ArrayList<person>();
        int a = 1;
        System.out.println("歡迎使用本系統");
        while (a != 0){
            System.out.println("功能表");
            System.out.println("=======================================");
            System.out.println("1. 新增卡片");
            System.out.println("2. 查詢卡片");
            System.out.println("3. 修改卡片");
            System.out.println("4. 刪除卡片");
            System.out.println("0. 結束使用");
            System.out.println("=======================================");
            int b = scn.nextInt();
            int size = per.size();
            switch (b){
                case 0:
                    a = 0;
                    break;
                case 1:
                    System.out.println("請輸入名字");
                    String nam = scn.next();
                    System.out.println("請輸入種族");
                    String eth = scn.next();
                    System.out.println("請輸入攻擊力");
                    String attack = scn.next();
                    System.out.println("請輸入屬性");
                    String attributes = scn.next();
                    per.add(new person(nam,eth,attack,attributes));
                    break;
                case 2:
                    int j = 0;
                    System.out.println("請輸入名字");
                    String name = scn.next();
                    while (j < size){
                        person perN = (person)per.get(j);
                        if (perN.getName().equals(name)){
                            perN.show();
                            j = size;
                        }else {
                            j ++;
                        }
                    }
                    break;
                case 3:
                    int k = 0 ;
                    System.out.println("請輸入錯誤之名字:");
                    String wrongName =scn.next();
                    while (k < size){
                        person perN = (person)per.get(k);
                        if (perN.getName().equals(wrongName)){
                            System.out.println("請輸入正確之名字:");
                            perN.setName(scn.next());
                            k = size;
                        }else {
                            k ++;
                        }
                    }
                    break;
                case 4:
                    int x = 0 ;
                    System.out.println("請輸入刪除之卡片:");
                    String cleanName =scn.next();
                    while (x < size){
                        person perN = (person)per.get(x);
                        if (perN.getName().equals(cleanName)){
                            per.remove(x);
                            x = size;
                        }else {
                            x ++;
                        }
                    }
                    break;
            }
        }
        System.out.println("感謝您使用本系統");
    }
}
