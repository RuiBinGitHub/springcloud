package com.example.bean;

import java.util.List;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

public class AppRibbonRule implements IRule {

	private ILoadBalancer loadBalancer;

	public void setLoadBalancer(ILoadBalancer loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	public ILoadBalancer getLoadBalancer() {
		return loadBalancer;
	}

	public Server choose(Object key) {
		List<Server> reachables = loadBalancer.getReachableServers();
		// 具体实现算法
		if (reachables == null || reachables.size() == 0)
			return null;
		// 使用随机算法
		int index = (int) (Math.random() * reachables.size());
		return reachables.get(index);
	}

}
