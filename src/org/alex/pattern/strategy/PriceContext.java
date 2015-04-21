package org.alex.pattern.strategy;

/**
 * 环境（Context）角色
 * 为什么一定要存在环境角色呢，考虑如下情况
 *  1、如果我们需要对不同策略中相同算法的参数，执行相同的安全性检查，我们如果没有环境角色Context，则只能在每个实现的开始部分，调用安全性检查代码；而有了Context这个角色，我们可以在调用Context的构造器时，统一进行安全性检查。可以大量减少冗余的代码量。 
 *
 */
public class PriceContext {

	private IMemberStrategy strategy;	// 策略类
	
	public PriceContext(IMemberStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * 计算图书价格
	 * @param booksPrice
	 * @return
	 */
	public double calcPrice(double booksPrice) {
		return strategy.calcPrice(booksPrice);
	}
	
}