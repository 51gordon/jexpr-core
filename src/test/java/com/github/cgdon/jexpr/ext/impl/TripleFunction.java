package com.github.cgdon.jexpr.ext.impl;

import com.github.cgdon.jexpr.ext.UnaryFunction;

/**
 * Created by 成国栋 on 2017-07-23 00:33:00.
 */
public class TripleFunction extends UnaryFunction {

  public String name() {
    return "triple";
  }

  public double value() {
    return 3 * rand.value();
  }
}
