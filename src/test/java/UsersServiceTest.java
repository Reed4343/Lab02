import StringClassPackege.MyStringClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UsersServiceTest {

    @Test
    public void stringToUpCaseTesting()
    {
        var msc = new MyStringClass();
        var result = MyStringClass.stringToUpper("Я делаю проверку метода");
        Assert.assertEquals(result,"Я ДЕЛАЮ ПРОВЕРКУ МЕТОДА");
    }
    @Test
    public void stringToLowCaseTesting()
    {
        var msc = new MyStringClass();
        var result = MyStringClass.stringToLower("ВСЕ ЕЩЕ ПРОВЕРЯЮ");
        Assert.assertEquals(result, "все еще проверяю");
    }
    @Test
    public void stringLenTesting()
    {
        var msc = new MyStringClass();
        int res = MyStringClass.stringLength("Hello World");
        Assert.assertEquals(res, 11);
    }
    @Test
    public void stringUnionTesting()
    {
        var msc = new MyStringClass();
        var result = MyStringClass.stringUnion("Объединение ", "это иногда интересно");
        Assert.assertEquals(result, "Объединение это иногда интересно");
    }
}
