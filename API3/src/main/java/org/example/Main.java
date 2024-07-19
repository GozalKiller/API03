package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class Main {
    public static void main(String[] args) {
        //https://jsonformatter.curiousconcept.com // מתרגם את הגייסון לשיטה יותר נוחה
        //https://github.com/yakov152005
        //https://github.com/orzino3
        //https://github.com/Lmiler
        //https://github.com/avihay126
        //https://github.com/Aviyay318

        getTasks("31253215"); //זימון מתודה
        //תקלה1000:
        //לא נשלח הפרמטר id

        //תקלה1001:
        //תעבודת הזהות המבוקשת לא נרשמה במערכת
        //IMAGE PHOTO:
        //תחפש image rgb manipulator
        public static void getTasks (String id){ //מקבל ID מבחוץ
            try {
                CloseableHttpClient client = HttpClients.createDefault(); //אובייקט של לקוח
                URI uri = new URIBuilder("https://app.seker.live/fm1/get-tasks")
                        .setParameter("id", "5436463")
                        .build(); //בקשה לשרת
                HttpPost request = new HttpPost(uri); //קבלת ה-URI
                CloseableHttpResponse response = client.execute(request); // אובייקט של response
                //System.out.println(EntityUtils.toString(response.getEntity()));
                String json = EntityUtils.toString(response.getEntity());
                Response myResponse = new ObjectMapper().readValue(json, Response.class);
                if (myResponse.isSuccess()) {
                    System.out.println(:"You have " + myResponse.getTasks().size() + " tasks");
                    for (TaskModel taskModel : myResponse.getTasks()) {
                        System.out.println(taskModel.getTitle());
                        System.out.println(taskModel.getDate());

                        //ObjectMapper// נקרא ככה היא הוא ממפה בין הגייסון לבין השדות
                    }
                } else {
                    //System.out.println(json);
                    System.out.println(getTextualError(myResponse.getErrorCode()));
                }

            } catch (URISyntaxExeception e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static String getTextualError (int code){
        return switch (code) {
            //case 1000 -> "";
            case  1001 -> "you have registered yet!";
            default -> "Unknown error";
        };

    }
    public static void addTask (String id, String text){
        
    }
}


