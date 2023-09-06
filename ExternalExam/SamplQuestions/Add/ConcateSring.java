package ExternalExam.SamplQuestions.Add;
import  ExternalExam.SamplQuestions.Add.MoreTenCharacter;
public class ConcateSring {
    String s1,s2;
    ConcateSring(String s1, String s2){
        this.s1=s1;
        this.s2=s2;
    }
    public String validation() throws MoreTenCharacter{
        if((s1+s2).length() > 10 ){
            throw new MoreTenCharacter("Its more than 10 character in the Concate String .");
        }
        return s1 + s2;
    }
}
