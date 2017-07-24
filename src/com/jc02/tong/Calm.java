package com.jc02.tong;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 岁月是一场有去无回的旅行.
 */
public class Calm {

        private static int[] DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        public static void main(String[] args) {

            long l1 = System.currentTimeMillis();
            List data = rili(1900, 1, 1900, 12);
            long l2 = System.currentTimeMillis();

            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i));
            }
            System.out.println((l2 - l1) + "MS");
        }

        private static List rili(int startYear, int startMonth, int endYear, int endMonth) {

            if (startYear > endYear || (startYear == endYear && startMonth > endMonth)) {
                return null;
            }
            List data = new ArrayList();

            for (int ii = startYear; ii <= endYear; ii++) {

                int startM = startMonth - 1;
                int endM = endMonth - 1;

                if (startYear < endYear) {
                    if (ii == endYear) {
                        endM = 11;
                    } else {
                        startM = 0;
                    }
                }
                for (int i = startM; i <= endM; i++) {
                    data.add("-----------------------" + ii + "年" + (i + 1) + "月-----------------------");
                    data.add("日\t一\t二\t三\t四\t五\t六");

                    int day = days(ii, i);
                    StringBuffer buf = new StringBuffer();
                    int idx = 1;
                    while (idx <= day) {
                        int len = 0;
                        if (idx == 1) {
                            Calendar c = Calendar.getInstance();
                            c.set(ii, i, idx);
                            int xingqi = c.get(Calendar.DAY_OF_WEEK);
                            len = getLen(xingqi);
                            buf.append(addBlank(len));
                        }
                        buf.append(idx++);
                        for (int k = len + 1; k < 7; k++) {
                            if (idx > day) {
                                break;
                            }
                            buf.append("\t" + (idx++));
                        }
                        buf.append("\n");
                    }
                    data.add(buf);
                }
            }
            return data;
        }

        private static StringBuffer addBlank(int len) {
            StringBuffer buf = new StringBuffer();
            for (int index = 0; index < len; index++) {
                buf.append("\t");
            }
            return buf;
        }

        private static int getLen(int xingqi) {
            return xingqi == Calendar.SUNDAY ? 0 : xingqi - 1;
        }

        public static int days(int year, int month) {

            if (month != 1) {
                return DAYS[month];
            }

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return 29;
            }
            return DAYS[month];
        }
    }



