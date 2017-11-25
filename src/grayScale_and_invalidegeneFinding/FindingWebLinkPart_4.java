package grayScale_and_invalidegeneFinding;

import edu.duke.*;

public class FindingWebLinkPart_4 {

    public String checkURL(String link) {

        int index = link.indexOf("\"");
       // System.out.println(index);
        if (index == -1)
            return "";

        int index2 = link.indexOf("\"", index + 1);
       // System.out.println(index2);
        if (index2 == -1)
            return "";
        String sub = link.substring(index, index2+1);
       // System.out.println(sub);
        if (sub.contentEquals("\"https://www.youtube.com/\""))
            return sub;

        return "";
    }

    public  void findURL() {

        URLResource url = new URLResource("https://www.youtube.com/");
        for (String u : url.words()) {
            String link = checkURL(u);
            if(link == "")
                continue;
            System.out.println(link);


       /* String check = "new url\"youtube.com\"youhfkjdkj";
        String a= checkURL(check);

        System.out.println(a);*/
        }
    }

    public static void main(String[] a){

       FindingWebLinkPart_4 b = new FindingWebLinkPart_4();
       b.findURL();
    }
}

