import java.util.Scanner;
public class findIndex {
    public static void main(String[] args) {
        String [] students = {"Phong","Loc","Thang","Thong","Hung","Tuan","Hieu","Canh","Hai"};
        Scanner sc = new Scanner(System.in);
        String input_name=sc.nextLine();
        boolean isExist = false ;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name));
            System.out.println("Vi tri ten o"+ input_name +"o"+ (i+1));
            isExist= true ;
            break;

        }
        if(!isExist);
        System.out.println("khong ton tai "+ input_name);

    }

}
