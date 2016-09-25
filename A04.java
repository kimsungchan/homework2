import java.util.*;
import java.text.*;
public class A04 {
	  int kor = 0;
	  	  int eng = 0;
		  	  int math = 0;
			  	  
				        public static void main(String[] args){
					             new A04().start();
						          }
							       void start(){
							              Scanner s = new Scanner(System.in);

								             System.out.print("국어 점수를 입력하세요 :");
									            this.kor = s.nextInt();
										           System.out.print("영어 점수를 입력하세요 :");
											          this.eng = s.nextInt();
												         System.out.print("수학 점수를 입력하세요 :");
													        this.math = s.nextInt();
														       int sum = kor+eng+math;
														              System.out.println("입력하신 점수의 총점은" +sum+ "이고");
															             String pattern = "##.#";
																            DecimalFormat dformat = new DecimalFormat(pattern);
																	           double avg = sum/3.0;
																		          System.out.println("평균은" +dformat.format(avg)+ "입니다");
																			         print();

																				      }

																				           void print(){
																					          if(kor>90){
																						      	   System.out.println("국어점수가 우수합니다.");    	   
																							          }
																								         if(eng>90){
																									     	   System.out.println("영어점수가 우수합니다.");    	
																										          }
																											         if(math>90){
																												     	   System.out.println("수학점수가 우수합니다.");
																													          }
																														         
																															   }
																															   }

