import java.util.Scanner;
class reg{
Scanner sc=new Scanner(System.in);
menu mm=new menu();
void r1(){
System.out.println("\nEnter your Name :");
      String name=sc.next();
      System.out.println("Enter your Mail :");
      String mail=sc.next();
      System.out.println("Enter your Password :");
      int pp=sc.nextInt();
      System.out.println("\n   Registarion Succesful !!");
      System.out.println("\n    --- Login ----");
      while(true){
         System.out.println("Enter your Mail");
         String s=sc.next();
         System.out.println("Enter your Password");
         int p=sc.nextInt();

          if(s.equals(mail) && p == pp){
		    mm.m2();
            break;
   }
       else{
            System.out.println("You Entered Mail or Password are incorrect.Please check once"); 
          }
        }	
    }
    }
class abt{
void display(){
System.out.println("Name : likitha");
System.out.println("Mail : likithapadige1234@gmail.com");
} 
}

class menu{
   sci scn=new sci();
   eng e=new eng();
   mat m=new mat();
   abt a=new abt();
   Scanner sc=new Scanner(System.in);
   public void m2(){
      System.out.println("\n Your login is succesful");
      while(true){
         System.out.println("\n1.My Account\n2.Exam\n3.About\n4.Exit");
         System.out.println("\nEnter your option");
         int o=sc.nextInt();
         if(o == 1){
            a.display();
            System.out.println("\n1.Back            2.Exit");
            int g1=sc.nextInt();
            if(g1==1){
               System.out.println("\n");
             }
             else{
                break;
             }
          }    
         else if(o == 2){
            System.out.println("\n1.Science\n2.English\n3.Maths");
            System.out.println("\nSelect the Subjct ");
            int su=sc.nextInt();
            if(su == 1){
               scn.s1();
             }
            else if(su == 2){
			    e.e1();
             }
             else if(su == 3){
			 m.mat1();
             }
             else{
                System.out.println("choose the correct one");
             }
            System.out.println("\n1.Back            2.Exit");
            int g2=sc.nextInt();
            if(g2==1){
               System.out.println("\n");
             }
             else{
                 break;
             }
          }
          else if(o == 3){
               System.out.println("\nOnline Examination Portal");
               System.out.println("\nDesigned by :\nPadige.Likitha\nBtech 2nd year ECE\nRGUKT,Basar(IIIT BASAR)");
               System.out.println("\n1.Back            2.Exit");
               int g3=sc.nextInt();
               if(g3==1){
                    System.out.println("\n");
                 }
               else{
                    break;
                 }
            }
           else if(o == 4){
                         break;
            }
            else{
                 System.out.println("choose the correct one");
             }
          }
       }
    }

class logA{
   Scanner sc=new Scanner(System.in);
   public void m1(){
      menu m=new menu();
      int pswd=1234;
      System.out.println("Enter your Mail");
      String s=sc.next();
      while(true){
         System.out.println("Enter your Password");
         int p=sc.nextInt();
         if(p == pswd){
            m.m2();
            break;
         }
         else{
            System.out.println("You Entered Mail or Password are incorrect.Please check once"); 
         }
        }
    }
}

