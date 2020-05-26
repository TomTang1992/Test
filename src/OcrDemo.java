import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import sun.net.www.http.HttpClient;

import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class OcrDemo {
    public static void main(String[] args) throws Exception{
        String  urlString="http://www.etoplive.com/api/invchk.srvc";//验证地址
        URL url=new URL(urlString);
        HttpURLConnection conn=(HttpURLConnection)url.openConnection();
        conn.setRequestProperty("Accept-Charset","UTF-8");
        conn.setRequestProperty("connection", "keep-Alive");
        conn.setRequestMethod("POST");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        String jsonstring = getJson();

        System.out.println(jsonstring);
    /*    if(jsonstring!=null&&!jsonstring.equals("")){
            BufferedOutputStream out = new BufferedOutputStream(conn.getOutputStream());
            out.write(jsonstring.getBytes());
            out.flush();
            out.close();
            String  result= IOUtils.toString(conn.getInputStream(),"UTF-8");
            System.out.println(result);
        }*/



    }
    public static String  getJson(){
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("key","LvJkUveifkLPPXdSnN7cFB");
        jsonobject.put("secret","25f8c4ab1e6246279de6935c19ca406b");
        jsonobject.put("FPDM","5200173320");
        jsonobject.put("FPLX","04");
        jsonobject.put("FPHM","02366834");
        jsonobject.put("KPRQ","20180501");
        jsonobject.put("FPJE","909090.91");
        jsonobject.put("JYM","376043");
        String jsonstring = JSON.toJSONString(jsonobject);
        return jsonstring;

    }

}
