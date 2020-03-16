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

    @Test
    public void givenThreeFloats_FindMaximumNumber(){
        Double result=maxNumber.maxNumberFloat(34.3,56.7,98.6);
        Assert.assertEquals((Double) 98.6,result);
    }

    @Test
    public void givenThreeStrings_FindMaximum(){
        String result=maxNumber.maxString("Hello","Hi","world");
        Assert.assertEquals("world",result);
    }
}
