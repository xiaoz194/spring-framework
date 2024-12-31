package com.evan.spring.designpattern.abstractfactory;

/**
 * 抽象工厂模式： 产品接口 -》具体产品 -》 抽象工厂接口 -》 具体工厂
 * <p>
 * <p>
 * <p>
 * 使用场景：
 * <p>
 * 当需要创建的对象是一系列相互关联或相互依赖的产品族时，如数码产品工厂的手机，电脑，平板等
 * <p>
 * 系统中由多个产品族，但每次只使用其中的某一族产品
 * <p>
 * 系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构
 **/

// 抽象产品接口
interface Phone {
	void createPhone();
}

interface Pad {
	void createPad();
}

// 具体产品
class Iphone implements Phone {
	public void createPhone() {
		System.out.println("create iphone");
	}

}

class HuaweiMete60 implements Phone {
	public void createPhone() {
		System.out.println("create huawei mete60");
	}
}

class Ipad implements Pad {

	@Override
	public void createPad() {
		System.out.println("create ipad");
	}
}

class MetePad implements Pad {

	@Override
	public void createPad() {
		System.out.println("create metepad");
	}
}


// 抽象工厂

interface AbstractFactory {
	Phone createPhone(String phoneType);

	Pad createPad(String padType);
}

// 具体工厂
class PhoneFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String phoneType) {
		if (phoneType == null) {
			return null;
		}
		if (phoneType.equals("iphone")) {
			return new Iphone();
		} else if (phoneType.equals("huawei")) {
			return new HuaweiMete60();
		}
		return null;
	}

	@Override
	public Pad createPad(String padType) {
		return null;
	}

}

class PadFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String phoneType) {
		return null;
	}

	@Override
	public Pad createPad(String padType) {
		if (padType == null) {
			return null;
		}
		if (padType.equals("ipad")) {
			return new Ipad();
		} else if (padType.equals("metepad")) {
			return new MetePad();
		}
		return null;

	}
}

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory phoneFactory = new PhoneFactory();
		Phone iphone = phoneFactory.createPhone("iphone");
		iphone.createPhone();
		AbstractFactory padFactory = new PadFactory();
		Pad metepad = padFactory.createPad("metepad");
		metepad.createPad();
	}
}
