package comp2931.cwk1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateTest {

  private Date januaryFirst;


  @Before
  public void setUp() {
    januaryFirst = new Date(2017, 1, 1);

  }

@Test
public void firstTest() {
  Date januaryFirst = new Date(2017, 1, 1);
    assertThat(januaryFirst.toString(), is("2017-01-01"));

  }
}
