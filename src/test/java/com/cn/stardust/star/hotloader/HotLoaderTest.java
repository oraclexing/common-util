package com.cn.stardust.star.hotloader;

import com.cn.stardust.star.hotloader.listen.FileListener;
import org.junit.Test;

/**
 * Description: com.cn.stardust.star
 * Created by Oracle on 2019/6/12 19:16
 */
public class HotLoaderTest {

    /**
     * @throws Exception
     */
    @Test
    public void loadTest()throws Exception{
        FileListener fileListener = new FileListener();
        fileListener.listen("E:\\LearnProject\\Java\\common_utils\\src\\main\\java\\com\\cn\\stardust\\star\\hotloader\\basedo\\",null);
        System.out.println("Server start successfull!");
    }
}