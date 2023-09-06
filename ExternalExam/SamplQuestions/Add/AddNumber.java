package ExternalExam.SamplQuestions.Add;
import ExternalExam.SamplQuestions.Add.ExeptionEven;
public class AddNumber {
    int n1,n2,n3;
    AddNumber(int n1 , int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void add(){
        n3 = n1 + n2;
    }
    public void validation() throws ExeptionEven {
        if( n3 % 2 == 0 ){
            System.out.println("Sum of two number is even :: "+n3);
        }else{
            throw new ExeptionEven("Ecxception is it s not even number");
        }
    }
}
