package com.marksheet;

import com.marksheet.data.MarksheetData;
import com.marksheet.data.MarksheetRepository;
import com.marksheet.model.Semester;
import com.marksheet.service.InputService;
import com.marksheet.service.MarksheetService;

public class Main {

    public static void main(String[] args) {

        MarksheetRepository<Semester> repository =
                new MarksheetRepository<>();

        repository.add(MarksheetData.getSemester1());
        repository.add(MarksheetData.getSemester2());
        repository.add(MarksheetData.getSemester3());
        repository.add(MarksheetData.getSemester4());
        repository.add(MarksheetData.getSemester5());
        repository.add(MarksheetData.getSemester6());

        InputService inputService = new InputService();

        System.out.println("""
                
                ================================================================
                         MARKSHEET DISPLAY SYSTEM
                ================================================================
                Student : DARSHAN HITESH JAIN
                Reg. No.: 23BCON1827
                ================================================================
                
                Select a semester:
                1. Semester 1
                2. Semester 2
                3. Semester 3
                4. Semester 4
                5. Semester 5
                6. Semester 6
                ================================================================
                Enter semester number:
                """);

        /*
         * Wait for the user's first selection.
         * If nothing is entered for 20 seconds,
         * start automatically from Semester 1.
         */
        String input = inputService.getInputWithin20Seconds();

        int currentSemester;

        if (input == null) {

            currentSemester = 1;

            System.out.println(
                    "\nNo input received. Starting from Semester 1."
            );

        } else {

            currentSemester = parseSemester(input);

            if (currentSemester == -1) {

                currentSemester = 1;

                System.out.println(
                        "\nInvalid input. Starting from Semester 1."
                );
            }
        }

        /*
         * Display semesters from the selected semester onward.
         *
         * If the user enters a semester during the 20-second
         * waiting period, that semester will be displayed.
         *
         * If there is no input for 20 seconds, the next
         * semester will be displayed automatically.
         */
        while (currentSemester <= 6) {

            Semester semester = switch (currentSemester) {

                case 1 -> repository.get(0);
                case 2 -> repository.get(1);
                case 3 -> repository.get(2);
                case 4 -> repository.get(3);
                case 5 -> repository.get(4);
                case 6 -> repository.get(5);

                default -> repository.get(0);
            };

            System.out.println(
                    "\nDisplaying Semester "
                    + semester.getSemesterNumber()
                    + "..."
            );

            MarksheetService.displaySemester(semester);

            /*
             * Semester 6 is the last semester.
             * After displaying it, terminate the program.
             */
            if (currentSemester == 6) {

                System.out.println(
                        "\nAll semesters completed. Exiting..."
                );

                inputService.shutdown();
                break;
            }

            System.out.println("""
                    
                    ------------------------------------------------
                    Enter another semester number within 20 seconds.
                    If no input is given, the next semester will
                    be displayed automatically.
                    ------------------------------------------------
                    """);

            input = inputService.getInputWithin20Seconds();

            /*
             * No input for 20 seconds.
             * Move automatically to the next semester.
             */
            if (input == null) {

                currentSemester++;

                System.out.println(
                        "\n20 seconds completed. Moving to next semester..."
                );

            } else {

                /*
                 * User entered something during the 20-second
                 * waiting period.
                 *
                 * Whatever valid semester the user enters
                 * becomes the next semester.
                 */
                int selectedSemester = parseSemester(input);

                if (selectedSemester != -1) {

                    currentSemester = selectedSemester;

                } else {

                    System.out.println(
                            "\nInvalid semester number. Moving to the next semester."
                    );

                    currentSemester++;
                }
            }
        }
    }

    /*
     * Converts user input into a semester number.
     *
     * Arrow switch syntax is used here as required.
     */
    private static int parseSemester(String input) {

        return switch (input.trim()) {

            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;

            default -> -1;
        };
    }
}