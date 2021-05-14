package org.apache.ibatis.reflection;

import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.junit.jupiter.api.Test;

/**
 * Desc:
 *
 * @author wujw
 * @email jiwenwu@outlook.com
 * @date 2021/5/13
 */
public class PropertyTokenizerTest {
  @Test
  public void test(){
    PropertyTokenizer propertyTokenizer = new PropertyTokenizer("map[1].name");
    System.out.println(propertyTokenizer.getName());
    System.out.println(propertyTokenizer.getIndex());
    System.out.println(propertyTokenizer.getChildren());
    if (propertyTokenizer.hasNext()){
      final PropertyTokenizer next = propertyTokenizer.next();
      System.out.println(next.getName());
      System.out.println(next.getIndex());
      System.out.println(next.getChildren());
    }
  }
}
