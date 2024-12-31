package com.evan.spring.designpattern.factorymethod;

/**
 * 工厂方法模式  产品接口 - 具体产品 - 工厂接口 - 具体工厂
 *
 * 适用场景：
 *
 * 客户只知道创建产品的工厂名，不知道具体的产品名
 *
 * 创建的任务由多个具体子工厂的某一个完成，而抽象工厂只提供创建产品的接口
 *
 * 客户也不关心创建产品的细节，只关心产品的品牌
 *
 * */


// 产品接口
interface Shape {
	void draw();
}

// 具体产品
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing a circle");
	}
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("drawing a rectangle");
	}
}

// 工厂接口
interface ShapeFactory {
	Shape createShape();
}

class CircleFactory implements ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}
}

class RectangleFactory implements ShapeFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}
}





public class FactoryMethod {
	public static void main(String[] args) {
		ShapeFactory circleFactory = new CircleFactory();
		Shape circle = circleFactory.createShape();
		circle.draw();
		ShapeFactory rectangleFactory = new RectangleFactory();
		Shape rectangle = rectangleFactory.createShape();
		rectangle.draw();
	}

}
