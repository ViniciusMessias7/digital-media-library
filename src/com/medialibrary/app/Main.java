package com.medialibrary.app;

import com.medialibrary.domain.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        char command = ' ';

        System.out.println("### Media Library v1.0 ###");
        while (command != '0') {
            System.out.println("1. Add new media item");
            System.out.println("2. List all medias item");
            System.out.println("3. Find media item by title");
            System.out.println("4. Remove media item by title");
            System.out.println("0. Exit");
            System.out.print("> ");
            String userInput = input.nextLine();
            if (userInput.length() != 1) {
                System.out.println("\nInvalid command, please try again:\n");
                continue;
            }
            command = userInput.charAt(0);

            switch (command) {
                case '1':
                    char instruction = ' ';
                    System.out.println("\n--- Add New Media Item ---");
                    while (instruction != '0') {
                        System.out.println("What type of media would you like to add?");
                        System.out.println("1. Book");
                        System.out.println("2. Movie");
                        System.out.println("3. Music Album");
                        System.out.println("0. Exit and return to main menu");
                        System.out.print("> ");
                        String typeChoiceStr = input.nextLine();
                        if (typeChoiceStr.length() != 1) {
                            System.out.println("\nInvalid command, please try again:\n");
                            continue;
                        }
                        instruction = typeChoiceStr.charAt(0);
                        switch (instruction) {
                            case '1':
                                System.out.println("\nLet's add a book.");

                                String title1 = promptAndReadTitle(input);

                                int yearOfPublication1 = promptAndReadYear(input);

                                System.out.print("ISBN: ");
                                String isbn = input.nextLine();

                                System.out.print("Publisher: ");
                                String publisher = input.nextLine();

                                Book book = new Book(title1, yearOfPublication1, isbn, publisher);
                                System.out.println("Book added successfully!");
                                library.addMediaItem(book);
                                instruction = '0';
                                break;
                            case '2':
                                System.out.println("\nLet's add a movie.");

                                String title2 = promptAndReadTitle(input);

                                int yearOfPublication2 = promptAndReadYear(input);

                                System.out.print("Director: ");
                                String director = input.nextLine();

                                System.out.print("Duration of the movie: ");
                                int durationInMinutes = input.nextInt();
                                input.nextLine();

                                Movie movie = new Movie(title2, yearOfPublication2, director, durationInMinutes);
                                System.out.println("movie added successfully!");
                                library.addMediaItem(movie);
                                instruction = '0';
                                break;
                            case '3':
                                System.out.println("\nLet's add a music album.");

                                String title3 = promptAndReadTitle(input);

                                int yearOfPublication3 = promptAndReadYear(input);

                                System.out.print("Artist: ");
                                String artist = input.nextLine();

                                System.out.print("Tracks: ");
                                int tracks = input.nextInt();
                                input.nextLine();

                                MusicAlbum musicAlbum = new MusicAlbum(title3, yearOfPublication3, artist, tracks);
                                System.out.println("Music album added successfully!");
                                library.addMediaItem(musicAlbum);
                                instruction = '0';
                                break;
                            default:
                                System.out.println("\nInvalid option, please try again.\n");
                                break;
                        }
                    }
                    System.out.println();
                    break;
                case '2':
                    library.showMedias();
                    System.out.println();
                    break;
                case '3':
                    System.out.print("Title: ");
                    MediaItem foundItem = library.findMediaItemByTitle(input.nextLine());
                    if (foundItem == null) {
                        System.out.println("Media item not found.");
                    } else {
                        System.out.println("Found " + foundItem);
                    }
                    System.out.println();
                    break;
                case '4':
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
                    System.out.println("Exiting Media Library. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option, please try again.\n");
                    break;
            }

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

}
