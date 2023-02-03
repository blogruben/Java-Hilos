package org.ruben.java.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class FiltroLog extends Filter<ILoggingEvent> {

  @Override
  public FilterReply decide(ILoggingEvent event) {    
    
    if (event.getMessage().contains("Ruben")) {
      System.out.println(event.getMarker());
      return FilterReply.ACCEPT;
    } else {
      return FilterReply.DENY;
    }
  }
}