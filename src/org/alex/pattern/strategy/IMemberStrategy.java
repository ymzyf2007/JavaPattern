package org.alex.pattern.strategy;

/**
 * 策略类
 *
 */
public interface IMemberStrategy {
	
	/**
	 * 计算图书的价格
	 * @param booksPrice	图书的原价
	 * @return	计算出打折后的价格
	 */
	double calcPrice(double booksPrice);

}