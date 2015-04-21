package org.alex.pattern.strategy;

/**
 * 高级会员具体策略类
 *
 */
public class AdvancedMemberStrategy implements IMemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于高级会员的折扣为20%");
		return booksPrice * 0.8;
	}

}