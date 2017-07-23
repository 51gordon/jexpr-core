package com.github.cgdon.jexpr.ext;

import com.github.cgdon.jexpr.core.Expr;

/**
 * 一元函数
 * Created by 成国栋 on 2017-07-22 23:42:00.
 */
public abstract class UnaryFunction extends Function {
  protected Expr rand;

  public UnaryFunction setRand(Expr rand) {
    this.rand = rand;
    return this;
  }
}
