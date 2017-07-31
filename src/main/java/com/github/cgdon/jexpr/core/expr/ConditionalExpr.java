package com.github.cgdon.jexpr.core.expr;

import com.github.cgdon.jexpr.core.Expr;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 成国栋 on 2017-07-22 23:34:00.
 */
public class ConditionalExpr extends Expr {
  Expr test, consequent, alternative;

  public ConditionalExpr(Expr test, Expr consequent, Expr alternative) {
    this.test = test;
    this.consequent = consequent;
    this.alternative = alternative;
  }

  public double value() {
    return test.value() != 0 ? consequent.value() : alternative.value();
  }

  public Expr getTest() {
    return test;
  }

  public Expr getConsequent() {
    return consequent;
  }

  public Expr getAlternative() {
    return alternative;
  }

  @Override
  public List<Expr> childExpr() {
    return Arrays.asList(test, consequent, alternative);
  }
}
