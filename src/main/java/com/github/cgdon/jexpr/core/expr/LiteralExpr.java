package com.github.cgdon.jexpr.core.expr;

import com.github.cgdon.jexpr.core.Expr;

/**
 * Created by 成国栋 on 2017-07-22 23:34:00.
 */
public class LiteralExpr extends Expr {
  double v;

  public LiteralExpr(double v) {
    this.v = v;
  }

  public double value() {
    return v;
  }
}
