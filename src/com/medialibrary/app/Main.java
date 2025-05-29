package com.medialibrary.app;

import com.medialibrary.domain.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputManual = new Scanner(System.in);
        Library library = new Library();
        UserInterface ui = new UserInterface(inputManual, library);
        char userChoiceCommand = ' ';

        System.out.println("Welcome to Digital Media Library!");
        while (userChoiceCommand != '0') {
            System.out.println("1. Employee");
            System.out.println("2. Member");
            System.out.println("0. Exit");
            System.out.print("> ");
            String userChoiceStr = inputManual.nextLine();

            if (!userChoiceStr.equals("0") && !userChoiceStr.equals("1") && !userChoiceStr.equals("2")) {
                System.out.println("Invalid command, please try again (Or 0 to exit): ");
                System.out.println();
                continue;
            }
            userChoiceCommand = userChoiceStr.charAt(0);

            if (userChoiceCommand == '1' || userChoiceCommand == '2') {
                break;
            }
        }

        if (userChoiceCommand == '0') {
            System.out.println("Exiting application. Goodbye!");
            return;
        }

        if (userChoiceCommand == '1') {
            System.out.println("\n-- Librarian Session Starting --");
            ui.handleLibrarianSession();
        } else {
            System.out.println("\n-- Member Session Starting --");
            ui.handleMemberSession();
        }

    }

}