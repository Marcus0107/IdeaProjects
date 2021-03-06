package com.cedarsoft.otec;

/**
 * Contains a list of invoices for one day
 *
 * @author Johannes Schneider (<a href="mailto:js@cedarsoft.com">js@cedarsoft.com</a>)
 */
public class Journal extends HasValueParent {
  private final String description;

  public Journal( String description ) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void addChild( HasValue hasValue ) {
    this.children.add( hasValue );
  }
}
