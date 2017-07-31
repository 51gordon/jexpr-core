package com.github.cgdon.jexpr.ext;

import com.github.cgdon.jexpr.core.Expr;

import java.util.Arrays;
import java.util.List;

/**
 * 二元函数
 * Created by 成国栋 on 2017-07-22 23:42:00.
 */
public abstract class BinaryFunction extends Function {

  protected Expr rand0;
  protected Expr rand1;

  public Expr getRand0() {
    return rand0;
  }

  public Expr getRand1() {
    return rand1;
  }

  public BinaryFunction setRand0(Expr rand0) {
    this.rand0 = rand0;
    return this;
  }

  public BinaryFunction setRand1(Expr rand1) {
    this.rand1 = rand1;
    return this;
  }

  @Override
  public List<Expr> childExpr() {
    return Arrays.asList(rand0, rand1);
  }
}
