package com.github.cgdon.jexpr.core;

import com.github.cgdon.jexpr.core.expr.Variable;
import com.github.cgdon.jexpr.ext.impl.Rand2Function;
import com.github.cgdon.jexpr.ext.impl.RandFunction;
import com.github.cgdon.jexpr.ext.impl.TripleFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 成国栋 on 2017-07-23 00:41:00.
 */
public class ParserTest {
  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void parse() throws Exception {
    Parser parser = new Parser();

    parser.registerFunction(TripleFunction.class);
    parser.registerFunction(RandFunction.class);
    parser.registerFunction(Rand2Function.class);

    System.out.println(parser.parseString("triple(min(10,40))").value());
    System.out.println(parser.parseString("rand()").value());
    System.out.println(parser.parseString("rand1(4,7)").value());
    System.out.println(parser.parseString("rand1(0.4,0.7)").value());
    System.out.println(parser.parseString("rand1(15000,30000)").value());
    Variable.make("visit_user").setValue(25000);
    for (int i = 0; i < 2; i++) {
      double v = parser.parseString("rand1(14800,min(29200,visit_user))").value();
      System.out.println(v);
      if (v < 14800 || v > 25000) {
        throw new RuntimeException("bug");
      }
    }
  }

}
