package org.folio.okapi.common;

import org.junit.Test;
import static org.junit.Assert.*;

public class UrlDecoderTest {

  @Test
  public void t1() {
    assertEquals("a/b", UrlDecoder.decode("a%2Fb"));
    assertEquals("1-2", UrlDecoder.decode("1-2"));
    assertEquals("1 2", UrlDecoder.decode("1+2"));
    assertEquals("1 2", UrlDecoder.decode("1+2", true));
    assertEquals("1+2", UrlDecoder.decode("1+2", false));
    assertEquals("1+2", UrlDecoder.decode("1+2", false));
    assertEquals("1 2 3", UrlDecoder.decode("1+2+3", true));
  }

}
