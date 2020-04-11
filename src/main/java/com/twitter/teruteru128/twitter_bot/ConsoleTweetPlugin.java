package com.twitter.teruteru128.twitter_bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.Cleaner;
import java.util.List;

import com.twitter.Extractor;
import com.twitter.Extractor.Entity;

import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 * @author Teruteru
 *
 */
public class ConsoleTweetPlugin implements Runnable, AutoCloseable {
    private BufferedReader reader = null;
    private final State state;
    private final Cleaner.Cleanable cleanable;
    private static final int short_url_length_https = 23;
    private static final int short_url_length = 22;
    private static final Cleaner cleaner = Cleaner.create();

    static class State implements Runnable {
        private ConsoleTweetPlugin plugin;
        public State(ConsoleTweetPlugin plugin) {
            this.plugin = plugin;
        }
        public void run() {
            try {
                if (plugin.reader != null) {
                    plugin.reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                plugin.reader = null;
            }
        }
    }

    /**
     * 
     */
    public ConsoleTweetPlugin() {
        this.state = new State(this);
        this.cleanable = cleaner.register(this, state);
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        String tweet = "";
        reader = new BufferedReader(new InputStreamReader(System.in));
        AccountManager manager = AccountManager.getInstance();
        Twitter twitter = manager.get(0);
        Extractor extractor = new Extractor();
        List<Entity> urls_with_indices = null;
        int length = 0;
        try {
            while ((tweet = reader.readLine()) != null) {
                length = tweet.length();
                if (tweet.length() == 0) {//0文字はダメです
                    continue;
                }
                urls_with_indices = extractor.extractURLsWithIndices(tweet);
                for (Entity entity : urls_with_indices) {
                    length = length - (entity.getEnd() - entity.getStart());
                    length = length
                            + (entity.getValue().startsWith("https://") ? short_url_length_https
                                    : short_url_length);
                }
                if (length <= 140) {// 140文字以下
                    try {
                        // TODO 行末に'\'が来たら行をつなげる(->エスケープ記号？)
                        twitter.updateStatus(tweet);
                    } catch (TwitterException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
