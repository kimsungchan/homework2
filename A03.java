import java.util.*;
public class A03 {
    int days =  0;
        int seconds = 0;
	    int m_count = 0;
	        public static void main(String[] args){
		           new A03().start();

			      }
			         void start(){
				      Scanner s = new Scanner(System.in);
				          
					       System.out.print("날수를 입력하세요 :");
					            this.days = s.nextInt();
						         this.seconds = days*24*60*60;
							      print();

							         }

								    void print(){
								         if(seconds>1000000){
									     	 int m_count = seconds/1000000;
										     	 System.out.println("날수에 해당되는 기간은 모두" +seconds+ "초입니다");
											     	 System.out.print("100만초가 모두" +m_count+ "번이나 포함됩니다");
												     }
												          else{
													      	 System.out.print("날수에 해당되는 기간은 모두" +seconds+ "초입니다");
														      }
														        }
															}


