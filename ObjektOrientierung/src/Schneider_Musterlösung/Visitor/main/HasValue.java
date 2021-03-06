package com.cedarsoft.otec;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public interface HasValue {
  Money getValue();

  void accept( HasValueVisitor visitor );
}
