package it.fattureincloud.sdk.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests for Scope */
public class ScopeTest {
  @BeforeEach
  public void init() {}

  /** Tests for Scope */
  @Test
  public void testScope() {
    Scope s = Scope.ISSUED_DOCUMENTS_INVOICES_ALL;
    assertEquals("issued_documents.invoices:a", s.getScope());

    s = Scope.SETTINGS_READ;
    assertEquals("settings:r", s.getScope());
  }
}
