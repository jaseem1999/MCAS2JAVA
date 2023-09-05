//Implementing the concept of Threads create two classes one class to display N numbers not divisible by 3 table and other class to display N prime numbers

package ExternalExam.SamplQuestions;



class Three extends Thread{
    int num;
    Three(int num){
        this.num = num;
    }
    public void run(){
        for(int i = 1; i <= num; i++){
            if(i % 3 != 0){
                System.out.println("Not divisible by 3 :: "+i);
            }
        }
    }
}

class Prime extends Thread{
    int num;
    Prime(int num){
        this.num = num;
    }
    public void run(){
        for(int i = 2; i<=num; i++){
            int j;
            for( j =2; j<i;j++){
                if(i%j == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println("Prime No :: "+i);
            }
        }
    }
}

public class ThreeNoDivEven {
    public static void main(String args[]){
        Three three = new Three(10);
        Prime prime = new Prime(21);
        prime.start();
        three.start();
        
    }    
}
