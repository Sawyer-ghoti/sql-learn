import com.sawyer.AppRun;
import com.sawyer.entity.Student;
import com.sawyer.mapper.StuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = AppRun.class)
@RunWith(SpringRunner.class)
public class TestDemo {
    @Resource
    private StuMapper stuMapper;
    @Test
    public void test11()
    {
        Student bySno = stuMapper.findBySno(110);
        System.out.println(bySno);

    }
    @Test
    public void test22()
    {
        int jack = stuMapper.insertStudent(new Student(121, "jack", 21));
        System.out.println(jack);
    }
    @Test
    public void test33()
    {
        stuMapper.deleteBySno(121);
    }
    @Test
    public void test44()
    {
        stuMapper.updateAgeBySno(120, 30);

    }


}
