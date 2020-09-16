public class Loops {
    public static void main(String[] args) {

        myNumbers();
        newNumber();
        enterNumber();
        String [] names = {"Matt", "Betty", "Noah"};
        userName(names);

    }


    /*

    Part 1

    Create a method containing a for loop that logs numbers 1 to 10.
    Create methods for a while and a do-while loop that do the same.
    Submit this as a repository and not a gist.

    Part 2

    Create an array of users. Create a method with a for-each loop that
    prints a welcome for each user in the array. It should print "Welcome," plus the user's name.

    Part 3

    Netflix's app uses a Media class to create movie and tv show objects.
    Create a Media class with the following properties:

    title
    length in minutes
    an array of actors

    Create a constructor, setters, and getters.

    Bonus (5 points)

    Create 3 media objects that are an instance of the Media class.

     */

    public static void myNumbers() {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }

    public static void newNumber() {
        int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void enterNumber() {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10) ;

    }



    public static void userName(String [] names) {
        for(String user: names) {
            System.out.println("Welcome," + user);

        }
    }

}

