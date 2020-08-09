package com.example.bean;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class MainRibbonRule {

	public IRule getIRule() {
		return new RandomRule();
	}

}
