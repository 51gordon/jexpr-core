package com.github.cgdon.jexpr.ext;

import com.github.cgdon.jexpr.core.Expr;

/**
 * 二元函数
 * Created by 成国栋 on 2017-07-22 23:42:00.
 */
public abstract class BinaryFunction extends Function {

  protected Expr rand1;
  protected Expr rand2;

  public BinaryFunction setRand1(Expr rand1) {
    this.rand1 = rand1;
    return this;
  }

  public BinaryFunction setRand2(Expr rand2) {
    this.rand2 = rand2;
    return this;
  }
}
