package com.netease;

/**
 *
 */
public class Kitchen 
{
    public static String makeNoodles(String vegetable) {
        if (vegetable == null) {
            vegetable = "Tomatoeeeee";
        }

        StringBuffer s = new StringBuffer();
        s.append("<html><body>\n")
            .append("<h1> Noodles With ")
            .append(vegetable)
            .append("is declicious!!")
            .append("I believe you will love it. Enjoy!!")
            .append("</h1>\n")
            .append("</body></html>");

        return s.toString();
    }
}
