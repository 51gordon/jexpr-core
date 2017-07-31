package com.github.cgdon.jexpr.ext.impl;

import com.github.cgdon.jexpr.ext.BinaryFunction;

import java.util.Random;

/**
 * 随机函数，需要2个参数，生成介于这两个数之间的随机数
 * Created by 成国栋 on 2017-07-23 15:41:00.
 */
public class Rand2Function extends BinaryFunction {
  public String name() {
    return "rand2";
  }

  public double value() {
    double v0 = rand0.value();
    double v1 = rand1.value();

    return v0 + (v1 - v0) * new Random().nextDouble();
  }

}
