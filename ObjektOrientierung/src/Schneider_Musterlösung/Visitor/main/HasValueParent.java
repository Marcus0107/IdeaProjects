package com.cedarsoft.otec;

import java.util.List;

/**
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public interface HasValueParent extends HasValue {
  List<HasValue> getChildren();
}
