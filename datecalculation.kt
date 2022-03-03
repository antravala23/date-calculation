package com.e.datecalculation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.joda.time.DateTime
import org.joda.time.DateTimeConstants
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter

//gradle dependancy
//implementation 'joda-time:joda-time:2.10.5'

class DateExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val cal = Calendar.getInstance()

//        val dformat = SimpleDateFormat("dd/MM/yyyy")

        val pattern: DateTimeFormatter = DateTimeFormat.forPattern("dd/MM/yyyy")

        var startdate: DateTime = pattern.parseDateTime("05/01/2020")
        val enddate: DateTime = DateTime.now()

        println("date 7 day after....................." + enddate.plusDays(10))
        println("date 7 day before....................." + enddate.minusWeeks(1))

        val mondays = 0
        var loopcount = 0

        //Total Days/year/hour/min/weeks/months/seconds.................................................
//        val diffmilli = enddate - startdate
//
//        val diff = diffmilli.toString()
//        val days = (diffmilli/(1000*60*60*24)).toString()
//
//        println("total days....................." + (days.toDouble()/365))
//
        //Total Monday..............................................................................
//        while (startdate.isBefore(enddate)) {
//            if (startdate.dayOfWeek == DateTimeConstants.MONDAY) {
//                mondays++
//            }
//
//            loopcount++
//                cal.add(Calendar.DATE, 1)
//            startdate = startdate.plusDays(1)
//        }
//
//        println("total mondays....................." + mondays)
//        println("total loop....................." + loopcount)

        //Last Monday of every month/week/year..........................................................
        while (startdate.isBefore(enddate)) {

            println(
                "total last mondays....................." + startdate.dayOfMonth().withMaximumValue().dayOfWeek().setCopy(
                    DateTimeConstants.MONDAY
                )
            )

            loopcount++
            startdate = startdate.plusMonths(1)
        }

        println("total last mondays.....................$mondays")
        println("total loop.....................$loopcount")

    }
}
