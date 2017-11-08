// Class for COMP2931 Coursework 1

package comp2931.cwk1;


/**
 * Simple representation of a date.
 */
public class Date {

  private int year;
  private int month;
  private int day;

  /**
   * Creates a date using the given values for year, month and day.
   *
   * @param y Year
   * @param m Month
   * @param d Day
   */
  public Date(int y, int m, int d) {

    set(y,m,d);

  }

  /**
   * Returns the year component of this date.
   *
   * @return Year
   */
  public int getYear() {
    return year;
  }

  /**
   * Returns the month component of this date.
   *
   * @return Month
   */
  public int getMonth() {
    return month;
  }

  /**
   * Returns the day component of this date.
   *
   * @return Day
   */
  public int getDay() {
    return day;
  }

  /**
   * Provides a string representation of this date.
   *
   * ISO 8601 format is used (YYYY-MM-DD).
   *
   * @return Date as a string
   */
  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
  }

  private void set(int y, int m, int d) {
    if (y < 0) {
      throw new IllegalArgumentException("year out of range");
    }
    if (m < 0 || m > 12) {
      throw new IllegalArgumentException("month out of range");
    }

    boolean validDay = true;
    switch(m){
      case 1: validDay = d <= 31;
              break;
      case 2: validDay = d <= 28;
              break;
      case 3: validDay = d <= 31;
              break;
      case 4: validDay = d <= 30;
              break;
      case 5: validDay = d <= 31;
              break;
      case 6: validDay = d <= 30;
              break;
      case 7: validDay = d <= 31;
              break;
      case 8: validDay = d <= 31;
              break;
      case 9: validDay = d <= 30;
              break;
      case 10: validDay = d <= 31;
              break;
      case 11: validDay = d <= 30;
              break;
      case 12: validDay = d <= 31;
              break;

    }

    if (d<0||validDay==false) {
      throw new IllegalArgumentException("day out of range");
    }
    else {
      year = y;
      month = m;
      day = d;
    }
  }
  @Override
  public boolean equals(Object other) {
    if (other == this) {
      // 'other' is same object as this one!
      return true;
    }
    else if (! (other instanceof Date)) {
      // 'other' is not a Time object
      return false;
    }
    else {
      // Compare fields
      Date otherDate = (Date) (other);
      return getYear() == otherDate.getYear()
          && getMonth() == otherDate.getMonth()
          && getDay() == otherDate.getDay();
    }
  }

}
