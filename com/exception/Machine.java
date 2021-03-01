package com.exception;

public class Machine {
	public void checkBag(Goods goods) throws DangerException {
		if (goods.isDanger) {
			throw new DangerException();
		}
	}
}

