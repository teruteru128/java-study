package com.twitter.teruteru128.sample.nyanpass;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 * */
class NyanpassDAOFactory {
	public NyanpassDAOFactory(NyanpassConfig config) {
		ConfigurationBuilder builder = new ConfigurationBuilder();
		TwitterFactory factory = new TwitterFactory(builder.build());
		Twitter twitter = factory.getInstance(new AccessToken("", ""));
		try {
			twitter.getAccountSettings();
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

	public NyanpassDAO getInstance() {
		return null;
	}
}