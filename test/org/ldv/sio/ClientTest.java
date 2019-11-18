package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;

  @Before
  public void initializeEachTest() {
    Adresse domicile = new Adresse("3 rue du clocher", "Melun", 77000);
    this.c = new Client("Dijkstra", "Edsger", domicile, null);
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }

  @Test
  public void testSansLivraison() {//C]b)Test Unitaire 1
    assertNull(null, this.c.getLivraison());
  }
  @Test
  public void testDomicileRue() {
    assertEquals("3 rue du clocher", this.c.getDomicile().rue);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientTest that = (ClientTest) o;
    return Objects.equals(c, that.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }
}