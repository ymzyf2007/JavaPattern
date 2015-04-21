package org.alex.pattern.strategy;

/**
 * 初级会员具体策略类
 *
 */
public class PrimaryMemberStrategy implements IMemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有折扣");
		return booksPrice;
	}

}
