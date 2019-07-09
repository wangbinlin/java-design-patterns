/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwater.strategy2;

import com.iluwater.strategy2.*;
import com.iluwater.strategy2.DragonSlayingStrategy;
import com.iluwater.strategy2.MeleeStrategy;
import com.iluwater.strategy2.ProjectileStrategy;
import com.iluwater.strategy2.SpellStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The Strategy pattern (also known as the policy pattern) is a software design pattern that enables
 * an algorithm's behavior to be selected at runtime.
 * <p>
 * Before Java 8 the Strategies needed to be separate classes forcing the developer
 * to write lots of boilerplate code. With modern Java it is easy to pass behavior
 * with method references and lambdas making the code shorter and more readable.
 * <p>
 * In this example ({@link DragonSlayingStrategy}) encapsulates an algorithm. The containing object
 * ({@link DragonSlayer}) can alter its behavior by changing its strategy2.
 * 
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
  
  /**
   * 将上面的示例改成简单工厂+ 策略模式，但是并不好。
   * 因为如果要增加杀龙策略，需要在简单工厂上下文中修改代码，违背了开闭原则。
   * 所以还是上面一个示例比较好，提供上下文为具体实例化策略提供执行,将策略的创建放在客户端。
   * 缺点:策略的创建移到了客户端。
   * 
   * @param args command line args
   */
  public static void main(String[] args) {
    // GoF Strategy pattern
    LOGGER.info("Green dragon spotted ahead!");
    DragonSlayerContext dragonSlayer = new DragonSlayerContext("MeleeStrategy");
    dragonSlayer.goToBattle();
    LOGGER.info("Red dragon emerges.");
    DragonSlayerContext dragonSlayer2 = new DragonSlayerContext("ProjectileStrategy");
    dragonSlayer2.goToBattle();
    LOGGER.info("Black dragon lands before you.");
    DragonSlayerContext dragonSlayer3 = new DragonSlayerContext("SpellStrategy");
    dragonSlayer3.goToBattle();

  }
}
