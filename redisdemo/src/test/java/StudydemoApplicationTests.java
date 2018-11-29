import com.tyf.studydemo.redisdemo.redis.ApplicationForTest;
import com.tyf.studydemo.redisdemo.redis.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationForTest.class)
@Slf4j
public class StudydemoApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    public void redisStringTest() {
        log.info("redisStringTest method start:");
        redisService.operationString();
        log.info("redisStringTest method end:");
    }

}
