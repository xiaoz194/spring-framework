package com.evan.spring.designpattern.simplefactory;

/**
 * 简单工厂： 产品接口  -》 具体产品 -》工厂类
 *
 * 适用场景：
 *
 * 当一个系统只需要一个具体对象，无需对产品对象进行扩展时   如 一个简单的日志记录器，系统只需要一种日志记录方式，不需要对日志记录器进行扩展
 *
 * 当客户端不需要知道对象的创建过程，只需要知道如何使用对象时  直接调简单工厂创建对象
 *
 * 当需要对 对象的创建过程 进行集中管理和控制时
 *
 * **/

// 产品接口
interface Shape {
	void Draw();
}


// 具体产品
class Circle implements Shape {

	@Override
	public void Draw() {
		System.out.println("drawing a circle");
	}
}

class Rectangle implements Shape {

	@Override
	public void Draw() {
		System.out.println("drawing a rectangle");
	}
}

// 工厂类
class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals("circle")) {
			return new Circle();
		} else if (shapeType.equals("rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}

public class SimpleFactory {
	public static void main(String[] args) {
		Shape circle = ShapeFactory.getShape("circle");
		circle.Draw();
		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.Draw();
	}





}
