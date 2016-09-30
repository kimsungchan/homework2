import java.util.*;
public class A06{
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
 
            System.out.print("====================");
            System.out.print("이름 : ");
	    String name = s.next();
            System.out.print("국어점수 입력 :");
            int kor = s.nextInt();
	    System.out.print("수학점수 입력 :");
            int math = s.nextInt();
            System.out.print("영어점수 입력 :");
            int eng = s.nextInt();
            System.out.println("===================");
            
	    int sum = kor + math + eng;
            double avg = sum/3.0;
            String rank = null;
	    System.out.print(name+"님은 평균은" +avg+ "이고");
            if(avg >= 95)
	       rank = "A+";
	    
	    else if(avg >= 90 && avg<95)
	       rank = "A";
	    else if(avg >= 85 && avg<90)
	       rank = "B+";
	    else if(avg >= 80 && avg<85)
	       rank = "B";
	    else if(avg >= 75 && avg<80)
	       rank = "C+";
	    else if(avg >= 70 && avg<75)
	       rank = "C";
	    else if(avg >= 65 && avg<70)
	       rank = "D+";
	    else if(avg >= 60 && avg<65)
	       rank = "D";
	    else 
	       rank ="F";
                              
	    System.out.println("학점은" +rank+ "입니다");

  }
}
