package com.twitter.teruteru128.torboard;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Objects;

public class StaticProxySelector extends ProxySelector {
	private final List<Proxy> proxies;

	public StaticProxySelector(Proxy proxy) {
		this.proxies = List.of(Objects.requireNonNullElse(proxy, Proxy.NO_PROXY));
	}

	public StaticProxySelector(InetSocketAddress address) {
		this(Objects.isNull(address) ? Proxy.NO_PROXY : new Proxy(Proxy.Type.HTTP, address));
	}

	public StaticProxySelector(Proxy.Type type, InetSocketAddress address) {
		this(new Proxy(type, address));
	}

	@Override
	public List<Proxy> select(URI uri) {
		return proxies;
	}

	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
		// NONE
	}

}