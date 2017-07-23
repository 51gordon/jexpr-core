package com.github.cgdon.jexpr.ext.impl;

import com.github.cgdon.jexpr.ext.VoidFunction;

import java.util.Random;

/**
 * 随机函数，生成0-1之间的随机数
 * Created by 成国栋 on 2017-07-23 15:41:00.
 */
public class RandFunction extends VoidFunction {
  public String name() {
    return "rand";
  }

  public double value() {
    return new Random().nextDouble();
  }
}
