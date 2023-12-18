package n11;

import java.util.Date;

public enum TimeType {
    YEAR, DATE, FULL;
    public static String dateToString(Date date, TimeType timeType) {
        if (timeType == TimeType.YEAR) {
            return String.valueOf(date.getYear() + 1900);
        } else if (timeType == TimeType.DATE) {
            return date.getDate() + " " + date.getMonth();
        } else if (timeType == TimeType.FULL) {
            return dateToString(date, DATE) + " " + dateToString(date, YEAR);
        }
        return null;
    }
}
