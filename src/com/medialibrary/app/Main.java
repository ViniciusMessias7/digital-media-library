package com.medialibrary.app;

import com.medialibrary.domain.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        char userChoiceCommand = ' ';

        System.out.println("Welcome to Digital Media Library!");
        while (userChoiceCommand != '0') {
            System.out.println("1. Employee");
            System.out.println("2. Member");
            System.out.println("0. Exit");
            System.out.print("> ");
            String userChoiceStr = input.nextLine();

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
            handleLibrarianSession(input, library);
        } else {
            System.out.println("\n-- Member Session Starting --");
            handleMemberSession(input, library);
        }

    }

    private static String promptAndReadTitle(Scanner input) {
        System.out.print("Title: ");
        return input.nextLine();
    }

    private static int promptAndReadYear(Scanner input) {
        System.out.print("Year of publication: ");
        int yearOfPublication = input.nextInt();
        input.nextLine();
        return yearOfPublication;
    }

    private static void handleLibrarianSession(Scanner input, Library library) {
        char command = ' ';
        while (command != '0') {
            System.out.println("1. Add new media item");
            System.out.println("2. Remove media item by title");
            System.out.println("0. Exit");
            System.out.print("> ");
            String userChoiceStr = input.nextLine();
            if (!userChoiceStr.equals("0") && !userChoiceStr.equals("1") && !userChoiceStr.equals("2")) {
                System.out.println("Invalid command, please try again (Or 0 to exit): ");
                System.out.println();
                continue;
            }
            command = userChoiceStr.charAt(0);

            switch (command) {
                case '1':
                    char instruction = ' ';

                    System.out.println("\n--- Add New Media Item ---");
                    while (instruction != '0') {
                        System.out.println("What type of media would you like to add?");
                        System.out.println("1. Book");
                        System.out.println("2. Movie");
                        System.out.println("3. Music Album");
                        System.out.println("0. Exit and return to menu");
                        System.out.print("> ");
                        String typeChoiceStr = input.nextLine();

                        if (!typeChoiceStr.equals("0") && !typeChoiceStr.equals("1") && !typeChoiceStr.equals("2") && !typeChoiceStr.equals("3")) {
                            System.out.println("Invalid command, please try again (Or 0 to exit): ");
                            System.out.println();
                            continue;
                        }
                        instruction = typeChoiceStr.charAt(0);

                        switch (instruction) {
                            case '1':
                                MediaItem book = createNewBookFromUserInput(input);
                                System.out.println("Book added successfully!");

                                library.addMediaItem(book);

                                instruction = '0';
                                System.out.println();
                                break;
                            case '2':
                                MediaItem movie = createNewMovieFromUserInput(input);
                                System.out.println("movie added successfully!");

                                library.addMediaItem(movie);

                                instruction = '0';
                                System.out.println();
                                break;
                            case '3':
                                MediaItem musicAlbum = createNewMusicAlbumFromUserInput(input);
                                System.out.println("Music album added successfully!");

                                library.addMediaItem(musicAlbum);

                                instruction = '0';
                                System.out.println();
                                break;
                            case '0':
                                System.out.println("Addition canceled");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case '2':
                    System.out.print("Title: ");
                    MediaItem removeItem = library.removeMediaItemByTitle(input.nextLine());
                    if (removeItem == null) {
                        System.out.println("This media don't exist!");
                    } else {
                        System.out.println("Removed " + removeItem);
                    }
                    System.out.println();
                    break;
                case '0':
                    System.out.println("Exiting session Librarian. Goodbye!");
                    break;
            }
        }

    }

    private static void handleMemberSession(Scanner input, Library library) {
        char command = ' ';
        while (command != '0') {
            System.out.println("1. List all medias item");
            System.out.println("2. Find media item by title");
            System.out.println("0. Exit");
            System.out.print("> ");
            String userChoiceStr = input.nextLine();
            if (!userChoiceStr.equals("0") && !userChoiceStr.equals("1") && !userChoiceStr.equals("2")) {
                System.out.println("Invalid command, please try again (Or 0 to exit): ");
                System.out.println();
                continue;
            }
            command = userChoiceStr.charAt(0);
            switch (command) {
                case '1':
                    library.showMedias();
                    System.out.println();
                    break;
                case '2':
                    System.out.print("Title: ");
                    MediaItem foundItem = library.findMediaItemByTitle(input.nextLine());
                    if (foundItem == null) {
                        System.out.println("Media item not found.");
                    } else {
                        System.out.println("Found " + foundItem);
                    }
                    System.out.println();
                    break;
                case '0':
                    System.out.println("Exiting session member. Goodbye!");
                    break;
            }

        }
    }

    private static Book createNewBookFromUserInput(Scanner input) {
        System.out.println("\nLet's add a book");

        String title = promptAndReadTitle(input);

        int yearOfPublication = promptAndReadYear(input);

        System.out.print("ISBN: ");
        String isbn = input.nextLine();

        System.out.print("Publisher: ");
        String publisher = input.nextLine();

        return new Book(title, yearOfPublication, isbn, publisher);
    }

    private static Movie createNewMovieFromUserInput(Scanner input) {
        System.out.println("\nLet's add a movie.");

        String title = promptAndReadTitle(input);

        int yearOfPublication = promptAndReadYear(input);

        System.out.print("Director: ");
        String director = input.nextLine();

        System.out.print("Duration of the movie: ");
        int durationInMinutes = input.nextInt();
        input.nextLine();

        return new Movie(title, yearOfPublication, director, durationInMinutes);
    }

    private static MusicAlbum createNewMusicAlbumFromUserInput(Scanner input) {
        System.out.println("\nLet's add a music album.");

        String title = promptAndReadTitle(input);

        int yearOfPublication = promptAndReadYear(input);

        System.out.print("Artist: ");
        String artist = input.nextLine();

        System.out.print("Tracks: ");
        int tracks = input.nextInt();
        input.nextLine();

        return new MusicAlbum(title, yearOfPublication, artist, tracks);
    }
}