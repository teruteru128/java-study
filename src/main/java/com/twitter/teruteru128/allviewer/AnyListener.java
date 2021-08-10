package com.twitter.teruteru128.allviewer;

import java.util.regex.Pattern;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.User;

/**
 * なにかのリスナー？
 * @author Teruteru
 *
 */
public class AnyListener  {
    private StringBuffer buf = new StringBuffer(160);
    /** 改行文字 */
    private static final Pattern NEW_LINE = Pattern.compile("\\R");

    public AnyListener() {
        System.out.println("Test.Test()");
    }

    /**
     * (非 Javadoc)
     * 
     */
    public void onStatus(Twitter account, Status status) {

        User user = status.getUser();
        String txt;
        synchronized (buf) {
            buf.append(user.getName());
            buf.append("@");
            buf.append(user.getScreenName());
            buf.append("(");
            buf.append(user.getId());
            buf.append(",");
            buf.append(status.getId());
            buf.append("):");
            buf.append(System.lineSeparator());
            buf.append("\t");
            buf.append(NEW_LINE.matcher(status.getText()).replaceAll("$0\t"));// インデント
            txt = buf.toString();
            buf.delete(0, buf.length());
        }
        System.out.println(txt);
    }

}
