package comp2931.cwk1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateTest {

  private Date januaryFirst;
  private Date firstDay;
  private Date lastDay;
  private Date day139;


  @Before
  public void setUp() {
    januaryFirst = new Date(2017, 1, 1);
    firstDay = new Date(2017, 1, 1);
    lastDay = new Date(2017, 12, 31);
    day139 = new Date(2017, 5, 19);

  }

@Test
public void toStringTest() {
  Date januaryFirst = new Date(2017, 1, 1);
    assertThat(januaryFirst.toString(), is("2017-01-01"));
    assertThat(day139.toString(), is("2017-05-19"));
  }

@Test
public void dayNumber()
{
  assertThat(firstDay.getDayOfYear(), is(1));
  assertThat(lastDay.getDayOfYear(), is(365));
  assertThat(day139.getDayOfYear(), is(139));
}

  @Test(expected=IllegalArgumentException.class)
  public void yearTooLow() {
    new Date(-1, 1, 1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void monthTooLow() {
    new Date(2017, -1, 1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void dayTooLow() {
    new Date(2017, 1, -1);
  }


  @Test(expected=IllegalArgumentException.class)
  public void monthTooHigh() {
    new Date(2017, 13, 1);
  }

  @Test(expected=IllegalArgumentException.class)
  public void dayTooHigh() {
    new Date(2017, 1, 32);
  }

  @Test(expected=IllegalArgumentException.class)
  public void februaryTwenNine() {
    new Date(2017, 2, 29);
  }

  @Test
  public void equality() {
    assertTrue(januaryFirst.equals(januaryFirst));
    assertTrue(januaryFirst.equals(new Date(2017, 1, 1)));
    assertFalse(januaryFirst.equals(new Date(2017, 1, 2)));

  }


}
