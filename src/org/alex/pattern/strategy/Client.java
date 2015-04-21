package org.alex.pattern.strategy;

public class Client {
	
	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
        IMemberStrategy strategy = new AdvancedMemberStrategy();
        // 创建环境
        PriceContext context = new PriceContext(strategy);
        // 计算价格
        double quote = context.calcPrice(300);
        System.out.println("图书的最终价格为：" + quote);
	}

}