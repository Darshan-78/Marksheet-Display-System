package com.marksheet.service;

import com.marksheet.model.Semester;
import com.marksheet.model.Subject;

public class MarksheetService {

    public static void displaySemester(Semester semester) {

        StringBuilder output = new StringBuilder();

        output.append("""
                
                ================================================================
                                  GRADE CARD
                ================================================================
                University: JECRC University (Jaipur)
                School  : School of Engineering and Technology
                Degree  : Bachelor of Technology
                Name    : DARSHAN HITESH JAIN
                Reg. No.: 23BCON1827
                Father  : HITESH JAIN
                ----------------------------------------------------------------
                Semester: %d
                ----------------------------------------------------------------
                %-12s %-50s %-8s %-8s
                ----------------------------------------------------------------
                """.formatted(
                    semester.getSemesterNumber(),
                    "Code",
                    "Subject",
                    "Credits",
                    "Grade"
                ));

        for (Subject subject : semester.getSubjects()) {

            output.append(
                "%-12s %-50s %-8d %-8s%n".formatted(
                    subject.getCode(),
                    subject.getName(),
                    subject.getCredits(),
                    subject.getGrade()
                )
            );
        }

        output.append("""
                ----------------------------------------------------------------
                Total Credits : %d
                SGPA          : %.2f
                Credits Earned: %d
                ================================================================
                """.formatted(
                    semester.getTotalCredits(),
                    semester.getSgpa(),
                    semester.getTotalCredits()
                ));

        System.out.println(output);
    }
}