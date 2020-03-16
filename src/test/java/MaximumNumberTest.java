import com.generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    MaximumNumber maxNumber = new MaximumNumber();
    @Test
    public void givenThreeIntegers_FindMaximumNumber(){
        Integer result=maxNumber.maxNumberInteger(25,89,56);
        Assert.assertEquals((Integer)89,result);
    }
}
