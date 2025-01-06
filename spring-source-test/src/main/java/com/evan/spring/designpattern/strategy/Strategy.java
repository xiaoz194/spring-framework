package com.evan.spring.designpattern.strategy;

/**
 * 抽象策略 - 具体策略 - 环境类，调用策略类中的算法
 *
 * 策略模式好处：
 * 1）策略类之间可以自由切换，由于策略类都实现同一个接口，所以他们之间可以自由切换
 * 2）符合开闭原则，新增一个策略 直接添加一个具体的策略类即可，不会改变原有代码
 * 3）消除过多的if else
 *
 * 缺点：
 * 1）客户端必须知道所有的策略类，自行决定调用哪一个策略类
 * 2）可能会产生很多策略类
 * **/

// 抽象策略类
interface IStrategy {
	void algorithm();
}

// 具体策略A
class StrategyA implements IStrategy {

	@Override
	public void algorithm() {
		System.out.println("Strategy A");
	}
}


// 具体策略B
class StrategyB implements IStrategy {

	@Override
	public void algorithm() {
		System.out.println("Strategy B");
	}
}

// 环境类
class Context {
	// 维持一个对抽象策略接口的引用
	private IStrategy iStrategy;

	public Context(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}

	// 调用策略类中的算法
	public void algorithm() {
		iStrategy.algorithm();
	}

}


public class Strategy {
	public static void main(String[] args) {
		IStrategy iStrategy = new StrategyA();
		Context context = new Context(iStrategy);
		context.algorithm();
	}
}
