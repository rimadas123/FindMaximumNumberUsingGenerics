import com.generics.MaximumNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    MaximumNumber maxNumber = new MaximumNumber();

    @Test
    public void givenThreeIntegers_FindMaximumNumber(){
        Integer result=maxNumber.findMaximum(25,89,56);
        Assert.assertEquals((Integer)89,result);
    }

    @Test
    public void givenThreeFloats_FindMaximumNumber(){
        Double result=maxNumber.findMaximum(34.3,56.7,98.6);
        Assert.assertEquals((Double) 98.6,result);
    }

    @Test
    public void givenThreeStrings_FindMaximum(){
        String result=maxNumber.findMaximum("Hello","Hi","world");
        Assert.assertEquals("world",result);
    }

    @Test
    public void givenThreeIntegers_FindMaximumNumberUsingGenericMethod(){
        Integer result= maxNumber. findMaximum(25,89,56);
        Assert.assertEquals((Integer) 89,result);
    }

    @Test
    public void givenThreeFloats_FindMaximumNumberUsingGenericMethod(){
        Double result=maxNumber.findMaximum(34.3,56.7,98.6);
        Assert.assertEquals((Double) 98.6,result);
    }

    @Test
    public void givenThreeStrings_FindMaximumUsingGenericMethod(){
        String result=maxNumber.findMaximum("Hello","Hi","world");
        Assert.assertEquals("world",result);
    }
    @Test
    public void givenThreeIntegers_FindMaximumNumberUsingGenericClass(){
        MaximumNumber maxNumber = new MaximumNumber(25,89,56);
        Integer result= (Integer) maxNumber. findMaximum();
        Assert.assertEquals((Integer) 89,result);
    }

    @Test
    public void givenThreeFloats_FindMaximumNumberUsingGenericClass(){
        MaximumNumber maxNumber = new MaximumNumber(34.3,56.7,98.6);
        Double result=(Double) maxNumber.findMaximum();
        Assert.assertEquals((Double) 98.6,result);
    }

    @Test
    public void givenThreeStrings_FindMaximumGenericClass(){
        MaximumNumber maxNumber = new MaximumNumber("Hello","Hi","world");
        String result=(String) maxNumber.findMaximum();
        Assert.assertEquals("world",result);
    }
}