class sci{
   Scanner sc=new Scanner(System.in);
   void s1(){
      int count = 0;
      System.out.println("\nThere are 5 questions each question carries 2marks");
System.out.println("\nQuestion No.1	 :");
System.out.println("\nWhich of the following are causes of draught?");
System.out.println("\n1.Dry windly condition");
System.out.println("2.Scarcity of rain fall");
System.out.println("3.Severe hot days");
System.out.println("4.All of these");
int u1=sc.nextInt();
if(u1==4){
count++;
 }
else{
count=count;
}
System.out.println("\nQuestion No.2	 :");
System.out.println("\nWhich scale is used to measure the intensity of earthquake?");
System.out.println("\n1.Ruler scale");
System.out.println("2.Barometer");
System.out.println("3.Richter sclae");
System.out.println("4.none of the above\n");
int u2=sc.nextInt();
if(u2==3){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.3	 :");
System.out.println("\nWhat is not present in space?");
System.out.println("\n1.Water");
System.out.println("2.Food");
System.out.println("3.Gravity");
System.out.println("4.None\n");
int u3=sc.nextInt();
if(u3==3){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.4	 :");
System.out.println("\nChoose the false statement from the following?");
System.out.println("\n1.Matter is changeable from one form to another");
System.out.println("2.Ice is heavier than water");
System.out.println("3.None");
int u4=sc.nextInt();
if(u4==2){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.5	 :");
System.out.println("\nOzone layer protects us from .......?");
System.out.println("\n1.Cosmic Rays");
System.out.println("2.LASER");
System.out.println("3.U.V rays");
System.out.println("4.None\n");
int u5=sc.nextInt();
if(u5==3){
count++;
        }
      else{
          count=count;
        }
      if(count > 8){
           System.out.println("\nYour performance is too good..");
        }
      else if(count > 4 && count <9){
          System.out.println("\nYour performance is not so bad. All the best for next time !");
        }
       else{
           System.out.println("\nYour performance is too bad !!");
        }
		System.out.println("\n--------------------------------------");
      System.out.println("Your total Score is :"+count*2);
	  System.out.println("--------------------------------------");
      System.out.println("\nNo.of questions you did correct are :"+count);
	  System.out.println("\nSummary of Your Exam");
	  System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :4\nQ2.Your Option   :"+u2+"\n   Actual Option :3\nQ3.Your Option   :"+u3+"\n   Actual Option :3\nQ4.Your Option   :"+u4+"\n   Actual Option :2\nQ5.Your Option   :"+u5+"\n  Actual Option :3\n");
    }
    }
class eng{
Scanner sc=new Scanner(System.in);
void e1(){
int count = 0;
System.out.println("\nThere are 5 questions each question carries 2 marks");
      System.out.println("\nQuestion No.1	 :");
      System.out.println("\nwhich of the following is a food item?");
      System.out.println("\n1.Car");
      System.out.println("2.Pencil");
      System.out.println("3.Box");
      System.out.println("4.Rice\n");
      int u1=sc.nextInt();
      if(u1==4){
         count++;
        }
      else{
          count=count;
        }
      System.out.println("\nQuestion No.2	 :");
      System.out.println("\nWhich of the following sentence makes the correct use of capital letters");
      System.out.println("\n1.My name is Java");
      System.out.println("2.my name is JaVa");
      System.out.println("3.My name IS java");
      System.out.println("4.My Name Is Java\n");
      int u2=sc.nextInt();
      if(u2==1){
         count++;
        }
      else{
          count=count;
       }

      System.out.println("\nQuestion No.3	 :");
      System.out.println("\nShe....chocolates");
      System.out.println("\n1.likes");
      System.out.println("2.like");
      System.out.println("3.liked");
      System.out.println("4.liking\n");
      int u3=sc.nextInt();
      if(u3==1){
          count++;
        }
      else{
          count=count;
        }
      System.out.println("\nQuestion No.4	 :");
      System.out.println("\nMy teeth are....sharp as knife");
      System.out.println("\n1.Or");
      System.out.println("2.So");
      System.out.println("3.But");
      System.out.println("4.As\n");
      int u4=sc.nextInt();
      if(u4==4){
          count++;
        }
      else{
          count=count;
        }
      System.out.println("\nQuestion No.5	 :");
      System.out.println("\nWhich one of the following is incorrect statement? ");
      System.out.println("\n1.My name is likitha");
      System.out.println("2.my names is likitha");
      System.out.println("3.my names are likitha");
      System.out.println("4.None of the above\n");
      int u5=sc.nextInt();
      if(u5==1){
          count++;
        }
else{
count=count;
}
if(count > 8){
System.out.println("\nYour performance is too good..");
}
else if(count > 4 && count <9){
System.out.println("\nYour performance is not so bad. All the best for next time !");
}
else{
System.out.println("\nYour performance is too bad !!");
}
System.out.println("\n--------------------------------------");
      System.out.println("Your total Score is :"+count*2);
	  System.out.println("--------------------------------------");
System.out.println("No.of questions you did correct are :"+count);
 System.out.println("\nSummary of Your Exam");
	  System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :4\nQ2.Your Option   :"+u2+"\n   Actual Option :1\nQ3.Your Option   :"+u3+"\n   Actual Option :1\nQ4.Your Option   :"+u4+"\n   Actual Option :4\nQ5.Your Option   :"+u5+"\n Actual Option :1");
	  }
	  }
class mat{
Scanner sc=new Scanner(System.in);
void mat1(){
int count = 0;
System.out.println("\nThere are 5 questions each question carries 2 marks");

System.out.println("\nQuestion No.1	 :");
System.out.println("\nWhat is the value of 23+54?");
System.out.println("\n1.99");
System.out.println("2.86");
System.out.println("3.77");
int u1=sc.nextInt();
if(u1==3){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.2	 :");
System.out.println("\n What is the value of 567-357?");
System.out.println("\n1.143");
System.out.println("2.210");
int u2=sc.nextInt();
if(u2==2){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.2   :");
System.out.println("\nWhat is the value of 342*23  ?");
System.out.println("\n1.1223");
System.out.println("2.7866");
int u3=sc.nextInt();
if(u3==2){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.4	 :");
System.out.println("\nWhat is the value of 6544/2?");
System.out.println("\n1.6,343");
System.out.println("2.3,272");
System.out.println("3.2,345");
int u4=sc.nextInt();
if(u4==2){
count++;
}
else{
count=count;
}
System.out.println("\nQuestion No.5	 :");
System.out.println("\nWhat is the value of 5+23-44?");
System.out.println("\n1.-9");
System.out.println("2.23");
System.out.println("3.-16");
int u5=sc.nextInt();
if(u5==3){
count++;
}
else{
count=count;
}
if(count > 8){
System.out.println("\nYour performance is too good..");
}
else if(count > 4 && count <9){
System.out.println("\nYour performance is not so bad. All the best for next time !");
}
else{
System.out.println("\nYour performance is too bad !!");
}
System.out.println("\n--------------------------------------");
      System.out.println("Your total Score is :"+count*2);
	  System.out.println("--------------------------------------");
System.out.println("No.of questions you did correct are :"+count);
 System.out.println("\nSummary of Your Exam");
	  System.out.println("\nQ1.Your Option   :"+u1+"\n   Actual Option :3\nQ2.Your Option   :"+u2+"\n   Actual Option :2\nQ3.Your Option   :"+u3+"\n   Actual Option :2\nQ4.Your Option   :"+u4+"\n   Actual Option :2\nQ5.Your Option   :"+u5+"\n Actual Option :3");
  }
 }
class online{
public static void main(String []args){
logA l1=new logA();
reg rr=new reg();
Scanner sc=new Scanner(System.in);
System.out.println("\nWelcome to Online Examination Portal !!");
System.out.println("\n1.Login\n2.SignUp");
System.out.println("\nEnter your option ");
int r=sc.nextInt();
if(r == 1){
System.out.println("\nWelcome Come back");
System.out.println("\n    --- Login ----");
l1.m1();
}
else{
System.out.println("\n    --- SignUp ----");
    rr.r1();	
	}
    }
}

