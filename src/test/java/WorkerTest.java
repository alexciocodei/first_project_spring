import com.sda.production.Worker;
import com.sda.production.WorkerMotto;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/test-application-context.xml")

public class WorkerTest
{
@Autowired
    private Worker worker;

//@Before
//public void setUp() throws Exception
//{
//    worker = new Worker(20, "TestWorker", new WorkerMotto("Too young to be called a worker"));
//}
//
//@After
//public void tearDown() throws Exception
//{
//    worker = null;
//}

@Test
    public void getTools()
{
    Assert.assertNotNull(worker);
    Assert.assertNotNull(worker.getTools());
    Assert.assertEquals(worker.getProfession(), "Carpenter");
}

}
