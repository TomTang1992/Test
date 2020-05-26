import okhttp3.FormBody;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import okhttp3.Request;
import okhttp3.Response;



public class ocrTest {

    public static void main(String[] args) throws IOException {

        OkHttpClient client=new OkHttpClient.Builder()
                .connectTimeout(15,TimeUnit.SECONDS)//链接超时时间
                .writeTimeout(30,TimeUnit.SECONDS)//写入超时
                .readTimeout(60,TimeUnit.SECONDS)//读入超时
                .build();
        FormBody mbody=new FormBody.Builder()//提交的表单
                .add("key","LvJkUveifkLPPXdSnN7cFB")//账号信息
                .add("secret","25f8c4ab1e6246279de6935c19ca406b")//账号信息
                .add("FPDM","5200173320")//发票代码
                .add("FPLX","04")//发票类型，普通电子发票
                .add("FPHM","02366834")//发票号码
                .add("KPRQ","20180501")//开票日期
                .add("FPJE","909090.91")//价税合计
                .add("JYM","376043")//校验码
                .build();
        URL realUrl =new URL("http://www.etoplive.com/api/invchk.srvc");
        Request request =new Request.Builder().url(realUrl).post(mbody).build();
        Response  response=client.newCall(request).execute();
        System.out.println(response.body().string());

    }
}
